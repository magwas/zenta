#!/usr/bin/python
from  xml.dom.minidom import parse

import sys

infile = sys.argv[1]
outfile = sys.argv[2]
policyfile = "/".join(outfile.split('/')[:-1])+'/newpolicy.xml'

class writer:
    def __init__(self,fname):
        self.file=open(fname,"w")
    def write(self,s):
        self.file.write(s)
    def close(self):
        self.file.close()

dom = parse(sys.argv[1])

policy = dom.getElementsByTagName("policy")[0]
w=writer(policyfile)
policy.writexml(w,addindent='  ', newl='\n')
w.close()
print "INFO: policy generated at "+ policyfile
policy.parentNode.removeChild(policy)
o=writer(outfile)
dom.writexml(o,addindent='  ', newl='\n')
o.close()
