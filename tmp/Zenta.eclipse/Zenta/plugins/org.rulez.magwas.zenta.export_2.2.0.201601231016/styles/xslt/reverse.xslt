<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:zenta="http://magwas.rulez.org/zenta"
>
<xsl:output method="xml" version="1.0" encoding="utf-8" indent="no"/>

<!-- the list of source connections related to the relationships which should be reversed -->
<xsl:variable name= "revscs" select="//sourceConnection[@relationship=//folder[@type='relations']/folder[@name='bad direction']/element/@id]"/>

<!-- what to do:
	1 sourceConnection elements matching these should be omitted
	2 child elements having the id of them in targetConnections should be amended with a sourceConnection where source and target is swapped
	3 child elements having them as child should have their targetConnections amended with their id
	4 targetConnections attributes containing their id should be modified not to contain them
	5 for relationships with the id of their relationship attribute the source and target attribute should be swapped
-->

	<!--
	5 for relationships with the id of their relationship attribute the source and target attribute should be swapped
	-->
	<xsl:template match="element[@id=$revscs/@relationship]" mode="reverse">
		<element>
			<xsl:attribute name="source" select="@target"/>
			<xsl:attribute name="target" select="@source"/>
			<xsl:apply-templates select="@*[not(name()='source' or name()='target')]|*|text()|processing-instruction()|comment()" mode="reverse"/>
		</element>
	</xsl:template>

	<xsl:template match="/">
	<xsl:result-document href="/tmp/foo.xml"><A><xsl:copy-of select="$revscs"/></A></xsl:result-document>
		<xsl:apply-templates select="/" mode="reverse"/>
	</xsl:template>

	<!-- identity template -->
	<xsl:template match="@*|*|processing-instruction()|comment()" mode="reverse">
		<xsl:copy>
			<xsl:apply-templates select="*|@*|text()|processing-instruction()|comment()" mode="reverse"/>
		</xsl:copy>
	</xsl:template>

	<!--
		1 sourceConnection elements matching these should be omitted
	-->
	<xsl:template match="sourceConnection" mode="reverse">
		<xsl:choose>
		<xsl:when test="not(@id = $revscs/@id)">
			<xsl:copy>
				<xsl:apply-templates select="@*|processing-instruction()|comment()" mode="reverse"/>
			</xsl:copy>
		</xsl:when>
		<!--
		<xsl:otherwise>
			<omitting><xsl:copy-of select="."/><xsl:copy-of select="@id = $revscs/@id"/></omitting>
		</xsl:otherwise>
		-->
		</xsl:choose>
	</xsl:template>

	<xsl:template match="child" mode="reverse">
		<child>
		<xsl:variable name="tcs" select="tokenize(current()/@targetConnections,' ')"/>
		<xsl:variable name="scs" select="$revscs[@id=$tcs]"/>
			<!--
		<xsl:message>
			scs=<xsl:copy-of select="$scs"/>
			rcs=<xsl:copy-of select="$revscs[1]"/>
			tcs=<xsl:copy-of select="tokenize(current()/@targetConnections,' ')"/>
		</xsl:message>
			-->
		<!--
		3 child elements having them as child should have their targetConnections amended with their id
		-->
		<xsl:call-template name="targetConnections">
			<xsl:with-param name="appendids" select="sourceConnection[@id=$revscs/@id]/@id"/>
		</xsl:call-template>
		<xsl:apply-templates select="@*[not(name()='targetConnections')]|*|text()|processing-instruction()|comment()" mode="reverse"/>
		<!--
		2 child elements having the id of them in targetConnections should be amended with a sourceConnection where source and target is swapped
		-->
		<xsl:for-each select="$scs">
				<sourceConnection source="{@target}" target="{@source}">
					<xsl:copy-of select="@xsi:type"/>
					<xsl:copy-of select="@id"/>
					<xsl:copy-of select="@relationship"/>
					<xsl:apply-templates select="*|text()|processing-instruction()|comment()" mode="reverse"/>
				</sourceConnection>
		</xsl:for-each>
		</child>
	</xsl:template>

	<!--
		3 child elements having them as child should have their targetConnections amended with their id
		4 targetConnections attributes containing their id should be modified not to contain them
	-->
	<xsl:template name="targetConnections">
		<xsl:param name="appendids"/>
		<xsl:variable name="idlist" select="tokenize(@targetConnections,' ')"/>
		<xsl:variable name="delids" select="$revscs[@id=$idlist]/@id"/>
		<xsl:variable name="newval">
			<xsl:for-each select="$idlist">
				<xsl:if test="not(current()=$delids)">
					<xsl:value-of select="."/><xsl:text> </xsl:text>
				</xsl:if>
			</xsl:for-each>
			<xsl:value-of select="$appendids"/>
		</xsl:variable>
		<xsl:attribute name="targetConnections" select="normalize-space($newval)"/>
		<!--
		<xsl:attribute name="appendids" select="$appendids"/>
		<xsl:attribute name="delids" select="$delids"/>
		<xsl:attribute name="oldval" select="$idlist"/>
		<xsl:if test="$appendids|$delids">
		<xsl:message>
			.=<xsl:value-of select="@targetConnections"/>
			a=<xsl:value-of select="$appendids"/>
			d=<xsl:value-of select="$delids"/>
			r='<xsl:copy-of select="normalize-space($newval)"/>'
		</xsl:message>
		</xsl:if>
		-->
	</xsl:template>

</xsl:stylesheet>
