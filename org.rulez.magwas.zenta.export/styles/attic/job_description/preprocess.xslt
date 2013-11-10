<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:zenta="http://magwas.rulez.org/zenta" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:template match="/">
        <employees>
        <xsl:for-each select="zenta:BusinessActor and (( property/@key='objectClass' and  property/@value='employee') or substring(property/@key,1,9) = 'employee:' ) ]">
            <employee id="{./@id}" name="{./@name}">
            <documentation>
                <xsl:copy-of select="./documentation"/>
            </documentation>
            <username>
            <xsl:choose>
              <xsl:when test="./property/@key='employee:username'">
                <xsl:value-of select="./property[@key='employee:username']/@value"/>
              </xsl:when>
              <xsl:otherwise>
                <xsl:value-of select="./@name"/>
              </xsl:otherwise>
            </xsl:choose>
            <r>
            <xsl:call-template name="getroles">
                <xsl:with-param name="id"><xsl:value-of select="./@id"/></xsl:with-param>
            </xsl:call-template>
            </r>
            </username>
            </employee>
        </xsl:for-each>
        </employees>
    </xsl:template>

    <xsl:template name="getroles">
        <xsl:param name="id" />
            <xsl:for-each select="//zenta:AssignmentRelationship and @source=$id]">
                <through-assignment><xsl:value-of select="./@target"/></through-assignment>
                <xsl:call-template name="gettarget">
                    <xsl:with-param name="id"><xsl:value-of select="./@target"/></xsl:with-param>
                </xsl:call-template>
            </xsl:for-each>
    </xsl:template>
    <xsl:template name="gettarget">
        <xsl:param name="id" />
        <through-role><xsl:copy-of select="(zenta:BusinessRole or zenta:BusinessCollaboration) and @id=$id]"/></through-role>
        <xsl:for-each select="//(zenta:BusinessRole or zenta:BusinessCollaboration) and @id=$id]">
        </xsl:for-each>
    </xsl:template>

    

</xsl:stylesheet>
