/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vEmployeeDepartment", schema = "HumanResources")
public class vEmployeeDepartment extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment> {

	private static final long serialVersionUID = 1365701659;

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.EmployeeID</code>
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.EmployeeID, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.EmployeeID</code>
	 */
	@javax.persistence.Column(name = "EmployeeID", nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.EmployeeID);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Title</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Title, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Title</code>
	 */
	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Title);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.FirstName</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.FirstName, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.FirstName</code>
	 */
	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.FirstName);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.MiddleName</code>
	 */
	public void setMiddleName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.MiddleName, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.MiddleName</code>
	 */
	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.MiddleName);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.LastName</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.LastName, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.LastName</code>
	 */
	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.LastName);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Suffix</code>
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Suffix, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Suffix</code>
	 */
	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Suffix);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.JobTitle</code>
	 */
	public void setJobTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.JobTitle, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.JobTitle</code>
	 */
	@javax.persistence.Column(name = "JobTitle", nullable = false, length = 50)
	public java.lang.String getJobTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.JobTitle);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Department</code>
	 */
	public void setDepartment(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Department, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Department</code>
	 */
	@javax.persistence.Column(name = "Department", nullable = false, length = 50)
	public java.lang.String getDepartment() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.Department);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.GroupName</code>
	 */
	public void setGroupName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.GroupName, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.GroupName</code>
	 */
	@javax.persistence.Column(name = "GroupName", nullable = false, length = 50)
	public java.lang.String getGroupName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.GroupName);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.StartDate</code>
	 */
	public void setStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.StartDate, value);
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.StartDate</code>
	 */
	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment.StartDate);
	}

	/**
	 * Create a detached vEmployeeDepartment
	 */
	public vEmployeeDepartment() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment);
	}
}
