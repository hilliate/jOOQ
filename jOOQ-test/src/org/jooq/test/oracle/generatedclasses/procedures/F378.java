/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class F378 extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = 2035724473;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> I = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("I", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> IO = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("IO", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> O = new org.jooq.impl.ParameterImpl<java.math.BigDecimal>("O", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new procedure call instance
	 */
	public F378() {
		super(org.jooq.SQLDialect.ORACLE, "F378", org.jooq.test.oracle.generatedclasses.Test.TEST);

		setReturnParameter(RETURN_VALUE);
		addInParameter(I);
		addInOutParameter(IO);
		addOutParameter(O);
	}

	public void setI(java.lang.Number value) {
		setNumber(I, value);
	}

	public void setIo(java.lang.Number value) {
		setNumber(IO, value);
	}

	public java.math.BigDecimal getReturnValue() {
		return getValue(RETURN_VALUE);
	}

	public java.math.BigDecimal getIo() {
		return getValue(IO);
	}

	public java.math.BigDecimal getO() {
		return getValue(O);
	}
}