/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Document", schema = "Production")
public class Document implements java.io.Serializable {

	private static final long serialVersionUID = -618458402;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  DocumentID;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   Title;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	private java.lang.String   FileName;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 8)
	private java.lang.String   FileExtension;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 5)
	private java.lang.String   Revision;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  ChangeNumber;

	@javax.validation.constraints.NotNull
	private java.lang.Byte     Status;
	private java.lang.String   DocumentSummary;
	private byte[]             Document;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "DocumentID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getDocumentID() {
		return this.DocumentID;
	}

	public void setDocumentID(java.lang.Integer DocumentID) {
		this.DocumentID = DocumentID;
	}

	@javax.persistence.Column(name = "Title", nullable = false, length = 50)
	public java.lang.String getTitle() {
		return this.Title;
	}

	public void setTitle(java.lang.String Title) {
		this.Title = Title;
	}

	@javax.persistence.Column(name = "FileName", nullable = false, length = 400)
	public java.lang.String getFileName() {
		return this.FileName;
	}

	public void setFileName(java.lang.String FileName) {
		this.FileName = FileName;
	}

	@javax.persistence.Column(name = "FileExtension", nullable = false, length = 8)
	public java.lang.String getFileExtension() {
		return this.FileExtension;
	}

	public void setFileExtension(java.lang.String FileExtension) {
		this.FileExtension = FileExtension;
	}

	@javax.persistence.Column(name = "Revision", nullable = false, length = 5)
	public java.lang.String getRevision() {
		return this.Revision;
	}

	public void setRevision(java.lang.String Revision) {
		this.Revision = Revision;
	}

	@javax.persistence.Column(name = "ChangeNumber", nullable = false, precision = 10)
	public java.lang.Integer getChangeNumber() {
		return this.ChangeNumber;
	}

	public void setChangeNumber(java.lang.Integer ChangeNumber) {
		this.ChangeNumber = ChangeNumber;
	}

	@javax.persistence.Column(name = "Status", nullable = false, precision = 3)
	public java.lang.Byte getStatus() {
		return this.Status;
	}

	public void setStatus(java.lang.Byte Status) {
		this.Status = Status;
	}

	@javax.persistence.Column(name = "DocumentSummary")
	public java.lang.String getDocumentSummary() {
		return this.DocumentSummary;
	}

	public void setDocumentSummary(java.lang.String DocumentSummary) {
		this.DocumentSummary = DocumentSummary;
	}

	@javax.persistence.Column(name = "Document")
	public byte[] getDocument() {
		return this.Document;
	}

	public void setDocument(byte[] Document) {
		this.Document = Document;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
