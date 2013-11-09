<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:archimate="http://www.bolton.ac.uk/archimate" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">

    <xsl:template match="archimate:*" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:archimate="http://www.bolton.ac.uk/archimate" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions" >
        <xsl:if test="not (./property[@key='report:part' and @value='element:hide'])">
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
