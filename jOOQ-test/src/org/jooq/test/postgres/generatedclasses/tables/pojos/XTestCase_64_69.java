/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_64_69", schema = "public")
public class XTestCase_64_69 implements java.io.Serializable {

	private static final long serialVersionUID = 129304428;

	private final java.lang.Integer id;
	private final java.lang.Integer unusedId;

	public XTestCase_64_69(
		java.lang.Integer id,
		java.lang.Integer unusedId
	) {
		this.id = id;
		this.unusedId = unusedId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return this.id;
	}

	@javax.persistence.Column(name = "unused_id", precision = 32)
	public java.lang.Integer getUnusedId() {
		return this.unusedId;
	}
}
