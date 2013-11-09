<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:archimate="http://www.bolton.ac.uk/archimate" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:template name="folderdoc">
        <xsl:param name="depth" />
        <xsl:if test="not (./property[@key='report:part' and @value='structured:hide']/@value)">
        <table class="foldertable">
        <tr><td class="emptytd"></td><td>
        <a name="{./@id}">
        <xsl:call-template name="heading">
                <xsl:with-param name="depth"><xsl:value-of select="$depth"/></xsl:with-param>
                <xsl:with-param name="str"><xsl:value-of select="./@name"/></xsl:with-param>
        </xsl:call-template>
        </a>
        <table class="folderdoctable"><tr><td colspan="2">
        <xsl:copy-of select="./documentation"/>
        </td></tr>
       <xsl:for-each select="property">
        <tr class="propertytr"><td>
        <xsl:value-of select="./@key" />
        </td><td>
        <xsl:value-of select="./@value" />
        </td></tr>
       </xsl:for-each>
        </table>
        <xsl:apply-templates select="archimate:ArchimateDiagramModel|archimate:DiagramModel|archimate:SketchModel">
            <xsl:sort select="./@name"/>
        </xsl:apply-templates>
        <xsl:apply-templates select="set:difference(archimate:*,(archimate:ArchimateDiagramModel|archimate:DiagramModel|archimate:SketchModel|archimate:Folder))">
            <xsl:sort select="./@name"/>
        </xsl:apply-templates>
        <xsl:for-each select="archimate:Folder">
            <xsl:sort select="./@name"/>
            <xsl:call-template name="folderdoc">
                <xsl:with-param name="depth"><xsl:value-of select="1 + $depth"/></xsl:with-param>
            </xsl:call-template>
        </xsl:for-each>
        </td></tr></table>
        </xsl:if>
    </xsl:template>
</xsl:stylesheet>

