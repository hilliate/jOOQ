/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_725_lob_test", schema = "public")
public class T_725LobTest implements java.io.Serializable {

	private static final long serialVersionUID = 1153134670;

	private final java.lang.Integer id;
	private final byte[]            lob;

	public T_725LobTest(
		java.lang.Integer id,
		byte[]            lob
	) {
		this.id = id;
		this.lob = lob;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return this.id;
	}

	@javax.persistence.Column(name = "lob")
	public byte[] getLob() {
		return this.lob;
	}
}
