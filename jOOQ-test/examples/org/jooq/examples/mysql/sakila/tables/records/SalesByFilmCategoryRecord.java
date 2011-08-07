/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class SalesByFilmCategoryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord> {

	private static final long serialVersionUID = -1184597220;

	/**
	 * An uncommented item
	 */
	public void setCategory(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory.CATEGORY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCategory() {
		return getValue(org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory.CATEGORY);
	}

	/**
	 * An uncommented item
	 */
	public void setTotalSales(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory.TOTAL_SALES, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getTotalSales() {
		return getValue(org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory.TOTAL_SALES);
	}

	/**
	 * Create a detached SalesByFilmCategoryRecord
	 */
	public SalesByFilmCategoryRecord() {
		super(org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory.SALES_BY_FILM_CATEGORY);
	}

	/**
	 * Create an attached SalesByFilmCategoryRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public SalesByFilmCategoryRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory.SALES_BY_FILM_CATEGORY, configuration);
	}
}