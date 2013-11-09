#!/usr/bin/python
import sys
import xml.dom.minidom
import psycopg2
import psycopg2.extras


class modelcreator:
    objects = dict()

    def _forEachChild(self,row,node,sql,prefix):
        theid = row['id']
        self.execute(sql,(self.version,theid))
        rows=self.cur.fetchall()
        for row in rows:
            thetype = row['type']
            if thetype[:10] == 'archimate:':
                etype = "element"
            else:
                etype = thetype
            handler = getattr(self,"%s_%s"%(prefix,etype),None)
            if handler is None:
                print self.dom.toprettyxml()
                raise NotImplementedError, "property handler %s_%s is not implemented"%(prefix,thetype)
            handler(row,node)

    def create_child(self,row,node):
        #FIXME fillcolor textAlignment font fontColor
        node=self.newNode(node,"child")
        sql="select id from object_view where version=%s and target=%s"
        self.execute(sql,(self.version,row['id']))
        tcons=[]
        trows = self.cur.fetchall()
        #print self.cur.query,trows
        for trow in trows:
            tcons.append(trow['id'])
        self.addAttr(node,'targetConnections'," ".join(tcons))
        for (xmlfield,dbfield) in [('id','id'),('xsi:type','type'),('archimateElement','element'),('name','name'),('font','font'),('fontColor','fontcolor'),('textAlignment','textalignment'),('fillColor','fillcolor')]:
            self.addAttr(node,xmlfield,row[dbfield])
        doc=row['documentation']
        self.newNode(node,"content",doc)
        self._forEachChild(row,node,"select * from property_view where version=%s and parent=%s","createprop")
        self._forEachChild(row,node,"select * from object_view where version=%s and parent=%s and id != parent","create")

    def create_element(self,row,node):
        #if row['type'] in ("archimate:DiagramObject","archimate:SketchModelSticky"):
        if row['type'] in ("archimate:DiagramObject","archimate:Group","archimate:SketchModelSticky", "archimate:SketchModelActor"):
            self.create_child(row,node)
            return
        node=self.newNode(node,"element")
        node.setAttribute("xsi:type",row["type"])
        self.addAttr(node,'relationship',row['element'])
        for i in ["id","name","source","target"]:
            self.addAttr(node,i,row[i])
        self.docPropertyAndChildren(row,node)

    def create_folder(self,row,node):
        node=self.newNode(node,"folder")
        theid=row['id']
        if theid in ['business','application','technology','connectors','relations','diagrams']:
            node.setAttribute("type",theid)
            
        for i in ["id","name"]:
            node.setAttribute(i,row[i])
        self.docPropertyAndChildren(row,node)

    def create_sourceConnection(self,row,node):
        node=self.newNode(node,"sourceConnection")
        self.addAttr(node,"xsi:type","archimate:Connection")
        self.addAttr(node,"relationship",row['element'])
        for i in ["id","source","target"]:
            node.setAttribute(i,row[i])
        self.docPropertyAndChildren(row,node)

    def createprop_property(self,row,node):
        node=self.newNode(node,"property")
        for i in ["key","value"]:
            node.setAttribute(i,row[i])

    def createprop_bendpoint(self,row,node):
        node=self.newNode(node,"bendpoint")
        for (xmlfield,dbfield) in [('startX','x1'),('startY','y1'),('endX','x2'),('endY','y2')]:
            self.addAttr(node,xmlfield,row[dbfield])
    def createprop_bounds(self,row,node):
        node=self.newNode(node,"bounds")
        for (xmlfield,dbfield) in [('x','x1'),('y','y1'),('width','x2'),('height','y2')]:
            self.addAttr(node,xmlfield,row[dbfield])

    def addAttr(self,node,name,value):
        if value is not None:
            node.setAttribute(name,"%s"%(value,))

    def addDoc(self,row,node):
        doc=row['documentation']
        if doc is not None:
            self.newNode(node,"documentation",doc)

    def newNode(self,node,name,value=None):
        d=self.dom.createElement(name)
        node.appendChild(d)
        if value is not None:
            tn=self.dom.createTextNode(value)
            d.appendChild(tn)
        return d

    def docPropertyAndChildren(self,row,node):
        self.addDoc(row,node)
        self._forEachChild(row,node,"select * from property_view where version=%s and parent=%s","createprop")
        self._forEachChild(row,node,"select * from object_view where version=%s and parent=%s and id != parent","create")

    def create_model(self,row,node):
        node.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance","xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance")
        node.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance","xmlns:archimate","http://www.bolton.ac.uk/archimate")
        node.setAttribute("version","2.0.0")
        for i in ["id","name"]:
            node.setAttribute(i,row[i])
        self.docPropertyAndChildren(row,node)

    def __init__(self,version,role,service):
        self.con = psycopg2.connect("service=%s"%service)
        self.cur=self.con.cursor(cursor_factory=psycopg2.extras.DictCursor)
        self.execute("set role %s",(role,))
        self.execute("select id from version_view where name=%s",[version])
        self.version=self.cur.fetchone()[0]
        self.execute("select id from object_view where version=%s and parent=id",(self.version,))
        row  = self.cur.fetchone()
        self.rootid = row['id']
        impl = xml.dom.minidom.getDOMImplementation()
        self.dom = impl.createDocument(xml.dom.minidom.XMLNS_NAMESPACE, "archimate:model", None)
        self.execute("select * from object_view where version=%s and id=%s",(self.version,self.rootid))
        row  = self.cur.fetchone()
        self.objects[row["id"]] = row
        self.create_model(row,self.dom.documentElement)
        #print row
        print self.dom.toxml()

    def execute(self,sql,args):
        sys.stderr.write("%s;\n"%(sql%args))
        self.cur.execute(sql,args)
    def __del__(self):
        self.cur.close()
        self.con.close()

if len(sys.argv) < 4:
    print "usage: sqlimport.py <version name> <role> <service>"
    sys.exit(-1)
version = sys.argv[1]
role = sys.argv[2]
service = sys.argv[3]
passw=""
mc = modelcreator(version,role,service)

