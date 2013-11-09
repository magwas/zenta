<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:archimate="http://www.bolton.ac.uk/archimate" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:template match="/">
        <html>
        <head>
        <title><xsl:value-of select="archimate:model/@name"/></title>
        <link rel="stylesheet" type="text/css" href="structured.css" />
        </head>
        <body style="font-family:Verdana; font-size:10pt;" width="100%">
        <h1><xsl:value-of select="archimate:model/@name"/></h1>
        <br/>
        <h1>Purpose</h1>
        <p><xsl:copy-of select="/archimate:model/purpose"/></p>
        <xsl:if test="/archimate:model/property">
        <table>
       <xsl:for-each select="/archimate:model/property">
        <tr><td>
        <xsl:value-of select="./@key" />
        </td><td>
        <xsl:value-of select="./@value" />
        </td></tr>
       </xsl:for-each>
        </table>
        </xsl:if>
        <br/>
        <h1>Table of contents</h1>
        <dl>
        <xsl:for-each select="/archimate:model/folder">
            <xsl:call-template name="tocentry">
                <xsl:with-param name="depth">2</xsl:with-param>
            </xsl:call-template>
        </xsl:for-each>
        </dl>
        <xsl:for-each select="/archimate:model/folder">
            <xsl:call-template name="folderdoc">
                <xsl:with-param name="depth">2</xsl:with-param>
            </xsl:call-template>
        </xsl:for-each>
        </body>
        </html>
    </xsl:template>
    
    <xsl:template name="tocentry">
        <xsl:param name="depth" />
        <xsl:if test="not (./property[@key='report:hide']/@value)">
        <dt>
        <a href="#{./@id}">
        <xsl:call-template name="heading">
                <xsl:with-param name="depth"><xsl:value-of select="$depth"/></xsl:with-param>
                <xsl:with-param name="str"><xsl:value-of select="./@name"/></xsl:with-param>
        </xsl:call-template>
        </a>
        </dt>
        <dl>
        <xsl:for-each select="folder">
            <xsl:sort select="./@name"/>
            <xsl:call-template name="tocentry">
                <xsl:with-param name="depth"><xsl:value-of select="1 + $depth"/></xsl:with-param>
            </xsl:call-template>
        </xsl:for-each>
        </dl>
        </xsl:if>
    </xsl:template>

    <xsl:template name="heading">
        <xsl:param name="depth" />
        <xsl:param name="str" />

        <xsl:choose>
            <xsl:when test="$depth = 2">
                <h2><xsl:copy-of select="$str"/></h2>
            </xsl:when>
            <xsl:when test="$depth = 3">
                <h3><xsl:copy-of select="$str"/></h3>
            </xsl:when>
            <xsl:when test="$depth = 4">
                <h4><xsl:copy-of select="$str"/></h4>
            </xsl:when>
            <xsl:when test="$depth = 5">
                <h5><xsl:copy-of select="$str"/></h5>
            </xsl:when>
            <xsl:when test="$depth = 6">
                <h6><xsl:copy-of select="$str"/></h6>
            </xsl:when>
            <xsl:otherwise>
                <xsl:copy-of select="$str"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="folderdoc">
        <xsl:param name="depth" />
        <xsl:if test="not (./property[@key='report:hide']/@value)">
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
        <xsl:apply-templates select="archimate:DiagramModel|archimate:SketchModel">
            <xsl:sort select="./@name"/>
        </xsl:apply-templates>
        <xsl:apply-templates select="set:difference(archimate:*,(archimate:DiagramModel|archimate:SketchModel|folder))">
            <xsl:sort select="./@name"/>
        </xsl:apply-templates>
        <xsl:for-each select="folder">
            <xsl:sort select="./@name"/>
            <xsl:call-template name="folderdoc">
                <xsl:with-param name="depth"><xsl:value-of select="1 + $depth"/></xsl:with-param>
            </xsl:call-template>
        </xsl:for-each>
        </td></tr></table>
        </xsl:if>
    </xsl:template>

    <xsl:template match="archimate:DiagramModel|archimate:SketchModel">
        <xsl:if test="not (./property[@key='report:hide']/@value)">
        <table class="diagramtable">
        <tr>
        <td colspan = "2" valign="top"><div align="center"><xsl:value-of select="./@name" /></div></td>
        </tr>
        <tr> <td colspan = "2" ><div align="center"> <img src="{./@id}.png"/></div></td></tr>
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

    <xsl:template match="archimate:*">
        <xsl:if test="not (./property[@key='report:hide']/@value)">
        <table class="doctable">
        <tr class="{substring-after(./@xsi:type,':')}">
        <td width="20%" valign="top"><xsl:value-of select="./@name" /><br/>(<xsl:value-of select="substring-after(name(.),'archimate:')" />)</td>
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
        </xsl:if>
    </xsl:template>
</xsl:stylesheet>
