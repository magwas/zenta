<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:zenta="http://magwas.rulez.org/zenta" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">

<xsl:template name="propertysql">
    <property>
        <type>property</type>
        <xsl:choose>
            <xsl:when test="../@type">
             <parent><xsl:value-of select="../@type"/></parent>
            </xsl:when>
            <xsl:otherwise>
             <parent><xsl:value-of select="../@id"/></parent>
            </xsl:otherwise>
        </xsl:choose>
        <key><xsl:value-of select="./@key"/></key>
        <value><xsl:value-of select="./@value"/></value>
    </property>
</xsl:template>
<xsl:template name="bendpointsql">
    <property>
        <type>bendpoint</type>
        <parent><xsl:value-of select="../@id"/></parent>
        <x1><xsl:value-of select="./@startX"/></x1>
        <y1><xsl:value-of select="./@startY"/></y1>
        <x2><xsl:value-of select="./@endX"/></x2>
        <y2><xsl:value-of select="./@endY"/></y2>
    </property>
</xsl:template>
<xsl:template name="boundsql">
    <property>
        <type>bounds</type>
        <parent><xsl:value-of select="../@id"/></parent>
        <x1><xsl:value-of select="./@x"/></x1>
        <y1><xsl:value-of select="./@y"/></y1>
        <x2><xsl:value-of select="./@width"/></x2>
        <y2><xsl:value-of select="./@height"/></y2>
    </property>
</xsl:template>
<xsl:template name="childsql">
    <object>
        <parent><xsl:value-of select="../@id"/></parent>
        <id><xsl:value-of select="./@id"/></id>
        <name><xsl:value-of select="./@name"/></name>
        <documentation><xsl:value-of select="./content"/></documentation>
        <type><xsl:value-of select="./@xsi:type"/></type>
        <element><xsl:value-of select="./@zentaElement"/></element>
        <font><xsl:value-of select="./@font"/></font>
        <fontColor><xsl:value-of select="./@fontColor"/></fontColor>
        <textAlignment><xsl:value-of select="./@textAlignment"/></textAlignment>
        <fillColor><xsl:value-of select="./@fillColor"/></fillColor>
    </object>
        <xsl:for-each select="property">
            <xsl:call-template name="propertysql"/>
        </xsl:for-each>
        <xsl:for-each select="child">
            <xsl:call-template name="childsql"/>
        </xsl:for-each>
        <xsl:for-each select="bounds">
            <xsl:call-template name="boundsql"/>
        </xsl:for-each>
        <xsl:for-each select="sourceConnection">
            <xsl:call-template name="elementsql">
            <xsl:with-param name="type">sourceConnection</xsl:with-param>
            </xsl:call-template>
        </xsl:for-each>
</xsl:template>
<xsl:template name="elementsql">
    <xsl:param name="type"/>
    <object>
        <id><xsl:value-of select="./@id"/></id>
        <name><xsl:value-of select="./@name"/></name>
        <documentation><xsl:value-of select="./documentation"/></documentation>
        <xsl:choose>
            <xsl:when test="$type">
             <type><xsl:value-of select="$type"/></type>
            </xsl:when>
            <xsl:otherwise>
             <type><xsl:value-of select="./@xsi:type"/></type>
            </xsl:otherwise>
        </xsl:choose>
        <xsl:choose>
            <xsl:when test="../@type">
             <parent><xsl:value-of select="../@type"/></parent>
            </xsl:when>
            <xsl:otherwise>
             <parent><xsl:value-of select="../@id"/></parent>
            </xsl:otherwise>
        </xsl:choose>
        <source><xsl:value-of select="./@source"/></source>
        <target><xsl:value-of select="./@target"/></target>
        <element><xsl:value-of select="./@relationship"/></element>
    </object>
        <xsl:for-each select="property">
            <xsl:call-template name="propertysql"/>
        </xsl:for-each>
        <xsl:for-each select="child">
            <xsl:call-template name="childsql"/>
        </xsl:for-each>
        <xsl:for-each select="bendpoint">
            <xsl:call-template name="bendpointsql"/>
        </xsl:for-each>
</xsl:template>
<xsl:template name="foldersql">
    <object>
        <xsl:choose>
            <xsl:when test="./@type">
             <id><xsl:value-of select="./@type"/></id>
            </xsl:when>
            <xsl:otherwise>
             <id><xsl:value-of select="./@id"/></id>
            </xsl:otherwise>
        </xsl:choose>
        <name><xsl:value-of select="./@name"/></name>
        <documentation><xsl:value-of select="./documentation"/></documentation>
        <type>folder</type>
        <xsl:choose>
            <xsl:when test="../@type">
             <parent><xsl:value-of select="../@type"/></parent>
            </xsl:when>
            <xsl:otherwise>
             <parent><xsl:value-of select="../@id"/></parent>
            </xsl:otherwise>
        </xsl:choose>
    </object>
        <xsl:for-each select="property">
            <xsl:call-template name="propertysql"/>
        </xsl:for-each>
        <xsl:for-each select="folder">
            <xsl:call-template name="foldersql"/>
        </xsl:for-each>
        <xsl:for-each select="element">
            <xsl:call-template name="elementsql"/>
        </xsl:for-each>
</xsl:template>
    <xsl:template match="/">
        <xml>
        <object>
        <id><xsl:value-of select="zenta:model/@id"/></id>
        <parent><xsl:value-of select="zenta:model/@id"/></parent>
        <name><xsl:value-of select="zenta:model/@name"/></name>
        <documentation><xsl:value-of select="zenta:model/purpose"/></documentation>
        <type>model</type>
        </object>
        <xsl:for-each select="/zenta:model/folder">
            <xsl:call-template name="foldersql"/>
        </xsl:for-each>
        </xml>
    </xsl:template>
    
</xsl:stylesheet>
