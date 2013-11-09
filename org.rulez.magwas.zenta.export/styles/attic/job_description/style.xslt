<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:archimate="http://www.bolton.ac.uk/archimate" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:template match="/">
    <html>
    <head>
        <title>Job Descriptions</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
       <xsl:apply-templates  select="//employee"/>
    </body>
    </html>
    </xsl:template>

    <xsl:template match="employee">
        <h1><xsl:value-of select="./@name"/></h1>
        <xsl:copy-of select="./documentation"/>
        <table>
        <tr><td>IDM username</td><td><xsl:value-of select="./username"/></td></tr>
        </table>
    </xsl:template>
</xsl:stylesheet>
