/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1723006436;

	/**
	 * The singleton instance of test.t_book
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.ingres.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES test.t_author (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The table column <code>test.t_book.co_author_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES test.t_author (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The table column <code>test.t_book.details_id</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The book's title
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK);

	/**
	 * The year the book was published in
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The language of the book
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_t_book_language_id
	 * FOREIGN KEY (language_id)
	 * REFERENCES test.t_language (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, org.jooq.test.ingres.generatedclasses.enums.TLanguage> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.ingres.generatedclasses.enums.TLanguage.class), T_BOOK);

	/**
	 * Some textual content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.LONGVARCHAR, T_BOOK);

	/**
	 * Some binary content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.LONGVARBINARY, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.ingres.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.ingres.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID);
	}
}
