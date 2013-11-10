<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xlink="http://www.w3.org/1999/xlink"
	xmlns:my="my:http://dnovatchev.wordpress.com/"
	xmlns:zenta="http://magwas.rulez.org/zenta">

	<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes" omit-xml-declaration="yes"/>

	<xsl:include href="relativeuri.xslt"/>
	<xsl:param name="policy" select="'policy.xml'"/>
	<xsl:param name="targetdir"/>
	<xsl:param name="target"/>
	<xsl:param name="showid"/>


	<xsl:variable name="policyxml" select="document(concat($targetdir,'/',$policy))"/>
	<xsl:variable name="model" select="/"/>
	<xsl:variable name="targetfile" select="concat($targetdir,'/',$target)"/>

	<xsl:template match="/">
		<article><title>Missed object list</title>
      <itemizedlist>
        <xsl:for-each select="//*[name() = distinct-values($policyxml//ancestor/@class) and not(*/@parentid)]">
          <listitem>
				    <link xlink:href="index.html#{@id}" xrefstyle="what?">
						  <xsl:value-of select="@name"/>
            </link>
          </listitem>
        </xsl:for-each>
      </itemizedlist>
		</article>
	</xsl:template>

</xsl:stylesheet>
