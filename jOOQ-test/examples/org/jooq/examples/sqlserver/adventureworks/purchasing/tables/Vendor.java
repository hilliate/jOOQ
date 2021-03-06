/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
public class Vendor extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor> {

	private static final long serialVersionUID = -87621700;

	/**
	 * The singleton instance of Purchasing.Vendor
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor Vendor = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor.class;
	}

	/**
	 * The table column <code>Purchasing.Vendor.VendorID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.lang.Integer> VendorID = createField("VendorID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Purchasing.Vendor.AccountNumber</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.lang.String> AccountNumber = createField("AccountNumber", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.Vendor.Name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.Vendor.CreditRating</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.lang.Byte> CreditRating = createField("CreditRating", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>Purchasing.Vendor.PreferredVendorStatus</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.lang.Boolean> PreferredVendorStatus = createField("PreferredVendorStatus", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The table column <code>Purchasing.Vendor.ActiveFlag</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.lang.Boolean> ActiveFlag = createField("ActiveFlag", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The table column <code>Purchasing.Vendor.PurchasingWebServiceURL</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.lang.String> PurchasingWebServiceURL = createField("PurchasingWebServiceURL", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.Vendor.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public Vendor() {
		super("Vendor", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing);
	}

	public Vendor(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor.Vendor);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.IDENTITY_Vendor;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_Vendor_VendorID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.Vendor>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_Vendor_VendorID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor(alias);
	}
}
