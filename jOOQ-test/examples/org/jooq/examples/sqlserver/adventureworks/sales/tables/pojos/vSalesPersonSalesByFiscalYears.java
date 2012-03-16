/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vSalesPersonSalesByFiscalYears", schema = "Sales")
public class vSalesPersonSalesByFiscalYears implements java.io.Serializable {

	private static final long serialVersionUID = -664734633;

	private java.lang.Integer    SalesPersonID;
	private java.lang.String     FullName;
	private java.lang.String     Title;
	private java.lang.String     SalesTerritory;
	private java.math.BigDecimal _2002;
	private java.math.BigDecimal _2003;
	private java.math.BigDecimal _2004;

	@javax.persistence.Column(name = "SalesPersonID", precision = 10)
	public java.lang.Integer getSalesPersonID() {
		return this.SalesPersonID;
	}

	public void setSalesPersonID(java.lang.Integer SalesPersonID) {
		this.SalesPersonID = SalesPersonID;
	}

	@javax.persistence.Column(name = "FullName", length = 152)
	public java.lang.String getFullName() {
		return this.FullName;
	}

	public void setFullName(java.lang.String FullName) {
		this.FullName = FullName;
	}

	@javax.persistence.Column(name = "Title", nullable = false, length = 50)
	public java.lang.String getTitle() {
		return this.Title;
	}

	public void setTitle(java.lang.String Title) {
		this.Title = Title;
	}

	@javax.persistence.Column(name = "SalesTerritory", nullable = false, length = 50)
	public java.lang.String getSalesTerritory() {
		return this.SalesTerritory;
	}

	public void setSalesTerritory(java.lang.String SalesTerritory) {
		this.SalesTerritory = SalesTerritory;
	}

	@javax.persistence.Column(name = "2002", precision = 19, scale = 4)
	public java.math.BigDecimal get2002() {
		return this._2002;
	}

	public void set2002(java.math.BigDecimal _2002) {
		this._2002 = _2002;
	}

	@javax.persistence.Column(name = "2003", precision = 19, scale = 4)
	public java.math.BigDecimal get2003() {
		return this._2003;
	}

	public void set2003(java.math.BigDecimal _2003) {
		this._2003 = _2003;
	}

	@javax.persistence.Column(name = "2004", precision = 19, scale = 4)
	public java.math.BigDecimal get2004() {
		return this._2004;
	}

	public void set2004(java.math.BigDecimal _2004) {
		this._2004 = _2004;
	}
}