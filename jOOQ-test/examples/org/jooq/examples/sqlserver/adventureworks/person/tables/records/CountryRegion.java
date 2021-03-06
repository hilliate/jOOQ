/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "CountryRegion", schema = "Person")
public class CountryRegion extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion> {

	private static final long serialVersionUID = -2054077458;

	/**
	 * The table column <code>Person.CountryRegion.CountryRegionCode</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setCountryRegionCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.CountryRegionCode, value);
	}

	/**
	 * The table column <code>Person.CountryRegion.CountryRegionCode</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "CountryRegionCode", unique = true, nullable = false, length = 3)
	public java.lang.String getCountryRegionCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.CountryRegionCode);
	}

	/**
	 * The table column <code>Person.CountryRegion.Name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.Name, value);
	}

	/**
	 * The table column <code>Person.CountryRegion.Name</code>
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.Name);
	}

	/**
	 * The table column <code>Person.CountryRegion.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.ModifiedDate, value);
	}

	/**
	 * The table column <code>Person.CountryRegion.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion.ModifiedDate);
	}

	/**
	 * Create a detached CountryRegion
	 */
	public CountryRegion() {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion);
	}
}
