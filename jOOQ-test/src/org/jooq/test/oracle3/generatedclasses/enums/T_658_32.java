/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
public enum T_658_32 implements java.lang.Cloneable, org.jooq.MasterDataType<java.lang.Long> {

	/**
	 * 1
	 */
	_1(1L, 1L),

	/**
	 * 2
	 */
	_2(2L, 2L),

	/**
	 * 3
	 */
	_3(3L, 3L),
	;

	private final java.lang.Long ID;
	private final java.lang.Long CD;

	private T_658_32(java.lang.Long ID, java.lang.Long CD) {
		this.ID = ID;
		this.CD = CD;
	}

	@Override
	public java.lang.Long getPrimaryKey() {
		return ID;
	}

	/**
	 * The table column <code>TEST.T_658_32.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final java.lang.Long getID() {
		return ID;
	}

	/**
	 * The table column <code>TEST.T_658_32.CD</code>
	 */
	public final java.lang.Long getCD() {
		return CD;
	}
}
