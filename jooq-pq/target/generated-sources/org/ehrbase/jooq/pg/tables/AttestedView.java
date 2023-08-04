/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.AttestedViewRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttestedView extends TableImpl<AttestedViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.attested_view</code>
     */
    public static final AttestedView ATTESTED_VIEW = new AttestedView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttestedViewRecord> getRecordType() {
        return AttestedViewRecord.class;
    }

    /**
     * The column <code>ehr.attested_view.id</code>.
     */
    public final TableField<AttestedViewRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field(DSL.raw("uuid_generate_v4()"), SQLDataType.UUID)), this, "");

    /**
     * The column <code>ehr.attested_view.attestation_id</code>.
     */
    public final TableField<AttestedViewRecord, UUID> ATTESTATION_ID = createField(DSL.name("attestation_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.attested_view.alternate_text</code>.
     */
    public final TableField<AttestedViewRecord, String> ALTERNATE_TEXT = createField(DSL.name("alternate_text"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.attested_view.compression_algorithm</code>.
     */
    public final TableField<AttestedViewRecord, String> COMPRESSION_ALGORITHM = createField(DSL.name("compression_algorithm"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.attested_view.media_type</code>.
     */
    public final TableField<AttestedViewRecord, String> MEDIA_TYPE = createField(DSL.name("media_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.attested_view.data</code>.
     */
    public final TableField<AttestedViewRecord, byte[]> DATA = createField(DSL.name("data"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>ehr.attested_view.integrity_check</code>.
     */
    public final TableField<AttestedViewRecord, byte[]> INTEGRITY_CHECK = createField(DSL.name("integrity_check"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>ehr.attested_view.integrity_check_algorithm</code>.
     */
    public final TableField<AttestedViewRecord, String> INTEGRITY_CHECK_ALGORITHM = createField(DSL.name("integrity_check_algorithm"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.attested_view.thumbnail</code>.
     */
    public final TableField<AttestedViewRecord, UUID> THUMBNAIL = createField(DSL.name("thumbnail"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.attested_view.uri</code>.
     */
    public final TableField<AttestedViewRecord, String> URI = createField(DSL.name("uri"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.attested_view.sys_tenant</code>.
     */
    public final TableField<AttestedViewRecord, Short> SYS_TENANT = createField(DSL.name("sys_tenant"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.field(DSL.raw("1"), SQLDataType.SMALLINT)), this, "");

    private AttestedView(Name alias, Table<AttestedViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private AttestedView(Name alias, Table<AttestedViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.attested_view</code> table reference
     */
    public AttestedView(String alias) {
        this(DSL.name(alias), ATTESTED_VIEW);
    }

    /**
     * Create an aliased <code>ehr.attested_view</code> table reference
     */
    public AttestedView(Name alias) {
        this(alias, ATTESTED_VIEW);
    }

    /**
     * Create a <code>ehr.attested_view</code> table reference
     */
    public AttestedView() {
        this(DSL.name("attested_view"), null);
    }

    public <O extends Record> AttestedView(Table<O> child, ForeignKey<O, AttestedViewRecord> key) {
        super(child, key, ATTESTED_VIEW);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ATTESTED_VIEW_ATTESTATION_IDX);
    }

    @Override
    public UniqueKey<AttestedViewRecord> getPrimaryKey() {
        return Keys.ATTESTED_VIEW_PKEY;
    }

    @Override
    public List<ForeignKey<AttestedViewRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ATTESTED_VIEW__ATTESTED_VIEW_ATTESTATION_ID_FKEY, Keys.ATTESTED_VIEW__ATTESTED_VIEW_SYS_TENANT_FKEY);
    }

    private transient Attestation _attestation;
    private transient Tenant _tenant;

    /**
     * Get the implicit join path to the <code>ehr.attestation</code> table.
     */
    public Attestation attestation() {
        if (_attestation == null)
            _attestation = new Attestation(this, Keys.ATTESTED_VIEW__ATTESTED_VIEW_ATTESTATION_ID_FKEY);

        return _attestation;
    }

    /**
     * Get the implicit join path to the <code>ehr.tenant</code> table.
     */
    public Tenant tenant() {
        if (_tenant == null)
            _tenant = new Tenant(this, Keys.ATTESTED_VIEW__ATTESTED_VIEW_SYS_TENANT_FKEY);

        return _tenant;
    }

    @Override
    public AttestedView as(String alias) {
        return new AttestedView(DSL.name(alias), this);
    }

    @Override
    public AttestedView as(Name alias) {
        return new AttestedView(alias, this);
    }

    @Override
    public AttestedView as(Table<?> alias) {
        return new AttestedView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AttestedView rename(String name) {
        return new AttestedView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AttestedView rename(Name name) {
        return new AttestedView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AttestedView rename(Table<?> name) {
        return new AttestedView(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<UUID, UUID, String, String, String, byte[], byte[], String, UUID, String, Short> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super UUID, ? super UUID, ? super String, ? super String, ? super String, ? super byte[], ? super byte[], ? super String, ? super UUID, ? super String, ? super Short, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super UUID, ? super UUID, ? super String, ? super String, ? super String, ? super byte[], ? super byte[], ? super String, ? super UUID, ? super String, ? super Short, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
