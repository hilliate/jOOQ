/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables;

/**
 * This class is generated by jOOQ.
 */
public class DatabaseLog extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog> {

	private static final long serialVersionUID = -851968801;

	/**
	 * The singleton instance of dbo.DatabaseLog
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog DatabaseLog = new org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.Integer> DatabaseLogID = createField("DatabaseLogID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.sql.Timestamp> PostTime = createField("PostTime", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.String> DatabaseUser = createField("DatabaseUser", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.String> Event = createField("Event", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.String> Schema = createField("Schema", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.String> Object = createField("Object", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.String> TSQL = createField("TSQL", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.Object> XmlEvent = createField("XmlEvent", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	public DatabaseLog() {
		super("DatabaseLog", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo);
	}

	public DatabaseLog(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo, org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.IDENTITY_DatabaseLog;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_DatabaseLog_DatabaseLogID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog>>asList(org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_DatabaseLog_DatabaseLogID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog(alias);
	}
}