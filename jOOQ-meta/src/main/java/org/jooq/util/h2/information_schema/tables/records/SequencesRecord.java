/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class SequencesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.h2.information_schema.tables.records.SequencesRecord> {

	private static final long serialVersionUID = -1470657668;

	/**
	 * An uncommented item
	 */
	public void setSequenceCatalog(java.lang.String value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSequenceCatalog() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setSequenceSchema(java.lang.String value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSequenceSchema() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setSequenceName(java.lang.String value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSequenceName() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setCurrentValue(java.lang.Long value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.CURRENT_VALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getCurrentValue() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.CURRENT_VALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setIncrement(java.lang.Long value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.INCREMENT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getIncrement() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.INCREMENT);
	}

	/**
	 * An uncommented item
	 */
	public void setIsGenerated(java.lang.Boolean value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.IS_GENERATED, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Boolean getIsGenerated() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.IS_GENERATED);
	}

	/**
	 * An uncommented item
	 */
	public void setRemarks(java.lang.String value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.REMARKS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getRemarks() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.REMARKS);
	}

	/**
	 * An uncommented item
	 */
	public void setCache(java.lang.Long value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.CACHE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getCache() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.CACHE);
	}

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.util.h2.information_schema.tables.Sequences.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.util.h2.information_schema.tables.Sequences.ID);
	}

	/**
	 * Create a detached SequencesRecord
	 */
	public SequencesRecord() {
		super(org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCES);
	}
}