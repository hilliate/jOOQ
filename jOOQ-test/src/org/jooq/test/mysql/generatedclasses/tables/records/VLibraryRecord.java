/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 1172762543;

	/**
	 * The table column <code>test.v_library.AUTHOR</code>
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VLibrary.AUTHOR, value);
	}

	/**
	 * The table column <code>test.v_library.AUTHOR</code>
	 */
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VLibrary.AUTHOR);
	}

	/**
	 * The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.VLibrary.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.VLibrary.TITLE);
	}

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.mysql.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
