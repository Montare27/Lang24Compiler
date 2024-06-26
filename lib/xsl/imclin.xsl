<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="imclin">
  <html>
    <style>
      table, tr, td {
      text-align: center;
      vertical-align: top;
      }
    </style>
    <body>
      <table>
	<xsl:apply-templates select="datachunk"/>
      </table>
      <table>
	<tr>
	  <xsl:apply-templates select="codechunk"/>
	</tr>
      </table>
     </body>
  </html>
</xsl:template>

<xsl:template match="datachunk">
  <tr>
    <td bgcolor="DDDDDD" style="text-align:left">
      <nobr>
	DATA
	label=<xsl:value-of select="@label"/>
	size=<xsl:value-of select="@size"/>
	<xsl:if test="@init!=''">
	  init=<xsl:value-of select="@init"/>
	</xsl:if>
      </nobr>
    </td>
  </tr>
</xsl:template>

<xsl:template match="codechunk">
  <td bgcolor="DDDDDD">
    <table>
      <tr>
	<td bgcolor="EECF00">
	  <xsl:apply-templates select="frame"/>
	</td>
      </tr>
      <tr>
	<td bgcolor="EECF00">
	  <nobr>
	    prologue=<font style="font-family:courier new"><xsl:value-of select="@prologuelabel"/></font>
	    body=<font style="font-family:courier new"><xsl:value-of select="@bodylabel"/></font>
	    epilogue=<font style="font-family:courier new"><xsl:value-of select="@epiloguelabel"/></font>
	  </nobr>
	</td>
      </tr>
      <xsl:apply-templates select="stmt"/>
    </table>
  </td>
</xsl:template>

<xsl:template match="stmt">
  <tr>
    <xsl:apply-templates select="imc"/>
  </tr>
  <tr>
  </tr>
</xsl:template>

<xsl:template match="node">
  <td>
    <table width="100%">
      <tr bgcolor="FFEE00">
	<td colspan="1000">
	  <nobr>
	    <xsl:text>&#xA0;</xsl:text>
	    <font style="font-family:arial black">
	      <xsl:value-of select="@label"/>
	    </font>
	    <xsl:if test="@spec!=''">
	      <xsl:text>&#xA0;</xsl:text>
	      <font style="font-family:helvetica">
		<xsl:value-of select="@spec"/>
	      </font>
	    </xsl:if>
	    <xsl:text>&#xA0;</xsl:text>
	  </nobr>
	  <br/>
	  <nobr>
	    <xsl:text>&#xA0;</xsl:text>
	    <xsl:apply-templates select="location"/>
	    <xsl:text>&#xA0;</xsl:text>
	  </nobr>
	  <xsl:if test="@lexeme!=''">
	    <br/>
	    <nobr>
	      <xsl:text>&#xA0;</xsl:text>
	      <font style="font-family:courier new">
		<xsl:value-of select="@lexeme"/>
	      </font>
	      <xsl:text>&#xA0;</xsl:text>
	    </nobr>
	  </xsl:if>
	  <br/>
	  <table width="100%">
	    <xsl:apply-templates select="declAt"/>
	    <xsl:apply-templates select="lvalue"/>
	    <tr>
	      <xsl:apply-templates select="type"/>
	    </tr>
	  </table>
	  <xsl:apply-templates select="frame"/>
	  <xsl:apply-templates select="access"/>
	  <table width="100%">
	    <xsl:apply-templates select="imc"/>
	  </table>
	</td>
      </tr>
      <tr>
	<xsl:apply-templates select="node"/>
      </tr>
    </table>
  </td>
</xsl:template>

<xsl:template match="frame">
  <table width="100%">
    <tr>
      <td>
	<nobr>
	  label=<font style="font-family:courier new"><xsl:value-of select="@label"/></font>
	  depth=<xsl:value-of select="@depth"/> 
	  size=<xsl:value-of select="@size"/> 
	  locs=<xsl:value-of select="@locssize"/>
	  args=<xsl:value-of select="@argssize"/>
    	  FP=<xsl:value-of select="@FP"/>
	  RV=<xsl:value-of select="@RV"/>
	</nobr>
      </td>
    </tr>
  </table>
</xsl:template>

<xsl:template match="imc">
  <td>
    <table width="100%">
      <tr>
	<td bgcolor="C7C232" colspan="1000">
	  <xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
	  <xsl:value-of select="@instruction"/>
	  <xsl:text disable-output-escaping="yes"><![CDATA[&nbsp;]]></xsl:text>
	</td>
      </tr>
      <tr>
	<xsl:apply-templates select="imc"/>
      </tr>
    </table>
  </td>
</xsl:template>

</xsl:stylesheet>
