/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SpecialOfferProduct", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SpecialOfferID", "ProductID"})
})
public class SpecialOfferProduct extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialOfferProduct> {

	private static final long serialVersionUID = -1237525084;

	/**
	 * The table column <code>Sales.SpecialOfferProduct.SpecialOfferID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SpecialOfferProduct_SpecialOffer_SpecialOfferID
	 * FOREIGN KEY (SpecialOfferID)
	 * REFERENCES Sales.SpecialOffer (SpecialOfferID)
	 * </pre></code>
	 */
	public void setSpecialOfferID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.SpecialOfferID, value);
	}

	/**
	 * The table column <code>Sales.SpecialOfferProduct.SpecialOfferID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SpecialOfferProduct_SpecialOffer_SpecialOfferID
	 * FOREIGN KEY (SpecialOfferID)
	 * REFERENCES Sales.SpecialOffer (SpecialOfferID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SpecialOfferID", nullable = false, precision = 10)
	public java.lang.Integer getSpecialOfferID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.SpecialOfferID);
	}

	/**
	 * The table column <code>Sales.SpecialOfferProduct.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SpecialOfferProduct_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.ProductID, value);
	}

	/**
	 * The table column <code>Sales.SpecialOfferProduct.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SpecialOfferProduct_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.ProductID);
	}

	/**
	 * The table column <code>Sales.SpecialOfferProduct.rowguid</code>
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.rowguid, value);
	}

	/**
	 * The table column <code>Sales.SpecialOfferProduct.rowguid</code>
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.rowguid);
	}

	/**
	 * The table column <code>Sales.SpecialOfferProduct.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.ModifiedDate, value);
	}

	/**
	 * The table column <code>Sales.SpecialOfferProduct.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.ModifiedDate);
	}

	/**
	 * Create a detached SpecialOfferProduct
	 */
	public SpecialOfferProduct() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct);
	}
}
