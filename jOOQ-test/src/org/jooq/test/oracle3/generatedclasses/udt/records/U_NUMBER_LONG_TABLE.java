/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class U_NUMBER_LONG_TABLE extends org.jooq.impl.ArrayRecordImpl<java.lang.Long> implements java.lang.Cloneable {

	private static final long serialVersionUID = 218723307;

	public U_NUMBER_LONG_TABLE(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.TEST.TEST, "U_NUMBER_LONG_TABLE", org.jooq.impl.SQLDataType.BIGINT, configuration);
	}

	public U_NUMBER_LONG_TABLE(org.jooq.Configuration configuration, java.lang.Long... array) {
		this(configuration);
		set(array);
	}

	public U_NUMBER_LONG_TABLE(org.jooq.Configuration configuration, java.util.List<? extends java.lang.Long> list) {
		this(configuration);
		setList(list);
	}
}
