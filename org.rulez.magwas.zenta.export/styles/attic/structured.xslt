<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:zenta="http://magwas.rulez.org/zenta" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">

	<xsl:include href="diagram.xslt" />
	<xsl:include href="elementdoc.xslt" />
	<xsl:include href="folderdoc.xslt" />
	<xsl:include href="tocandheading.xslt" />
    <xsl:template match="/">
        <html>
        <head>
        <title><xsl:value-of select="zenta:model/@name"/></title>
        <link rel="stylesheet" type="text/css" href="structured.css" />
        </head>
        <body style="font-family:Verdana; font-size:10pt;" width="100%">
        <h1><xsl:value-of select="zenta:model/@name"/></h1>
        <br/>
        <h1>Purpose</h1>
        <p><xsl:copy-of select="/zenta:model/purpose"/></p>
        <xsl:if test="/zenta:model/property">
        <table>
       <xsl:for-each select="/zenta:model/property">
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
        <xsl:for-each select="/zenta:model/zenta:Folder">
            <xsl:call-template name="tocentry">
                <xsl:with-param name="depth">2</xsl:with-param>
            </xsl:call-template>
        </xsl:for-each>
        </dl>
        <xsl:for-each select="/zenta:model/zenta:Folder">
            <xsl:call-template name="folderdoc">
                <xsl:with-param name="depth">2</xsl:with-param>
            </xsl:call-template>
        </xsl:for-each>
        </body>
        </html>
    </xsl:template>
    
</xsl:stylesheet>
