/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PArrays2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1760518395;


	/**
	 * The procedure parameter <code>PUBLIC.P_ARRAYS2.IN_ARRAY</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * The procedure parameter <code>PUBLIC.P_ARRAYS2.OUT_ARRAY</code>
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> OUT_ARRAY = createParameter("OUT_ARRAY", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PArrays2() {
		super("P_ARRAYS2", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.Long[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.PArrays2.IN_ARRAY, value);
	}

	/**
	 * Get the <code>OUT_ARRAY</code> parameter OUT value from the routine
	 */
	public java.lang.Long[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
