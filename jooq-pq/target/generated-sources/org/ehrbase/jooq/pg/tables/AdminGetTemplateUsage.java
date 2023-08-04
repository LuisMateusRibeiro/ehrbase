/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.UUID;
import java.util.function.Function;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.AdminGetTemplateUsageRecord;
import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminGetTemplateUsage extends TableImpl<AdminGetTemplateUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.admin_get_template_usage</code>
     */
    public static final AdminGetTemplateUsage ADMIN_GET_TEMPLATE_USAGE = new AdminGetTemplateUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminGetTemplateUsageRecord> getRecordType() {
        return AdminGetTemplateUsageRecord.class;
    }

    /**
     * The column <code>ehr.admin_get_template_usage.composition_id</code>.
     */
    public final TableField<AdminGetTemplateUsageRecord, UUID> COMPOSITION_ID = createField(DSL.name("composition_id"), SQLDataType.UUID, this, "");

    private AdminGetTemplateUsage(Name alias, Table<AdminGetTemplateUsageRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private AdminGetTemplateUsage(Name alias, Table<AdminGetTemplateUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>ehr.admin_get_template_usage</code> table
     * reference
     */
    public AdminGetTemplateUsage(String alias) {
        this(DSL.name(alias), ADMIN_GET_TEMPLATE_USAGE);
    }

    /**
     * Create an aliased <code>ehr.admin_get_template_usage</code> table
     * reference
     */
    public AdminGetTemplateUsage(Name alias) {
        this(alias, ADMIN_GET_TEMPLATE_USAGE);
    }

    /**
     * Create a <code>ehr.admin_get_template_usage</code> table reference
     */
    public AdminGetTemplateUsage() {
        this(DSL.name("admin_get_template_usage"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public AdminGetTemplateUsage as(String alias) {
        return new AdminGetTemplateUsage(DSL.name(alias), this, parameters);
    }

    @Override
    public AdminGetTemplateUsage as(Name alias) {
        return new AdminGetTemplateUsage(alias, this, parameters);
    }

    @Override
    public AdminGetTemplateUsage as(Table<?> alias) {
        return new AdminGetTemplateUsage(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminGetTemplateUsage rename(String name) {
        return new AdminGetTemplateUsage(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminGetTemplateUsage rename(Name name) {
        return new AdminGetTemplateUsage(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminGetTemplateUsage rename(Table<?> name) {
        return new AdminGetTemplateUsage(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<UUID> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public AdminGetTemplateUsage call(
          String targetId
    ) {
        AdminGetTemplateUsage result = new AdminGetTemplateUsage(DSL.name("admin_get_template_usage"), null, new Field[] {
            DSL.val(targetId, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public AdminGetTemplateUsage call(
          Field<String> targetId
    ) {
        AdminGetTemplateUsage result = new AdminGetTemplateUsage(DSL.name("admin_get_template_usage"), null, new Field[] {
            targetId
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super UUID, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super UUID, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
