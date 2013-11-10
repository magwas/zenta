<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:zenta="http://magwas.rulez.org/zenta" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:template match="zenta:ZentamateDiagramModel|zenta:DiagramModel|zenta:SketchModel" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:zenta="http://magwas.rulez.org/zenta" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">
        <xsl:if test="not (./property[@key='report:part' and @value='diagram:hide'])">
        <table class="diagramtable">
        <tr>
        <td colspan = "2" valign="top"><div align="center"><xsl:value-of select="./@name" /></div></td>
        </tr>
        <tr> <td colspan = "2" ><div align="center"> <img src="{./@id}.png" width="100%"/></div></td></tr>
        <tr>
        <td colspan = "2" valign="top"><xsl:copy-of select="./documentation" /></td>
        </tr>
       <xsl:for-each select="property">
        <tr><td>
        <xsl:value-of select="./@key" />
        </td><td>
        <xsl:value-of select="./@value" />
        </td></tr>
       </xsl:for-each>
        </table>
        <br/>
        </xsl:if>
    </xsl:template>
</xsl:stylesheet>

