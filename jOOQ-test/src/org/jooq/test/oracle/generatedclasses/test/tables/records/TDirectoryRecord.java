/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DIRECTORY", schema = "TEST")
public class TDirectoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> {

	private static final long serialVersionUID = -519277969;

	/**
	 * The table column <code>TEST.T_DIRECTORY.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID, value);
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID);
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> fetchTDirectoryList() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID)))
			.fetch();
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.PARENT_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public void setParentId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID, value);
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.PARENT_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "PARENT_ID", precision = 7)
	public java.lang.Integer getParentId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord 
	 * TDirectoryRecord}
	 */
	public void setParentId(org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord value) {
		if (value == null) {
			setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID, value.getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID));
		}
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.PARENT_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord fetchTDirectory() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.IS_DIRECTORY</code>
	 */
	public void setIsDirectory(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.IS_DIRECTORY, value);
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.IS_DIRECTORY</code>
	 */
	@javax.persistence.Column(name = "IS_DIRECTORY", precision = 7)
	public java.lang.Integer getIsDirectory() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.IS_DIRECTORY);
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.NAME, value);
	}

	/**
	 * The table column <code>TEST.T_DIRECTORY.name</code>
	 */
	@javax.persistence.Column(name = "name", length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.NAME);
	}

	/**
	 * Create a detached TDirectoryRecord
	 */
	public TDirectoryRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY);
	}
}
