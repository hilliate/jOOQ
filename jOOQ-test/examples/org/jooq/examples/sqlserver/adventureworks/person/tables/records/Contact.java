/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Contact", schema = "Person")
public class Contact extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> {

	private static final long serialVersionUID = 1234321132;

	/**
	 * The table column <code>Person.Contact.ContactID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setContactID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.ContactID, value);
	}

	/**
	 * The table column <code>Person.Contact.ContactID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ContactID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getContactID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.ContactID);
	}

	/**
	 * The table column <code>Person.Contact.NameStyle</code>
	 */
	public void setNameStyle(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.NameStyle, value);
	}

	/**
	 * The table column <code>Person.Contact.NameStyle</code>
	 */
	@javax.persistence.Column(name = "NameStyle", nullable = false)
	public java.lang.Boolean getNameStyle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.NameStyle);
	}

	/**
	 * The table column <code>Person.Contact.Title</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.Title, value);
	}

	/**
	 * The table column <code>Person.Contact.Title</code>
	 */
	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.Title);
	}

	/**
	 * The table column <code>Person.Contact.FirstName</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.FirstName, value);
	}

	/**
	 * The table column <code>Person.Contact.FirstName</code>
	 */
	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.FirstName);
	}

	/**
	 * The table column <code>Person.Contact.MiddleName</code>
	 */
	public void setMiddleName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.MiddleName, value);
	}

	/**
	 * The table column <code>Person.Contact.MiddleName</code>
	 */
	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.MiddleName);
	}

	/**
	 * The table column <code>Person.Contact.LastName</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.LastName, value);
	}

	/**
	 * The table column <code>Person.Contact.LastName</code>
	 */
	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.LastName);
	}

	/**
	 * The table column <code>Person.Contact.Suffix</code>
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.Suffix, value);
	}

	/**
	 * The table column <code>Person.Contact.Suffix</code>
	 */
	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.Suffix);
	}

	/**
	 * The table column <code>Person.Contact.EmailAddress</code>
	 */
	public void setEmailAddress(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.EmailAddress, value);
	}

	/**
	 * The table column <code>Person.Contact.EmailAddress</code>
	 */
	@javax.persistence.Column(name = "EmailAddress", length = 50)
	public java.lang.String getEmailAddress() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.EmailAddress);
	}

	/**
	 * The table column <code>Person.Contact.EmailPromotion</code>
	 */
	public void setEmailPromotion(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.EmailPromotion, value);
	}

	/**
	 * The table column <code>Person.Contact.EmailPromotion</code>
	 */
	@javax.persistence.Column(name = "EmailPromotion", nullable = false, precision = 10)
	public java.lang.Integer getEmailPromotion() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.EmailPromotion);
	}

	/**
	 * The table column <code>Person.Contact.Phone</code>
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.Phone, value);
	}

	/**
	 * The table column <code>Person.Contact.Phone</code>
	 */
	@javax.persistence.Column(name = "Phone", length = 25)
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.Phone);
	}

	/**
	 * The table column <code>Person.Contact.PasswordHash</code>
	 */
	public void setPasswordHash(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.PasswordHash, value);
	}

	/**
	 * The table column <code>Person.Contact.PasswordHash</code>
	 */
	@javax.persistence.Column(name = "PasswordHash", nullable = false, length = 128)
	public java.lang.String getPasswordHash() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.PasswordHash);
	}

	/**
	 * The table column <code>Person.Contact.PasswordSalt</code>
	 */
	public void setPasswordSalt(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.PasswordSalt, value);
	}

	/**
	 * The table column <code>Person.Contact.PasswordSalt</code>
	 */
	@javax.persistence.Column(name = "PasswordSalt", nullable = false, length = 10)
	public java.lang.String getPasswordSalt() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.PasswordSalt);
	}

	/**
	 * The table column <code>Person.Contact.AdditionalContactInfo</code>
	 * <p>
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setAdditionalContactInfo(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.AdditionalContactInfo, value);
	}

	/**
	 * The table column <code>Person.Contact.AdditionalContactInfo</code>
	 * <p>
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "AdditionalContactInfo")
	public java.lang.Object getAdditionalContactInfo() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.AdditionalContactInfo);
	}

	/**
	 * The table column <code>Person.Contact.rowguid</code>
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.rowguid, value);
	}

	/**
	 * The table column <code>Person.Contact.rowguid</code>
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.rowguid);
	}

	/**
	 * The table column <code>Person.Contact.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.ModifiedDate, value);
	}

	/**
	 * The table column <code>Person.Contact.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact.ModifiedDate);
	}

	/**
	 * Create a detached Contact
	 */
	public Contact() {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact);
	}
}
