<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:zenta="http://magwas.rulez.org/zenta"
	xmlns:report="http://magwas.rulez.org/my"
	xmlns:xlink="http://www.w3.org/1999/xlink"
	xmlns:fn="http://www.w3.org/2005/xpath-functions">


	<xsl:template match="@*|processing-instruction()|comment()">
		<xsl:copy>
			<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</xsl:copy>
	</xsl:template>

	<xsl:template match="report">
	</xsl:template>

	<xsl:template match="*">
		<xsl:message>No match for <xsl:value-of select="local-name()"/></xsl:message>
		<xsl:element name="{local-name()}">
			<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</xsl:element>
	</xsl:template>

	<xsl:template match="table|tr|td|th">
		<xsl:element name="{local-name()}">
			<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</xsl:element>
	</xsl:template>

	<xsl:template match="documentation">
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
	</xsl:template>

	<xsl:template match="b">
		<emphasis role="bold">
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</emphasis>
	</xsl:template>

	<xsl:template match="strike">
		<emphasis role="strikethrough">
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</emphasis>
	</xsl:template>
	
	<xsl:template match="u">
		<emphasis role="underline">
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</emphasis>
	</xsl:template>

	<xsl:template match="img">
		<figure>
			<mediaobject>
				<imageobject>
					<imagedata fileref="{./@src}"/>
				</imageobject>
			</mediaobject>
		</figure>
	</xsl:template>

	
	<xsl:template match="a">
		<link xlink:href="{@href}" xrefstyle="what?">
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</link>
	</xsl:template>

	<xsl:template match="i">
		<emphasis>
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</emphasis>
	</xsl:template>

	<xsl:template match="del">
		<emphasis role="strikethrough">
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</emphasis>
	</xsl:template>

	<xsl:template match="ul">
		<itemizedlist>
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</itemizedlist>
	</xsl:template>

	<xsl:template match="li">
		<listitem>
		<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()"/>
		</listitem>
	</xsl:template>

	<xsl:template match="br">
		<xsl:variable name="t" select="fn:normalize-space((following-sibling::node())[1])"/>
		<xsl:variable name="l" select="local-name((following-sibling::node())[1])"/>
		<xsl:if test="('' != $t) and ($l != 'br')">
			<para/>
		</xsl:if>
	</xsl:template>


</xsl:stylesheet>


