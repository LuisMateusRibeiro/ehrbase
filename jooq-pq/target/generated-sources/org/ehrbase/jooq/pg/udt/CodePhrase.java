/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.udt;


import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.udt.records.CodePhraseRecord;
import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.SchemaImpl;
import org.jooq.impl.UDTImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodePhrase extends UDTImpl<CodePhraseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.code_phrase</code>
     */
    public static final CodePhrase CODE_PHRASE = new CodePhrase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CodePhraseRecord> getRecordType() {
        return CodePhraseRecord.class;
    }

    /**
     * The attribute <code>ehr.code_phrase.terminology_id_value</code>.
     */
    public static final UDTField<CodePhraseRecord, String> TERMINOLOGY_ID_VALUE = createField(DSL.name("terminology_id_value"), SQLDataType.CLOB, CODE_PHRASE, "");

    /**
     * The attribute <code>ehr.code_phrase.code_string</code>.
     */
    public static final UDTField<CodePhraseRecord, String> CODE_STRING = createField(DSL.name("code_string"), SQLDataType.CLOB, CODE_PHRASE, "");

    /**
     * No further instances allowed
     */
    private CodePhrase() {
        super("code_phrase", null, null, false);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR != null ? Ehr.EHR : new SchemaImpl(DSL.name("ehr"));
    }
}
