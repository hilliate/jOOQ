/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "TransactionHistoryArchive", schema = "Production")
public class TransactionhistoryarchiveRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord> {

	private static final long serialVersionUID = 168681592;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setTransactionid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.TRANSACTIONID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "TransactionID", unique = true)
	public java.lang.Integer getTransactionid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.TRANSACTIONID);
	}

	/**
	 * An uncommented item
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ProductID")
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.PRODUCTID);
	}

	/**
	 * An uncommented item
	 */
	public void setReferenceorderid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.REFERENCEORDERID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ReferenceOrderID")
	public java.lang.Integer getReferenceorderid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.REFERENCEORDERID);
	}

	/**
	 * An uncommented item
	 */
	public void setReferenceorderlineid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.REFERENCEORDERLINEID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ReferenceOrderLineID")
	public java.lang.Integer getReferenceorderlineid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.REFERENCEORDERLINEID);
	}

	/**
	 * An uncommented item
	 */
	public void setTransactiondate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.TRANSACTIONDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TransactionDate")
	public java.sql.Timestamp getTransactiondate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.TRANSACTIONDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setTransactiontype(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.TRANSACTIONTYPE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TransactionType")
	public java.lang.String getTransactiontype() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.TRANSACTIONTYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setQuantity(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.QUANTITY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Quantity")
	public java.lang.Integer getQuantity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.QUANTITY);
	}

	/**
	 * An uncommented item
	 */
	public void setActualcost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.ACTUALCOST, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ActualCost")
	public java.math.BigDecimal getActualcost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.ACTUALCOST);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.MODIFIEDDATE);
	}

	/**
	 * Create a detached TransactionhistoryarchiveRecord
	 */
	public TransactionhistoryarchiveRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE);
	}
}