<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xlink="http://www.w3.org/1999/xlink"
	xmlns:my="my:http://dnovatchev.wordpress.com/"
	xmlns:zenta="http://magwas.rulez.org/zenta">

	<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes" omit-xml-declaration="yes"/>

	<xsl:include href="relativeuri.xslt"/>
<!--
	This export a csv for each of the objectClasses defined in the policy, if there is any member of them
-->
	<xsl:param name="policy" select="'policy.xml'"/>
	<xsl:param name="targetdir"/>
	<xsl:param name="target"/>
	<xsl:param name="csvdir"/>
	<xsl:param name="showid"/>


	<xsl:variable name="policyxml" select="document(concat($targetdir,'/',$policy))"/>
	<xsl:variable name="model" select="/"/>
	<xsl:variable name="targetfile" select="concat($targetdir,'/',$target)"/>

	<xsl:template match="/">
		<article><title>Object list</title>
			<xsl:apply-templates select="$policyxml//objectClass" mode="csvexport"/>
		</article>
	</xsl:template>

	<xsl:template match="objectClass" mode="csvexport">
		<xsl:variable name="classlist" select="$model//*[name()=string(current()/@name) and @parentid]"/>
		<xsl:variable name="proplist" select="property/@name"/>
		<xsl:if test="$classlist">
		<section id="{@name}"><title><xsl:value-of select="@name"/></title>
			<xsl:variable name="csvname" select="concat($targetdir,'/',$csvdir,'/',@name,'.csv')"/>
			<!--<xsl:variable name="csvuri" select="my:RelativeUrl($csvname,$targetfile)"/> -->
			<xsl:variable name="csvuri" select="concat(@name,'.csv')"/>
			<para>
				<link xlink:href="{$csvuri}" xrefstyle="what?">csv download</link>
			</para>
			<xsl:result-document href="{$targetdir}/{$csvdir}/{@name}.csv">id;name;<xsl:for-each select="$proplist"><xsl:value-of select="."/>;</xsl:for-each>
				<xsl:text>
</xsl:text>
				<xsl:for-each select="$classlist/..">
          <xsl:variable name="cur" select="."/>
          <xsl:value-of select="@id"/>;<xsl:value-of select="@name"/>;<xsl:for-each select="$proplist"><xsl:value-of select="$cur//*[local-name()=current()]"/>;
          </xsl:for-each>
					<xsl:text>
</xsl:text>
				</xsl:for-each>
			</xsl:result-document>
			<table id="{@name}.table">
				<tr>
					<xsl:if test="$showid"><td class="starter">id</td></xsl:if>
					<td class="starter">name</td>
					<xsl:for-each select="$proplist">
						<td class="starter"><xsl:value-of select="."/></td>
					</xsl:for-each>
				</tr>
				<xsl:for-each select="$classlist">
					<xsl:variable name="cur" select="."/>
					<tr>
            <xsl:if test="$showid">
						<td class="starter">
						<xsl:value-of select="@parentid"/>
						</td>
            </xsl:if>
						<td class="starter">
				    <link xlink:href="index.html#{@parentid}" xrefstyle="what?">
            <anchor id="{@parentid}"/>
						<xsl:value-of select="../@name"/>
            </link>
						</td>
						<xsl:for-each select="$proplist">
							<td class="starter">
                <itemizedlist>
                  <xsl:for-each select="$cur/*[local-name()=current()]">
                    <listitem>
                      <link xlink:href="#{current()/@originid}" xrefstyle="what?">
								        <xsl:value-of select="current()"/>
                      </link>
                    </listitem>
                  </xsl:for-each>
                </itemizedlist>
							</td>
						</xsl:for-each>
					</tr>
				</xsl:for-each>
			</table>
		</section>
		</xsl:if>
	</xsl:template>
	
</xsl:stylesheet>
