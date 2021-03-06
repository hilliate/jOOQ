/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOLEANS", schema = "TEST")
public interface T_BOOLEANS_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * The table column <code>TEST.T_BOOLEANS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setID(java.lang.Integer value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * The table column <code>TEST.T_BOOLEANS.ONE_ZERO</code>
	 */
	public void setONE_ZERO(java.lang.Integer value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.ONE_ZERO</code>
	 */
	@javax.persistence.Column(name = "ONE_ZERO", precision = 7)
	public java.lang.Integer getONE_ZERO();

	/**
	 * The table column <code>TEST.T_BOOLEANS.TRUE_FALSE_LC</code>
	 */
	public void setTRUE_FALSE_LC(java.lang.String value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.TRUE_FALSE_LC</code>
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_LC", length = 5)
	public java.lang.String getTRUE_FALSE_LC();

	/**
	 * The table column <code>TEST.T_BOOLEANS.TRUE_FALSE_UC</code>
	 */
	public void setTRUE_FALSE_UC(java.lang.String value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.TRUE_FALSE_UC</code>
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_UC", length = 5)
	public java.lang.String getTRUE_FALSE_UC();

	/**
	 * The table column <code>TEST.T_BOOLEANS.YES_NO_LC</code>
	 */
	public void setYES_NO_LC(java.lang.String value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.YES_NO_LC</code>
	 */
	@javax.persistence.Column(name = "YES_NO_LC", length = 3)
	public java.lang.String getYES_NO_LC();

	/**
	 * The table column <code>TEST.T_BOOLEANS.YES_NO_UC</code>
	 */
	public void setYES_NO_UC(java.lang.String value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.YES_NO_UC</code>
	 */
	@javax.persistence.Column(name = "YES_NO_UC", length = 3)
	public java.lang.String getYES_NO_UC();

	/**
	 * The table column <code>TEST.T_BOOLEANS.Y_N_LC</code>
	 */
	public void setY_N_LC(java.lang.String value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.Y_N_LC</code>
	 */
	@javax.persistence.Column(name = "Y_N_LC", length = 1)
	public java.lang.String getY_N_LC();

	/**
	 * The table column <code>TEST.T_BOOLEANS.Y_N_UC</code>
	 */
	public void setY_N_UC(java.lang.String value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.Y_N_UC</code>
	 */
	@javax.persistence.Column(name = "Y_N_UC", length = 1)
	public java.lang.String getY_N_UC();

	/**
	 * The table column <code>TEST.T_BOOLEANS.VC_BOOLEAN</code>
	 */
	public void setVC_BOOLEAN(java.lang.String value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.VC_BOOLEAN</code>
	 */
	@javax.persistence.Column(name = "VC_BOOLEAN", length = 1)
	public java.lang.String getVC_BOOLEAN();

	/**
	 * The table column <code>TEST.T_BOOLEANS.C_BOOLEAN</code>
	 */
	public void setC_BOOLEAN(java.lang.String value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.C_BOOLEAN</code>
	 */
	@javax.persistence.Column(name = "C_BOOLEAN", length = 1)
	public java.lang.String getC_BOOLEAN();

	/**
	 * The table column <code>TEST.T_BOOLEANS.N_BOOLEAN</code>
	 */
	public void setN_BOOLEAN(java.lang.Integer value);

	/**
	 * The table column <code>TEST.T_BOOLEANS.N_BOOLEAN</code>
	 */
	@javax.persistence.Column(name = "N_BOOLEAN", precision = 7)
	public java.lang.Integer getN_BOOLEAN();
}
