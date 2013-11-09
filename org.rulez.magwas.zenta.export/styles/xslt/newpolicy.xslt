<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns:archimate="http://www.bolton.ac.uk/archimate">

  <xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes" omit-xml-declaration="no"/>

  <xsl:param name="targetdir"/>
<!--
//archimate:*[@id=//archimate:ArchimateDiagramModel[property[@key='Template']]//archimate:Connection/@relationship]
//archimate:*[@id=//archimate:ArchimateDiagramModel[property[@key='Template']]//archimate:DiagramObject/@archimateElement]
//archimate:ArchimateDiagramModel[property[@key='Template']]//archimate:DiagramObject
-->
  <xsl:variable name="templates" select="//archimate:ArchimateDiagramModel[property[@key='Template']]"/>
  <xsl:variable name="objects" select="//archimate:*[@id=$templates//archimate:DiagramObject/@archimateElement]"/>
  <xsl:variable name="conns" select="//archimate:*[@id=$templates//archimate:Connection/@relationship]"/>
  <xsl:variable name="directions" select="tokenize('source target source',' ')"/>

  <xsl:template match="/">
      <xsl:result-document href="{$targetdir}/templates"><xsl:copy-of select="$templates"/></xsl:result-document>
      <xsl:result-document href="{$targetdir}/objects"><xsl:copy-of select="$objects"/></xsl:result-document>
      <xsl:result-document href="{$targetdir}/conns"><xsl:copy-of select="$conns"/></xsl:result-document>
      <policy name="Generated Policy (new style)">
        <xsl:apply-templates select="$objects" mode="newpolicy"/>
      </policy>
  </xsl:template>
  
  <xsl:template match="archimate:*[@id=$objects/@id]" mode="newpolicy">
    <objectClass name="{@name}" abstract="{property[@key='abstract']}">
      <!--<this><xsl:copy-of select="."/></this>-->
      <description>
        <xsl:copy-of select="documentation"/>
        <xsl:if test="'true' = property[@key='abstract']">
           <p>This is an abstract class, do not instantiate it in a model</p>
         </xsl:if>
      </description>
      <xsl:variable name="parent" select="$objects[@id=$conns['archimate:SpecialisationRelationship' = name() and @source = current()/@id]/@target]"/>
      <xsl:choose>
        <xsl:when test="$parent">
          <ancestor class="{$parent/@name}" byspec="true"/>
        </xsl:when>
        <xsl:otherwise>
          <ancestor class="{name()}"/>
        </xsl:otherwise>
      </xsl:choose>
      <xsl:apply-templates select="$conns[@source = current()/@id and property[@key!='inheritance']]" mode="newpolicy">
        <xsl:with-param name="objectClass" select="@name"/>
        <xsl:with-param name="direction" select="1"/><!-- 1=source -->
      </xsl:apply-templates>
      <xsl:apply-templates select="$conns[@target = current()/@id and property[@key!='inheritance']]" mode="newpolicy">
        <xsl:with-param name="objectClass" select="@name"/>
        <xsl:with-param name="direction" select="2"/><!-- 2=target -->
      </xsl:apply-templates>
    </objectClass>
  </xsl:template>

  <xsl:template match="archimate:*[@id=$conns/@id]" mode="newpolicy">
      <xsl:param name="objectClass"/>
      <xsl:param name="direction"/>
      <xsl:variable name="targetobj">
        <xsl:choose>
          <xsl:when test="1 = $direction">
            <xsl:copy-of select="$objects[@id=current()/@target]"/>
          </xsl:when>
          <xsl:when test="2 = $direction">
            <xsl:copy-of select="$objects[@id=current()/@source]"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:message terminate="yes">Internal error: cannot figure out target for <xsl:copy-of select="."/></xsl:message>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:variable>
      <xsl:variable name="attname">
        <xsl:choose>
          <xsl:when test="@name">
            <xsl:value-of select="@name"/>
          </xsl:when>
          <xsl:when test="property[@key='name']">
            <xsl:value-of select="tokenize(property[@key='name']/@value,'/')[$direction]"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:value-of select="$targetobj/*/@name"/>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:variable>
      <xsl:variable name="type">
        <xsl:choose>
          <xsl:when test="property[@key='type']">
            <xsl:value-of select="tokenize(property[@key='type']/@value,'/')[$direction]"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:value-of select="'xs:string'"/>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:variable>
      <xsl:variable name="structural" select="tokenize(property[@key='structural']/@value,'/')[$direction]"/>
      <xsl:variable name="cardinality" select="tokenize(property[@key='cardinality']/@value,'/')[$direction]"/>
      <xsl:variable name="minOccurs" select="tokenize($cardinality,',')[1]"/>
      <xsl:variable name="maxOccurs" select="tokenize($cardinality,',')[2]"/>


      <property name="{$attname}" type="{$type}" minOccurs="{$minOccurs}" maxOccurs="{$maxOccurs}" structural="{$structural}" >
        <description><xsl:copy-of select="documentation"/></description>
        <xsl:variable name="propname" select="concat($objectClass,':',$attname)"/>
        <default 
          select="property['key'='{$propname}']/@value"
          multi="true">
          <description>A property for the object named <xsl:value-of select="$propname"/></description>
        </default>
          <xsl:if test="not(property[@key='nodirect'])">
            <default
              select="//{$targetobj/*/name()}[@id=//{name()}[@{$directions[$direction]}=$id]/@{$directions[$direction+1]}]"
              multi="true">
              <description/><!-- FIXME: the select should be more specific -->
            </default>
          </xsl:if>
          <xsl:if test="property[@key='recursive']">
            <xsl:variable name="orpattern" select="'//CLASS[@id=//CLASS[@SDIRECTION=$id]/@DIRECTION]'"/>
            <xsl:variable name="onerecursion" select="concat(
              '//',
              $targetobj/*/name(),
              '[@id=//',
              name(),
              '[@',
              $directions[$direction],
              '=$id]/@',
              $directions[$direction+1],
              ']'
            )
            "/>

            <default
              onerecursion="{$onerecursion}"
              select="//{$targetobj/*/name()}[@id=//{name()}[@{$directions[$direction]}=$id]/@{$directions[$direction+1]}]"
              multi="true">
              <description/><!-- FIXME: the select should be more specific -->
            </default>
          </xsl:if>
          <xsl:for-each select="property[@key='indirect']">
            <xsl:variable name="indirect" select="tokenize(
                    @value,
                    ';'
                 )[$direction]
            "/>
            <xsl:if test="$indirect">
              <default>
                <xsl:attribute name="indirect" select="$indirect"/>
                <description>The data indirectly mined through <xsl:value-of select="$indirect"/></description><!-- FIXME: the select should be more specific -->
              </default>
            </xsl:if>
          </xsl:for-each>

      </property>
  </xsl:template>

<!--
  <xsl:template match="default" mode="policy">
      <default order="{order}" select="{select}" multi="{multi}">
      <description><xsl:copy-of select="../documentation"/></description>
      </default>
  </xsl:template>
-->

</xsl:stylesheet>
