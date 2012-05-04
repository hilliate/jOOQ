/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class DateAsTimestampT_976 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record> {

	private static final long serialVersionUID = 2097991947;

	/**
	 * The singleton instance of TEST.T_976
	 */
	public static final org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976 DATE_AS_TIMESTAMP_T_976 = new org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record> getRecordType() {
		return org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record, java.lang.Integer> DATE_AS_TIMESTAMP_ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record, java.sql.Timestamp> DATE_AS_TIMESTAMP_D = createField("D", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record, org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord> DATE_AS_TIMESTAMP_T = createField("T", org.jooq.impl.SQLDataType.DATE.asArrayDataType(org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record, org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord> DATE_AS_TIMESTAMP_O = createField("O", org.jooq.test.oracle2.generatedclasses.udt.DateAsTimestampT_976ObjectType.DATE_AS_TIMESTAMP_T_976_OBJECT_TYPE.getDataType(), this);

	public DateAsTimestampT_976() {
		super("T_976", org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST);
	}

	public DateAsTimestampT_976(java.lang.String alias) {
		super(alias, org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST, org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record> getMainKey() {
		return org.jooq.test.oracle2.generatedclasses.Keys.DATE_AS_TIMESTAMP_PK_T_976;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record>>asList(org.jooq.test.oracle2.generatedclasses.Keys.DATE_AS_TIMESTAMP_PK_T_976);
	}

	@Override
	public org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976 as(java.lang.String alias) {
		return new org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976(alias);
	}
}
