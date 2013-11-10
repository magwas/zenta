<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:zenta="http://magwas.rulez.org/zenta" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:template match="/">
        <html>
        <head>
        <title>Zenta Report</title>
        <style type="text/css">
        table { border-collapse:collapse; }
        table, td, th { border:1px solid black; }
        </style>
        </head>
        <body style="font-family:Verdana; font-size:10pt;">
        <h1>Zenta Report</h1>
        <br/>
        <table width="100%" border="0">
        <tr bgcolor="#F0F0F0">
        <td width="20%" valign="top">Name</td>
        <td width="80%" valign="top"><xsl:value-of select="zenta:model/@name"/></td>
        </tr>
        <tr>
        <td valign="top">Date</td>
        <td valign="top" id="date">FIXME fake javascript date instead of fn:current-dateTime()<SCRIPT>
e=document.getElementById('date');
e.innerHTML=Date()
</SCRIPT></td>
        </tr>
        <tr>
        <td valign="top">Purpose</td>
        <td valign="top"><xsl:copy-of select="/zenta:model/purpose"/></td>
        </tr>
        </table>
        <br/>

        <h2>Business Actors</h2>
        <xsl:apply-templates select="//zenta:BusinessActor">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Actor</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:BusinessRole">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Role</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:BusinessInterface">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Interface</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:BusinessCollaboration">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Collaboration</xsl:with-param>
        </xsl:apply-templates>
        <h2>Business Functions</h2>
        <xsl:apply-templates select="//zenta:BusinessFunction">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Function</xsl:with-param>
        </xsl:apply-templates>
        <h2>Business Information</h2>
        <xsl:apply-templates select="//zenta:BusinessObject">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Object</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:Representation">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Representation</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:Meaning">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Meaning</xsl:with-param>
        </xsl:apply-templates>
        <h2>Business Processes</h2>
        <xsl:apply-templates select="//zenta:BusinessActivity">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Activity</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:BusinessEvent">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Event</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:BusinessInteraction">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Interaction</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:BusinessProcess">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Process</xsl:with-param>
        </xsl:apply-templates>
        <h2>Business Products</h2>
        <xsl:apply-templates select="//zenta:Contract">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Contract</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:Product">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Product</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:BusinessService">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Service</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:Value">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Value</xsl:with-param>
        </xsl:apply-templates>
        <h2>Applications</h2>
        <xsl:apply-templates select="//zenta:ApplicationCollaboration">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Collaboration</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:ApplicationComponent">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Component</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:ApplicationFunction">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Function</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:ApplicationInteraction">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Interaction</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:ApplicationInterface">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Interface</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:ApplicationService">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Service</xsl:with-param>
        </xsl:apply-templates>
        <h2>Application Data</h2>
        <xsl:apply-templates select="//zenta:DataObject">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">DataObject</xsl:with-param>
        </xsl:apply-templates>
        <h2>Infrastructures</h2>
        <xsl:apply-templates select="//zenta:Artifact">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Artifact</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:CommunicationPath">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Communication Path</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:Device">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Device</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:Node">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Node</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:InfrastructureInterface">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Infrastructure Interface</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:Network">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Network</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:InfrastructureService">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Infrastructure Service</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:SystemSoftware">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">System Software</xsl:with-param>
        </xsl:apply-templates>
        <h2>Connectors</h2>
        <xsl:apply-templates select="//zenta:Junction">
             <xsl:with-param name="color">#dcebeb</xsl:with-param>
             <xsl:with-param name="type">Junction</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:AndJunction">
             <xsl:with-param name="color">#dcebeb</xsl:with-param>
             <xsl:with-param name="type">And Junction</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//zenta:OrJunction">
             <xsl:with-param name="color">#dcebeb</xsl:with-param>
             <xsl:with-param name="type">Or Junction</xsl:with-param>
        </xsl:apply-templates>
        <h2>Views</h2>
        <xsl:apply-templates select="//zenta:DiagramModel">
             <xsl:with-param name="color">#e0e4e6</xsl:with-param>
             <xsl:with-param name="type">Or Junction</xsl:with-param>
        </xsl:apply-templates>
        </body>
        </html>
    </xsl:template>
    
    <xsl:template match="zenta:DiagramModel">
        <xsl:param name="color" />
        <xsl:param name="type" />
        <table width="100%" border="0">
        <tr bgcolor="{$color}">
        <td width="20%" valign="top">Name</td>
        <td width="80%" valign="top"><xsl:value-of select="./@name" /></td>
        </tr>
        <tr>
        <td valign="top">Documentation</td>
        <td valign="top"><xsl:copy-of select="./documentation" /></td>
        </tr>
       <xsl:for-each select="property">
        <tr><td>
        <xsl:value-of select="./@key" />
        </td><td>
        <xsl:value-of select="./@value" />
        </td></tr>
       </xsl:for-each>
        </table>
        <img src="{./@id}.png" />
        <br/><br/><br/><br/>
    </xsl:template>
    <xsl:template match="zenta:*">
        <xsl:param name="color" />
        <xsl:param name="type" />
        <table width="100%" border="0">
        <tr bgcolor="{$color}">
        <td width="20%" valign="top">Name</td>
        <td width="80%" valign="top"><xsl:value-of select="./@name" /></td>
        </tr>
        <tr>
        <td valign="top">Type</td>
        <td valign="top"><xsl:value-of select="$type"/></td>
        </tr>
        <tr>
        <td valign="top">Documentation</td>
        <td valign="top"><xsl:copy-of select="./documentation" /></td>
        </tr>
       <xsl:for-each select="property">
        <tr><td>
        <xsl:value-of select="./@key" />
        </td><td>
        <xsl:value-of select="./@value" />
        </td></tr>
       </xsl:for-each>
       
        </table>
        <p/>
    </xsl:template>
</xsl:stylesheet>
