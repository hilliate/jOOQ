<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:import href="src/main/resources/html-util.xsl"/>

	<xsl:output encoding="UTF-8" method="html" omit-xml-declaration="yes" indent="yes"/>

	<xsl:variable name="apos">&apos;</xsl:variable>
	<xsl:param name="relativePath"/>
	<xsl:param name="root"/>

	<!-- Main match -->

	<xsl:template match="/">
		<xsl:text disable-output-escaping="yes">
&lt;?php
// The following content has been XSL transformed from manual.xml using html-page.xsl
// Please do not edit this content manually
require '</xsl:text><xsl:value-of select="$relativePath"/><xsl:text disable-output-escaping="yes">frame.php';
function getH1() {
    return "The jOOQ User Manual. Single Page";
}
function getActiveMenu() {
	return "learn";
}
function printContent() {
    global $root;
?&gt;
</xsl:text>

		<!-- Display the main section's content -->
		<xsl:apply-templates select="/manual/section/content"/>

		<!-- Display the overall table of contents -->
		<h2 id="toc"><a href="#toc" name="toc">#</a> Table of contents</h2>
		<xsl:apply-templates select="/manual/section" mode="toc"/>

		<xsl:for-each select="/manual/section//section">
			<h2 id="{@id}">
				<a name="{@id}" href="#{@id}">#</a>
				<xsl:text> </xsl:text>
				<xsl:apply-templates select="." mode="chapter-number"/>
				<xsl:text> </xsl:text>
				<xsl:value-of select="title"/>
			</h2>

			<xsl:apply-templates select="content" />
		</xsl:for-each>

		<xsl:text disable-output-escaping="yes">
&lt;?php
}
?&gt;
</xsl:text>
	</xsl:template>

	<!-- matching templates -->

	<xsl:template match="//section" mode="content">
		<xsl:value-of select="@id"/>
		<br/>
	</xsl:template>

	<xsl:template match="section" mode="href">
		<xsl:text>#</xsl:text>
		<xsl:value-of select="@id"/>
	</xsl:template>

	<xsl:template match="section" mode="chapter-number">
		<xsl:if test="@id != 'manual'">
			<xsl:apply-templates select="../.." mode="chapter-number"/>

			<xsl:value-of select="count(preceding-sibling::section) + 1"/>
			<xsl:text>.</xsl:text>
		</xsl:if>
	</xsl:template>
</xsl:stylesheet>