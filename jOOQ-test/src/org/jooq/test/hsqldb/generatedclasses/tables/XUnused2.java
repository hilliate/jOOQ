/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;


import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.test.hsqldb.generatedclasses.tables.records.XUnused2Record;


/**
 * This class is generated by jOOQ.
 */
public class XUnused2 extends UpdatableTableImpl<XUnused2Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of X_UNUSED_2
	 */
	public static final XUnused2 X_UNUSED_2 = new XUnused2();

	/**
	 * The class holding records for this table
	 */
	private static final Class<XUnused2Record> RECORD_TYPE = XUnused2Record.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<XUnused2Record> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XUnused2Record, Integer> ID = new TableFieldImpl<XUnused2Record, Integer>(SQLDialect.HSQLDB, "ID", Integer.class, X_UNUSED_2);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [UNUSED_ID] REFERENCES X_UNUSED [ID, NAME]
	 */
	public static final TableField<XUnused2Record, Integer> UNUSED_ID = new TableFieldImpl<XUnused2Record, Integer>(SQLDialect.HSQLDB, "UNUSED_ID", Integer.class, X_UNUSED_2);

	/**
	 * No further instances allowed
	 */
	private XUnused2() {
		super(SQLDialect.HSQLDB, "X_UNUSED_2", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		X_UNUSED_2.addToPrimaryKey(ID);
	}

}
