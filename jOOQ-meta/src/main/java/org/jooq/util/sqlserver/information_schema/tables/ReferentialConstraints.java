/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class ReferentialConstraints extends org.jooq.impl.TableImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord> {

	private static final long serialVersionUID = 981058064;

	/**
	 * The singleton instance of REFERENTIAL_CONSTRAINTS
	 */
	public static final org.jooq.util.sqlserver.information_schema.tables.ReferentialConstraints REFERENTIAL_CONSTRAINTS = new org.jooq.util.sqlserver.information_schema.tables.ReferentialConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord> __RECORD_TYPE = org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> CONSTRAINT_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> CONSTRAINT_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> CONSTRAINT_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> UNIQUE_CONSTRAINT_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("UNIQUE_CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> UNIQUE_CONSTRAINT_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("UNIQUE_CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> UNIQUE_CONSTRAINT_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("UNIQUE_CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> MATCH_OPTION = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("MATCH_OPTION", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> UPDATE_RULE = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("UPDATE_RULE", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> DELETE_RULE = new org.jooq.impl.TableFieldImpl<org.jooq.util.sqlserver.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String>("DELETE_RULE", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private ReferentialConstraints() {
		super("REFERENTIAL_CONSTRAINTS", org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}