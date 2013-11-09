<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:archimate="http://www.bolton.ac.uk/archimate"
	xmlns:canvas="http://namespaces.local/canvas"
	xmlns:report="http://magwas.rulez.org/my"
	xmlns:xlink="http://www.w3.org/1999/xlink"
	xmlns:fn="http://www.w3.org/2005/xpath-functions">
<!--FIXME:
	xmlns:canvas="http://www.bolton.ac.uk/archimate/canvas"
-->

	<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes" omit-xml-declaration="no"/>


	<xsl:param name="role" >any</xsl:param>
	<xsl:param name="flat" >true</xsl:param>
	<xsl:param name="lang" />
	<xsl:param name="title" />
	<xsl:param name="repolink" />
	<xsl:param name="part" />
	<xsl:param name="noroot" select="false()"/>
	<xsl:param name="target"/>
	<xsl:param name="targetdir" />

	<xsl:include href="unescape.xslt" />
	<xsl:include href="ht2docbook.xslt" />


	<xsl:template match="/">
		<xsl:variable name="unescaped">
			<xsl:apply-templates mode="unescape"/>
		</xsl:variable>
		<article version="5.0">
			<xsl:if test="$lang">
				<xsl:attribute name="lang" select="$lang"/>
			</xsl:if>
			<info>
				<title>
					<xsl:choose>
						<xsl:when test="$title">
							<xsl:value-of select="$title"/>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="/archimate:model/@name"/>
						</xsl:otherwise>
					</xsl:choose>
				</title>
				<pubdate><xsl:value-of select="substring-before(string(fn:current-date()),'+')"/></pubdate>
				<abstract>
							<xsl:apply-templates select="$unescaped/archimate:model/purpose/node()"/>
              <xsl:if test="$repolink='true'">
              <para>
                <link xlink:href="objectlist.html" xrefstyle="what?">Object list</link>
              </para>
              </xsl:if>
				</abstract>
			</info>
			<xsl:variable name="documentable" select="$unescaped//archimate:Folder[property[@key='report:part' and @value=$part]]|$unescaped//archimate:model[property[@key='report:part' and @value=$part]]"/>
			<xsl:choose>
				<xsl:when test="$noroot">
					<xsl:apply-templates select="$documentable/archimate:Folder">
						<xsl:sort select="./@name"/>
					</xsl:apply-templates>
				</xsl:when>
				<xsl:otherwise>
					<xsl:apply-templates select="$documentable">
						<xsl:sort select="./@name"/>
					</xsl:apply-templates>
				</xsl:otherwise>
			</xsl:choose>
		</article>
	</xsl:template>


	<xsl:template match="property">
		<xsl:if test="(./@key != 'report:role') and (./@key != 'report:part') and (./@key != 'from-folder') and (./@key != 'objectClass')" >
			<xsl:choose>
				<xsl:when test="@key='copy-image'">
					<xsl:message>copy-image <xsl:value-of select="./@name" /></xsl:message>
          <row>
          <entry>
          <para>
					<figure>
						<title><xsl:value-of select="./@name" /></title>
						<remark><xsl:apply-templates select="./documentation" /></remark>
						<mediaobject>
							<imageobject>
								<imagedata fileref="pics/{./@value}.png"/>
							</imageobject>
						</mediaobject>
					</figure>
          </para>
          </entry>
          </row>
				</xsl:when>
				<xsl:otherwise>
					<row><entry>
						<xsl:value-of select="./@key" />
					</entry><entry>
						<xsl:value-of select="./@value" />
					</entry></row>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
	</xsl:template>

	<xsl:template match="*" >
		<xsl:message>no match for <xsl:copy-of select="."/></xsl:message>
	</xsl:template>

	<xsl:template match="archimate:ZentamateDiagramModel|archimate:DiagramModel|archimate:SketchModel|canvas:CanvasModel">
		<xsl:if test="not (./property[@key='report:role' and (@value!=$role and $role != 'any')])">
			<row><entry namest="c1" nameend="c2">
      <para>
				<figure>
					<title><xsl:value-of select="./@name" /></title>
					<remark><xsl:apply-templates select="./documentation" /></remark>
					<mediaobject>
						<imageobject>
							<imagedata fileref="pics/{./@id}.png"/>
						</imageobject>
					</mediaobject>
				</figure>
        </para>
			</entry></row>
			<xsl:apply-templates select="property"/>
		</xsl:if>
	</xsl:template>



	<xsl:template match="include">
		<xsl:message>targetdir=<xsl:value-of select="$targetdir"/></xsl:message>
		<xsl:copy-of select="document(fn:concat($targetdir,'/',@file))"/>
	</xsl:template>

	<xsl:template match="archimate:*" >
		<xsl:if test="not (./property[@key='report:role' and (@value!=$role and $role != 'any')])">
			<row>
				<entry class="starter"  valign="top"><anchor id="{@id}"/><xsl:value-of select="./@name" />
				</entry>
				<entry class="starter" valign="top"><xsl:apply-templates select="./documentation" /></entry>
			</row>
      <xsl:if test="@property"> <!-- FIXME test should be more exact -->
			  <row> <entry><!--Properties--><xsl:text> </xsl:text></entry><entry >
				  <xsl:call-template name="proptable"/>
			  </entry></row>
      </xsl:if>
		</xsl:if>
	</xsl:template>

	<xsl:template name="proptable">
		<xsl:variable name="props">
			<xsl:apply-templates select="property"/>
		</xsl:variable>
		<xsl:if test="string($props)">
			<table class="propertytable">
        <tgroup cols="2">
        <colspec colname="c1"/>
        <colspec colname="c2"/>
        <tbody>
				<xsl:copy-of select="$props"/>
        </tbody>
        </tgroup>
			</table>
		</xsl:if>
	</xsl:template>

	<xsl:template match="archimate:Folder">
		<xsl:if test="not (./property[@key='report:role' and (@value!=$role and $role != 'any')])">
			<section id="{@name}">
				<title><xsl:value-of select="./@name"/></title>
				<para>
					<xsl:apply-templates select="./documentation"/>
				</para>
				<xsl:call-template name="proptable"/>
				<xsl:if test="(archimate:*|canvas:*) except archimate:Folder or property[@key='from-folder']">
					<table class="elementtable">
            <tgroup cols="2">
            <colspec colname="c1"/>
            <colspec colname="c2"/>
            <tbody>
						<xsl:apply-templates select="archimate:ZentamateDiagramModel|archimate:DiagramModel|archimate:SketchModel|canvas:CanvasModel">
							<xsl:sort select="./@name"/>
						</xsl:apply-templates>
						<xsl:apply-templates select="archimate:* except (archimate:ZentamateDiagramModel|archimate:DiagramModel|archimate:SketchModel|archimate:Folder|canvas:CanvasModel)">
							<xsl:sort select="./@name"/>
						</xsl:apply-templates>
						<xsl:if test="'false'=$flat">
							<xsl:for-each select="//*[@id=current()/property[@key='from-folder']/@value]/*[@id] except (//archimate:ZentamateDiagramModel|//archimate:DiagramModel|//archimate:SketchModel|//archimate:Folder|//canvas:CanvasModel)">
								<xsl:sort select="./@name"/>
								<xsl:apply-templates select=".">
								</xsl:apply-templates>
							</xsl:for-each>
						</xsl:if>
            </tbody>
            </tgroup>
					</table>
				</xsl:if>
				<xsl:apply-templates select="archimate:Folder">
					<xsl:sort select="./@name"/>
				</xsl:apply-templates>
			</section>
		</xsl:if>
	</xsl:template>

</xsl:stylesheet>


