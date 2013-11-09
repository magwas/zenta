<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:archimate="http://www.bolton.ac.uk/archimate" xmlns:fn="http://www.w3.org/2005/xpath-functions">
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
        <td width="80%" valign="top"><xsl:value-of select="archimate:model/@name"/></td>
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
        <td valign="top"><xsl:copy-of select="/archimate:model/purpose"/></td>
        </tr>
        </table>
        <br/>

        <h2>Business Actors</h2>
        <xsl:apply-templates select="//archimate:BusinessActor">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Actor</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:BusinessRole">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Role</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:BusinessInterface">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Interface</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:BusinessCollaboration">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Collaboration</xsl:with-param>
        </xsl:apply-templates>
        <h2>Business Functions</h2>
        <xsl:apply-templates select="//archimate:BusinessFunction">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Function</xsl:with-param>
        </xsl:apply-templates>
        <h2>Business Information</h2>
        <xsl:apply-templates select="//archimate:BusinessObject">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Object</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:Representation">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Representation</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:Meaning">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Meaning</xsl:with-param>
        </xsl:apply-templates>
        <h2>Business Processes</h2>
        <xsl:apply-templates select="//archimate:BusinessActivity">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Activity</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:BusinessEvent">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Event</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:BusinessInteraction">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Interaction</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:BusinessProcess">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Process</xsl:with-param>
        </xsl:apply-templates>
        <h2>Business Products</h2>
        <xsl:apply-templates select="//archimate:Contract">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Contract</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:Product">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Product</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:BusinessService">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Business Service</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:Value">
             <xsl:with-param name="color">#ffffb5</xsl:with-param>
             <xsl:with-param name="type">Value</xsl:with-param>
        </xsl:apply-templates>
        <h2>Applications</h2>
        <xsl:apply-templates select="//archimate:ApplicationCollaboration">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Collaboration</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:ApplicationComponent">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Component</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:ApplicationFunction">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Function</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:ApplicationInteraction">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Interaction</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:ApplicationInterface">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Interface</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:ApplicationService">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">Application Service</xsl:with-param>
        </xsl:apply-templates>
        <h2>Application Data</h2>
        <xsl:apply-templates select="//archimate:DataObject">
             <xsl:with-param name="color">#b5ffff</xsl:with-param>
             <xsl:with-param name="type">DataObject</xsl:with-param>
        </xsl:apply-templates>
        <h2>Infrastructures</h2>
        <xsl:apply-templates select="//archimate:Artifact">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Artifact</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:CommunicationPath">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Communication Path</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:Device">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Device</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:Node">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Node</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:InfrastructureInterface">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Infrastructure Interface</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:Network">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Network</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:InfrastructureService">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">Infrastructure Service</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:SystemSoftware">
             <xsl:with-param name="color">#c9e7b7</xsl:with-param>
             <xsl:with-param name="type">System Software</xsl:with-param>
        </xsl:apply-templates>
        <h2>Connectors</h2>
        <xsl:apply-templates select="//archimate:Junction">
             <xsl:with-param name="color">#dcebeb</xsl:with-param>
             <xsl:with-param name="type">Junction</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:AndJunction">
             <xsl:with-param name="color">#dcebeb</xsl:with-param>
             <xsl:with-param name="type">And Junction</xsl:with-param>
        </xsl:apply-templates>
        <xsl:apply-templates select="//archimate:OrJunction">
             <xsl:with-param name="color">#dcebeb</xsl:with-param>
             <xsl:with-param name="type">Or Junction</xsl:with-param>
        </xsl:apply-templates>
        <h2>Views</h2>
        <xsl:apply-templates select="//archimate:DiagramModel">
             <xsl:with-param name="color">#e0e4e6</xsl:with-param>
             <xsl:with-param name="type">Or Junction</xsl:with-param>
        </xsl:apply-templates>
        </body>
        </html>
    </xsl:template>
    
    <xsl:template match="archimate:DiagramModel">
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
    <xsl:template match="archimate:*">
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
