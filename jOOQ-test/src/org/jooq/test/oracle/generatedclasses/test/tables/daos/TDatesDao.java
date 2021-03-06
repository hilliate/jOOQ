/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TDatesDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates, java.lang.Integer> {

	/**
	 * Create a new TDatesDao without any factory
	 */
	public TDatesDao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates.class);
	}

	/**
	 * Create a new TDatesDao with an attached factory
	 */
	public TDatesDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.ID, values);
	}

	/**
	 * Fetch a unique that has <code>ID = value</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.ID, value);
	}

	/**
	 * Fetch records that have <code>D IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates> fetchByD(java.sql.Date... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.D, values);
	}

	/**
	 * Fetch records that have <code>T IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates> fetchByT(java.sql.Timestamp... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.T, values);
	}

	/**
	 * Fetch records that have <code>TS IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates> fetchByTs(java.sql.Timestamp... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.TS, values);
	}

	/**
	 * Fetch records that have <code>D_INT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates> fetchByDInt(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.D_INT, values);
	}

	/**
	 * Fetch records that have <code>TS_BIGINT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates> fetchByTsBigint(java.lang.Long... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.TS_BIGINT, values);
	}

	/**
	 * Fetch records that have <code>I_Y IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates> fetchByIY(org.jooq.types.YearToMonth... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.I_Y, values);
	}

	/**
	 * Fetch records that have <code>I_D IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates> fetchByID(org.jooq.types.DayToSecond... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.I_D, values);
	}
}
