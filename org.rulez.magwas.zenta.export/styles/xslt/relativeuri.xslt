<!-- from http://stackoverflow.com/questions/7635091/an-uri-relativization-in-xquery -->
<!-- modified to work for pBase being the file where we are pointing from -->
<xsl:stylesheet version="2.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:my="my:http://dnovatchev.wordpress.com/"> 

 <xsl:function name="my:RelativeUrl" as="xs:string">
  <xsl:param name="pUrl" as="xs:string"/>
  <xsl:param name="pBase" as="xs:string"/>

  <xsl:variable name="vurlSegments" select="tokenize($pUrl, '/')"/>
  <xsl:variable name="vbaseSegments" select="tokenize($pBase, '/')"/>

  <xsl:variable name="vCommonPrefixLength" select=
   "(for $i in 1 to count($vbaseSegments)
      return
        if($vbaseSegments[$i] ne $vurlSegments[$i])
          then $i -1
          else ()
     )[1]
   "/>

   <xsl:variable name="vUpSteps" select=
   "count($vbaseSegments) -$vCommonPrefixLength "/>

   <xsl:sequence select=
    "string-join
       (
               (
                (for $i in 1 to ($vUpSteps - 1)
                    return
                      '..'
                  ),
                 (for $k in 1 to count($vurlSegments) - $vCommonPrefixLength 
                   return
                     $vurlSegments[$vCommonPrefixLength + $k]
                  )
                 ),

                  '/'
        )
    "/>
 </xsl:function>
</xsl:stylesheet>

