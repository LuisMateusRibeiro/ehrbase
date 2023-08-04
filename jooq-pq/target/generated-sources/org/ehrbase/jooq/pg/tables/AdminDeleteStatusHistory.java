/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.UUID;
import java.util.function.Function;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.AdminDeleteStatusHistoryRecord;
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
public class AdminDeleteStatusHistory extends TableImpl<AdminDeleteStatusHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.admin_delete_status_history</code>
     */
    public static final AdminDeleteStatusHistory ADMIN_DELETE_STATUS_HISTORY = new AdminDeleteStatusHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminDeleteStatusHistoryRecord> getRecordType() {
        return AdminDeleteStatusHistoryRecord.class;
    }

    /**
     * The column <code>ehr.admin_delete_status_history.num</code>.
     */
    public final TableField<AdminDeleteStatusHistoryRecord, Integer> NUM = createField(DSL.name("num"), SQLDataType.INTEGER, this, "");

    private AdminDeleteStatusHistory(Name alias, Table<AdminDeleteStatusHistoryRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.UUID)
        });
    }

    private AdminDeleteStatusHistory(Name alias, Table<AdminDeleteStatusHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>ehr.admin_delete_status_history</code> table
     * reference
     */
    public AdminDeleteStatusHistory(String alias) {
        this(DSL.name(alias), ADMIN_DELETE_STATUS_HISTORY);
    }

    /**
     * Create an aliased <code>ehr.admin_delete_status_history</code> table
     * reference
     */
    public AdminDeleteStatusHistory(Name alias) {
        this(alias, ADMIN_DELETE_STATUS_HISTORY);
    }

    /**
     * Create a <code>ehr.admin_delete_status_history</code> table reference
     */
    public AdminDeleteStatusHistory() {
        this(DSL.name("admin_delete_status_history"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public AdminDeleteStatusHistory as(String alias) {
        return new AdminDeleteStatusHistory(DSL.name(alias), this, parameters);
    }

    @Override
    public AdminDeleteStatusHistory as(Name alias) {
        return new AdminDeleteStatusHistory(alias, this, parameters);
    }

    @Override
    public AdminDeleteStatusHistory as(Table<?> alias) {
        return new AdminDeleteStatusHistory(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteStatusHistory rename(String name) {
        return new AdminDeleteStatusHistory(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteStatusHistory rename(Name name) {
        return new AdminDeleteStatusHistory(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteStatusHistory rename(Table<?> name) {
        return new AdminDeleteStatusHistory(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteStatusHistory call(
          UUID statusIdInput
    ) {
        AdminDeleteStatusHistory result = new AdminDeleteStatusHistory(DSL.name("admin_delete_status_history"), null, new Field[] {
            DSL.val(statusIdInput, SQLDataType.UUID)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteStatusHistory call(
          Field<UUID> statusIdInput
    ) {
        AdminDeleteStatusHistory result = new AdminDeleteStatusHistory(DSL.name("admin_delete_status_history"), null, new Field[] {
            statusIdInput
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}