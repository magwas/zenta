<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:fn="http://www.w3.org/2005/xpath-functions"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:my="http://magwas.rulez.org/my"
	xmlns:structured="http://magwas.rulez.org/my"
>
<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes"/>
<xsl:param name="role">any</xsl:param>

<xsl:include href="unescape.xslt" />


	<xsl:template match="/">
		<xsl:variable name="unescaped">
			<xsl:apply-templates select="/" mode="unescape"/>
		</xsl:variable>
		<xsl:variable name="forgetids">
			<xsl:apply-templates select="//*[property[@key='structured:role' and @value!=$role]]" mode="remember"/>
		</xsl:variable>

		<xsl:variable name="split">
			<xsl:apply-templates select="$unescaped" mode="forget">
				<xsl:with-param name="flist" tunnel="yes" select="$forgetids"/>
			</xsl:apply-templates>
		</xsl:variable>
<!--
<xsl:result-document href="/tmp/foo.xml"> <xsl:copy-of select="$split"/> </xsl:result-document>
-->
		<xsl:apply-templates select="$split" mode="escape"/>
	</xsl:template>

	<xsl:function name="my:intersect">
		<xsl:param name="str1"/>
		<xsl:param name="str2"/>
		<xsl:for-each select="tokenize($str1,' ')">
			<xsl:if test="not (. = tokenize($str2,' '))">
				<xsl:sequence select="."/>
			</xsl:if>
		</xsl:for-each>
	</xsl:function>



	<xsl:template match="*" mode="remember">
		<xsl:variable name="id" select="./@id"/>
		<xsl:variable name="relations" select="//element[current()/@id = @source or current()/@id = @target]/@id"/>
		<xsl:variable name="diagramelements" select="//child[current()/@id = @zentaElement]/@id"/>
		<xsl:variable name="scons" select="//sourceConnection[@relationship=//*[@source= current()/@id]/@id]/@id"/>
		<xsl:variable name="sconnotarg" select="//sourceConnection[@target=$diagramelements or @source=$diagramelements]/@id"/>
		<xsl:variable name="scofkids" select="//sourceConnection[@target=$diagramelements/..//*/@id or @source=$diagramelements/..//*/@id]/@id"/>
		<kids>
		<xsl:copy-of select="$scofkids/../.."/>
		</kids>

		<xsl:for-each select="./@id,$relations,$diagramelements,$scons,$sconnotarg,$scofkids">
			<remove>
				<xsl:value-of select="."/>
			</remove>
		</xsl:for-each>
		<xsl:for-each select="$scons,$sconnotarg,$scofkids">
			<dc>
				<xsl:sequence select="."/>
				<xsl:attribute name="target" select="//*[current() = fn:tokenize(@targetConnections,' ')]/@id"/>
			</dc>
		</xsl:for-each>
		<xsl:apply-templates select="*" mode="remember"/>
	</xsl:template>

	<xsl:template match="*" mode="forget">
		<xsl:param name="flist" tunnel="yes"/>
		<xsl:if test="not (@id = $flist//remove)">
			<xsl:choose>
				<xsl:when test="@id=$flist/dc/@target">
					<xsl:copy>
 						<xsl:apply-templates select="@*|node()" mode="forget">
							<xsl:with-param name="targets" tunnel="yes"><xsl:value-of select="$flist/dc[@target=current()/@id]/@id"/></xsl:with-param>
						</xsl:apply-templates>
 				 	</xsl:copy>
				</xsl:when>
				<xsl:otherwise>
					<xsl:copy>
 					 <xsl:apply-templates select="@*|node()" mode="forget"/>
 				 	</xsl:copy>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
	</xsl:template>

	<xsl:template match="only" mode="forget">

		<xsl:if test="@structured:role = $role or $role = 'any'">
			<xsl:apply-templates select="*|text()" mode="forget"/>
		</xsl:if>
	</xsl:template>

	<xsl:template match="@*" mode="forget">
		<xsl:param name="targets" tunnel="yes"/>
		<xsl:choose>
			<xsl:when test = "name() = 'targetConnections'">
				<xsl:attribute name="targetConnections" select="my:intersect(.,$targets)"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:copy/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="processing-instruction()|comment()" mode="forget">
		<xsl:copy>
			<xsl:apply-templates select="@*|processing-instruction()|comment()" mode="forget"/>
		</xsl:copy>
	</xsl:template>

</xsl:stylesheet>
