<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:archimate="http://www.bolton.ac.uk/archimate" xmlns:set="http://exslt.org/sets" xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:template match="/">
        <xhtml>
        <head>
        <title><xsl:value-of select="archimate:model/@name"/></title>
        <link rel="stylesheet" type="text/css" href="style.css" />
        </head>
        <body style="font-family:Verdana; font-size:10pt;" width="100%">
        <h1><xsl:value-of select="archimate:model/@name"/></h1>
        <h2>Document Control</h2>
        <h3>Versions</h3>
        <xsl:call-template name="documentversions"/>
        <h3>Participants</h3>
        <xsl:for-each select="//GovernanceStep">
            <xsl:sort select="./name"/>
         <h4><xsl:value-of select="./name"/></h4>
        <xsl:call-template name="documentcontrolusers">
                <xsl:with-param name="step">
                    <xsl:value-of select="./name"/>
                </xsl:with-param>
        </xsl:call-template>
        </xsl:for-each>
        <h2>ObjectClass Documentation</h2>
        <xsl:call-template name="objectClassDoc"/>
        <xsl:call-template name="objectClassXml"/>
        </body>
        </xhtml>
    </xsl:template>
    
    <xsl:template name="objectClassXml">
        <code>
        <policy name="Generated Policy">
        <xsl:for-each select="//objectClass">
            <objectClass name="{./name}" abstract="{./abstract}">
            <description><xsl:copy-of select="../documentation"/></description>
            <xsl:for-each select="./parent">
                <ancestor class="{.}"/>
            </xsl:for-each>
            <xsl:if test="./abstract='true'">
                <p>This is an abstract class, do not instantiate it in a model</p>
            </xsl:if>
            <xsl:for-each select="./attrib">
                <xsl:call-template name="attributexml">
                    <xsl:with-param name="id">
                        <xsl:value-of select="."/>
                    </xsl:with-param>
                </xsl:call-template>
            </xsl:for-each>
            </objectClass>
        </xsl:for-each>
        </policy>
        </code>
    </xsl:template>

    <xsl:template name="objectClassDoc">
        <xsl:for-each select="//objectClass">
            <h2>objectClass <xsl:value-of select="./name"/></h2>
            <p><xsl:copy-of select="../documentation"/></p>
            Ancestors:
            <ul>
            <xsl:for-each select="./parent">
            <li><xsl:value-of select="."/></li>
            </xsl:for-each>
            </ul>
            <xsl:if test="./abstract='true'">
                <p>This is an abstract class, do not instantiate it in a model</p>
            </xsl:if>
            Properties:
            <table class="objectclasspropertytable">
            <tr><th>Name</th><th>Description</th></tr>
            <xsl:for-each select="./attrib">
                <xsl:call-template name="attributedoc">
                    <xsl:with-param name="id">
                        <xsl:value-of select="."/>
                    </xsl:with-param>
                </xsl:call-template>
            </xsl:for-each>
            </table>
        </xsl:for-each>
    </xsl:template>

    <xsl:template name="attributedoc">
        <xsl:param name="id" />
        <tr><td>
        <xsl:value-of select="//attribute[@parentid=$id]/../@name"/>
        </td><td>
        <xsl:copy-of select="//attribute[@parentid=$id]/../documentation"/>
        <br/>
        <xsl:if test="//attribute[@parentid=$id]/structural = 'true'">
            This is a structural attribute. Do not give a value to it through a property.
        <br/>
        </xsl:if>
        Type=<xsl:value-of select="//attribute[@parentid=$id]/type"/>
        <br/>
        <xsl:if test="//attribute[@parentid=$id]/minOccurs != ''">
        minOccurs=<xsl:value-of select="//attribute[@parentid=$id]/minOccurs"/>
        <br/>
        </xsl:if>
        <xsl:if test="//attribute[@parentid=$id]/maxOccurs != ''">
        maxOccurs=<xsl:value-of select="//attribute[@parentid=$id]/maxOccurs"/>
        <br/>
        </xsl:if>
        <xsl:if test="//attribute[@parentid=$id]/def">
        Defaults:
            <table class="defaultstable">
            <tr><th>Description</th><th>Attributes</th></tr>
            <xsl:for-each select="//attribute[@parentid=$id]/def">
                <xsl:call-template name="defaultdoc">
                    <xsl:with-param name="defid">
                        <xsl:value-of select="."/>
                    </xsl:with-param>
                </xsl:call-template>
            </xsl:for-each>
            </table>
        </xsl:if>
        </td></tr>
    </xsl:template>

    <xsl:template name="attributexml">
        <xsl:param name="id" />
        <property name="{//attribute[@parentid=$id]/../@name}" type="{//attribute[@parentid=$id]/type}" minOccurs="{//attribute[@parentid=$id]/minOccurs}" maxOccurs="{//attribute[@parentid=$id]/maxOccurs}" structural="{//attribute[@parentid=$id]/structural}" >
        <description><xsl:copy-of select="//attribute[@parentid=$id]/../documentation"/></description>
            <xsl:for-each select="//attribute[@parentid=$id]/def">
                <xsl:call-template name="defaultxml">
                    <xsl:with-param name="defid">
                        <xsl:value-of select="."/>
                    </xsl:with-param>
                </xsl:call-template>
            </xsl:for-each>
        </property>
    </xsl:template>

    <xsl:template name="defaultxml">
        <xsl:param name="defid" />
        <default order="{//default[@parentid=$defid]/order}" select="{//default[@parentid=$defid]/select}" multi="{//default[@parentid=$defid]/multi}">
        <description><xsl:copy-of select="//default[@parentid=$defid]/../documentation"/></description>
        </default>
    </xsl:template>

    <xsl:template name="defaultdoc">
        <xsl:param name="defid" />
        <tr><td>
        <xsl:value-of select="//default[@parentid=$defid]/../@name"/>
        </td><td>
        <xsl:copy-of select="//default[@parentid=$defid]/../documentation"/>
        <br/>
        order=<xsl:value-of select="//default[@parentid=$defid]/order"/>
        <br/>
        select=<xsl:value-of select="//default[@parentid=$defid]/select"/>
        <br/>
        <xsl:if test="//default[@parentid=$defid]/multi = 'true'">
            This is a multi-value default
        <br/>
        </xsl:if>
        </td></tr>
    </xsl:template>

    <xsl:template name="documentversions">
        <table class="documentversions">
            <tr><th>
                Version
            </th><th>
                Release date
            </th><th>
                Author
            </th><th>
                Changes
            </th></tr>
            
        <xsl:for-each select="//DocumentVersion">
            <xsl:sort select="./versionnumber"/>
            <tr><td>
            <xsl:value-of select="./versionnumber"/>
            </td><td>
            <xsl:value-of select="./releasedate"/>
            </td><td>
        <xsl:call-template name="personname">
                <xsl:with-param name="id">
                    <xsl:value-of select="./authorid"/>
                </xsl:with-param>
        </xsl:call-template>
            </td><td>
            <xsl:copy-of select="../documentation"/>
            </td></tr>
        </xsl:for-each>
        </table>
    </xsl:template>

