/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class ClassRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ClassRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IClass {

	private static final long serialVersionUID = 419793315;

	/**
	 * The table column <code>PUBLIC.CLASS.CLASS</code>
	 */
	@Override
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Class.CLASS.CLASS_, value);
	}

	/**
	 * The table column <code>PUBLIC.CLASS.CLASS</code>
	 */
	@Override
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Class.CLASS.CLASS_);
	}

	/**
	 * Create a detached ClassRecord
	 */
	public ClassRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Class.CLASS);
	}
}
