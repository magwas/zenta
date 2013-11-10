<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:zenta="http://magwas.rulez.org/zenta" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:template name="tocentry">
        <xsl:param name="depth" />
        <xsl:if test="not (./property[@key='report:part' and @value='structured:hide'])">
        <dt>
        <a href="#{./@id}">
        <xsl:call-template name="heading">
                <xsl:with-param name="depth"><xsl:value-of select="$depth"/></xsl:with-param>
                <xsl:with-param name="str"><xsl:value-of select="./@name"/></xsl:with-param>
        </xsl:call-template>
        </a>
        </dt>
        <dl>
        <xsl:for-each select="zenta:Folder">
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
</xsl:stylesheet>
