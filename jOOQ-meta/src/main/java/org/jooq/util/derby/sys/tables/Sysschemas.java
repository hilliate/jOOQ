/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class Sysschemas extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1393598965;

	/**
	 * The singleton instance of SYS.SYSSCHEMAS
	 */
	public static final org.jooq.util.derby.sys.tables.Sysschemas SYSSCHEMAS = new org.jooq.util.derby.sys.tables.Sysschemas();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSSCHEMAS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMANAME = createField("SCHEMANAME", org.jooq.impl.SQLDataType.VARCHAR, SYSSCHEMAS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> AUTHORIZATIONID = createField("AUTHORIZATIONID", org.jooq.impl.SQLDataType.VARCHAR, SYSSCHEMAS);

	/**
	 * No further instances allowed
	 */
	private Sysschemas() {
		super("SYSSCHEMAS", org.jooq.util.derby.sys.Sys.SYS);
	}
}
