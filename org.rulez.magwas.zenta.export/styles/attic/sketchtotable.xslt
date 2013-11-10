<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:zenta="http://magwas.rulez.org/zenta" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:xalan="http://xml.apache.org/xalan" exclude-result-prefixes="xalan" xmlns:str="http://exslt.org/strings">

    <xsl:template name="sketchtotable">
        <!-- see "sketchtotable style" in documentation -->
            <xsl:if test="./property[@key='objectClass' and @value='NGTresult']">
                <h1><xsl:value-of select="./@name" /></h1>
                <table border="1">
                <tr><td>Weight</td><td>description</td></tr>
                <xsl:for-each select="./zenta:SketchModelSticky">
                    <xsl:sort order="descending" select="count(str:tokenize(./@targetConnections, ' ')) + count(./sourceConnection)"/>
                    <tr>
                    <td><xsl:value-of select="count(str:tokenize(./@targetConnections, ' ')) + count(./sourceConnection)"/>
                    </td>
                    <td><xsl:value-of select="./content" />
                    <xsl:if test="./zenta:SketchModelSticky">
                        <ul>
                        <xsl:for-each select="./zenta:SketchModelSticky">
                            <xsl:call-template name="substicky"/>
                        </xsl:for-each>
                        </ul>
                    </xsl:if>
                    </td>
                    </tr>
                </xsl:for-each>
                </table>
            </xsl:if>
    </xsl:template>

    <xsl:template name="substicky">
    <li> <xsl:value-of select="./content"/></li>
    <xsl:if test="./zenta:SketchModelSticky">
        <ul>
        <xsl:for-each select="./zenta:SketchModelSticky">
            <xsl:call-template name="substicky"/>
        </xsl:for-each>
        </ul>
    </xsl:if>
    </xsl:template>


<xsl:template match="/">
        <html>
        <head>
        <title><xsl:value-of select="zenta:model/@name"/> NGT results</title>
        <link rel="stylesheet" type="text/css" href="structured.css" />
        </head>
        <body>
        <xsl:for-each select="//zenta:SketchModel">
            <xsl:call-template name="sketchtotable"/>
        </xsl:for-each>
        </body>
        </html>
</xsl:template>

</xsl:stylesheet>
