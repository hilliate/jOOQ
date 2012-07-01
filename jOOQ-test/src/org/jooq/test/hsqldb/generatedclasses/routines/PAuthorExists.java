/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1333440240;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RESULT = createParameter("RESULT", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PAuthorExists() {
		super("P_AUTHOR_EXISTS", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.PAuthorExists.AUTHOR_NAME, value);
	}

	public java.lang.Integer getResult() {
		return getValue(RESULT);
	}
}
