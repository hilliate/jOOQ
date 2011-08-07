/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Sequences extends org.jooq.impl.TableImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord> {

	private static final long serialVersionUID = 1518443077;

	/**
	 * The singleton instance of SEQUENCES
	 */
	public static final org.jooq.util.db2.syscat.tables.Sequences SEQUENCES = new org.jooq.util.db2.syscat.tables.Sequences();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.db2.syscat.tables.records.SequencesRecord> __RECORD_TYPE = org.jooq.util.db2.syscat.tables.records.SequencesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.db2.syscat.tables.records.SequencesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> SEQSCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("SEQSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> SEQNAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("SEQNAME", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> DEFINER = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("DEFINER", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> DEFINERTYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("DEFINERTYPE", org.jooq.impl.SQLDataType.CHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> OWNER = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("OWNER", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> OWNERTYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("OWNERTYPE", org.jooq.impl.SQLDataType.CHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Integer> SEQID = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Integer>("SEQID", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> SEQTYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("SEQTYPE", org.jooq.impl.SQLDataType.CHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> BASE_SEQSCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("BASE_SEQSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> BASE_SEQNAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("BASE_SEQNAME", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger> INCREMENT = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger>("INCREMENT", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger> START = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger>("START", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger> MAXVALUE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger>("MAXVALUE", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger> MINVALUE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger>("MINVALUE", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger> NEXTCACHEFIRSTVALUE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.math.BigInteger>("NEXTCACHEFIRSTVALUE", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> CYCLE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("CYCLE", org.jooq.impl.SQLDataType.CHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Integer> CACHE = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Integer>("CACHE", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> ORDER = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("ORDER", org.jooq.impl.SQLDataType.CHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Integer> DATATYPEID = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Integer>("DATATYPEID", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Integer> SOURCETYPEID = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Integer>("SOURCETYPEID", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.sql.Timestamp> CREATE_TIME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.sql.Timestamp>("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.sql.Timestamp> ALTER_TIME = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.sql.Timestamp>("ALTER_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Short> PRECISION = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.Short>("PRECISION", org.jooq.impl.SQLDataType.SMALLINT, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> ORIGIN = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("ORIGIN", org.jooq.impl.SQLDataType.CHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String> REMARKS = new org.jooq.impl.TableFieldImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord, java.lang.String>("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * No further instances allowed
	 */
	private Sequences() {
		super("SEQUENCES", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}