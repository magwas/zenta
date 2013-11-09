<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:archimate="http://www.bolton.ac.uk/archimate">

	<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes" omit-xml-declaration="no"/>

<!--
	This generates a policy based on a metamodel.
	defines the "policy" mode
-->
	<xsl:template match="/">
			<policy name="Generated Policy">
				<xsl:apply-templates select="//objectClass" mode="policy"/>
			</policy>
	</xsl:template>
	
	<xsl:template match="objectClass" mode="policy">
		<objectClass name="{../@name}" abstract="{./abstract}">
			<description>
				<xsl:copy-of select="../documentation"/>
				<xsl:if test="./abstract='true'">
 					<p>This is an abstract class, do not instantiate it in a model</p>
 				</xsl:if>
			</description>
			<xsl:for-each select="//archimate:*[@id=//archimate:SpecialisationRelationship[@source=current()/@parentid]/@target]/@name">
				<ancestor class="{.}"/>
			</xsl:for-each>
			<xsl:apply-templates select="." mode="policy_attributes"/>
		</objectClass>
	</xsl:template>

	<xsl:template match="objectClass" mode="policy_attributes">
			<xsl:apply-templates select="//archimate:*[@id=//archimate:CompositionRelationship[@source=current()/@parentid]/@target]/attribute" mode="policy_attributes"/>
			<xsl:apply-templates mode="policy_attributes" select="//objectClass[@parentid=//archimate:SpecialisationRelationship[@source=current()/@parentid]/@target]"/>
	</xsl:template>

	<xsl:template match="*" mode="policy_attributes">
		<xsl:message>No match for<xsl:copy-of select="."/></xsl:message>
	</xsl:template>

	<xsl:template match="attribute" mode="policy_attributes">
			<property name="{../@name}" type="{type}" minOccurs="{minOccurs}" maxOccurs="{maxOccurs}" structural="{structural}" >
				<description><xsl:copy-of select="../documentation"/></description>
				<xsl:apply-templates select="//default[@parentid=//archimate:CompositionRelationship[@source=current()/@parentid]/@target]" mode="policy_attributes"/>
			</property>
	</xsl:template>

	<xsl:template match="default" mode="policy_attributes">
			<default order="{order}" select="{select}" multi="{multi}">
			<description><xsl:copy-of select="../documentation"/></description>
			</default>
	</xsl:template>

</xsl:stylesheet>
