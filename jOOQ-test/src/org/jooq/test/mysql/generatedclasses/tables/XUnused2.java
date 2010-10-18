/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.test.mysql.generatedclasses.tables.records.XUnused2Record;


/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XUnused2 extends UpdatableTableImpl<XUnused2Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of x_unused_2
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
	public static final TableField<XUnused2Record, Integer> ID = new TableFieldImpl<XUnused2Record, Integer>(SQLDialect.MYSQL, "ID", Integer.class, X_UNUSED_2);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [UNUSED_ID] REFERENCES x_unused [ID, NAME]
	 */
	public static final TableField<XUnused2Record, Integer> UNUSED_ID = new TableFieldImpl<XUnused2Record, Integer>(SQLDialect.MYSQL, "UNUSED_ID", Integer.class, X_UNUSED_2);

	/**
	 * No further instances allowed
	 */
	private XUnused2() {
		super(SQLDialect.MYSQL, "x_unused_2", Test.TEST);
	}

	/*
	 * static initialiser
	 */
	static {
		X_UNUSED_2.addToPrimaryKey(ID);
	}

}