<!-- I could not figure out why select="//OrganisationalPerson[@parentid=./authorid]/name"  does not work, so this is a workaround.
It could be handled by the policy as well: the actor property of GovernanceStep could bring together all necessary attributes from the OrganisationalUnit or OrganisationalPerson.
-->
    <xsl:template name="personname">
        <xsl:param name="id" />
        <xsl:value-of select="//OrganisationalPerson[@parentid=$id]/name"/>
    </xsl:template>
    <xsl:template name="personnameandposition">
        <xsl:param name="id" />
        <xsl:if test="//OrganisationalPerson[@parentid=$id]">
        <td>
        <xsl:value-of select="//OrganisationalPerson[@parentid=$id]/name"/>
        </td><td>
        <xsl:value-of select="//OrganisationalPerson[@parentid=$id]/position"/>
        </td>
        </xsl:if>
    </xsl:template>
    <xsl:template name="unitnameandpos">
        <xsl:param name="id" />
        <xsl:if test="//OrganisationalUnit[@parentid=$id]">
        <td>
        <xsl:value-of select="//OrganisationalUnit[@parentid=$id]"/>
        </td><td>
        Any/All members
        </td>
        </xsl:if>
    </xsl:template>

    <xsl:template name="documentcontrolusers">
        <xsl:param name="step" />
        <div class="statelabel">State:</div><div class="state"><xsl:value-of select="//GovernanceStep[name=$step]/state"/></div><br/>
        Participants:
        <table class="documentcontrolusers">
            <tr><th>
                Name
            </th><th>
                position
            </th></tr>
            
        <xsl:for-each select="//GovernanceStep[name=$step]/actor">
            <tr>
        <xsl:call-template name="personnameandposition">
                <xsl:with-param name="id">
                    <xsl:value-of select="."/>
                </xsl:with-param>
        </xsl:call-template>
        <xsl:call-template name="unitnameandpos">
                <xsl:with-param name="id">
                    <xsl:value-of select="."/>
                </xsl:with-param>
        </xsl:call-template>
            </tr>
        </xsl:for-each>
        </table>
    </xsl:template>

</xsl:stylesheet>
