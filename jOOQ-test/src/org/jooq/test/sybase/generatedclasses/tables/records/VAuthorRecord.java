/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -2055657119;

	/**
	 * The table column <code>DBA.v_author.ID</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.ID, value);
	}

	/**
	 * The table column <code>DBA.v_author.ID</code>
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.ID);
	}

	/**
	 * The table column <code>DBA.v_author.FIRST_NAME</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * The table column <code>DBA.v_author.FIRST_NAME</code>
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.FIRST_NAME);
	}

	/**
	 * The table column <code>DBA.v_author.LAST_NAME</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.LAST_NAME, value);
	}

	/**
	 * The table column <code>DBA.v_author.LAST_NAME</code>
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.LAST_NAME);
	}

	/**
	 * The table column <code>DBA.v_author.DATE_OF_BIRTH</code>
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * The table column <code>DBA.v_author.DATE_OF_BIRTH</code>
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * The table column <code>DBA.v_author.YEAR_OF_BIRTH</code>
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * The table column <code>DBA.v_author.YEAR_OF_BIRTH</code>
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * The table column <code>DBA.v_author.ADDRESS</code>
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.ADDRESS, value);
	}

	/**
	 * The table column <code>DBA.v_author.ADDRESS</code>
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR);
	}
}
