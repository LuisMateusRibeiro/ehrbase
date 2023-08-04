/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.TemplateStoreRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class TemplateStore extends TableImpl<TemplateStoreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.template_store</code>
     */
    public static final TemplateStore TEMPLATE_STORE = new TemplateStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TemplateStoreRecord> getRecordType() {
        return TemplateStoreRecord.class;
    }

    /**
     * The column <code>ehr.template_store.id</code>.
     */
    public final TableField<TemplateStoreRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.template_store.template_id</code>.
     */
    public final TableField<TemplateStoreRecord, String> TEMPLATE_ID = createField(DSL.name("template_id"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ehr.template_store.content</code>.
     */
    public final TableField<TemplateStoreRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.template_store.sys_transaction</code>.
     */
    public final TableField<TemplateStoreRecord, Timestamp> SYS_TRANSACTION = createField(DSL.name("sys_transaction"), SQLDataType.TIMESTAMP(6).nullable(false), this, "");

    /**
     * The column <code>ehr.template_store.sys_tenant</code>.
     */
    public final TableField<TemplateStoreRecord, Short> SYS_TENANT = createField(DSL.name("sys_tenant"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.field(DSL.raw("1"), SQLDataType.SMALLINT)), this, "");

    private TemplateStore(Name alias, Table<TemplateStoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private TemplateStore(Name alias, Table<TemplateStoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.template_store</code> table reference
     */
    public TemplateStore(String alias) {
        this(DSL.name(alias), TEMPLATE_STORE);
    }

    /**
     * Create an aliased <code>ehr.template_store</code> table reference
     */
    public TemplateStore(Name alias) {
        this(alias, TEMPLATE_STORE);
    }

    /**
     * Create a <code>ehr.template_store</code> table reference
     */
    public TemplateStore() {
        this(DSL.name("template_store"), null);
    }

    public <O extends Record> TemplateStore(Table<O> child, ForeignKey<O, TemplateStoreRecord> key) {
        super(child, key, TEMPLATE_STORE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public UniqueKey<TemplateStoreRecord> getPrimaryKey() {
        return Keys.TEMPLATE_STORE_PKEY;
    }

    @Override
    public List<ForeignKey<TemplateStoreRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TEMPLATE_STORE__TEMPLATE_STORE_SYS_TENANT_FKEY);
    }

    private transient Tenant _tenant;

    /**
     * Get the implicit join path to the <code>ehr.tenant</code> table.
     */
    public Tenant tenant() {
        if (_tenant == null)
            _tenant = new Tenant(this, Keys.TEMPLATE_STORE__TEMPLATE_STORE_SYS_TENANT_FKEY);

        return _tenant;
    }

    @Override
    public TemplateStore as(String alias) {
        return new TemplateStore(DSL.name(alias), this);
    }

    @Override
    public TemplateStore as(Name alias) {
        return new TemplateStore(alias, this);
    }

    @Override
    public TemplateStore as(Table<?> alias) {
        return new TemplateStore(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateStore rename(String name) {
        return new TemplateStore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateStore rename(Name name) {
        return new TemplateStore(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TemplateStore rename(Table<?> name) {
        return new TemplateStore(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, String, String, Timestamp, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super UUID, ? super String, ? super String, ? super Timestamp, ? super Short, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super UUID, ? super String, ? super String, ? super Timestamp, ? super Short, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
