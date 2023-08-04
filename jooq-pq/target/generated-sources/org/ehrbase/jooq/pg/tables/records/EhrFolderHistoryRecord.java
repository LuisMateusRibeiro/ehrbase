/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.time.OffsetDateTime;
import java.util.UUID;

import org.ehrbase.jooq.pg.tables.EhrFolderHistory;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record18;
import org.jooq.Record4;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EhrFolderHistoryRecord extends UpdatableRecordImpl<EhrFolderHistoryRecord> implements Record18<UUID, UUID, Integer, Integer, UUID, UUID, String, String[], String, String, Integer, UUID[], JSONB, Integer, OffsetDateTime, OffsetDateTime, Boolean, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.ehr_folder_history.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.ehr_id</code>.
     */
    public void setEhrId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.ehr_id</code>.
     */
    public UUID getEhrId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.ehr_folders_idx</code>.
     */
    public void setEhrFoldersIdx(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.ehr_folders_idx</code>.
     */
    public Integer getEhrFoldersIdx() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.row_num</code>.
     */
    public void setRowNum(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.row_num</code>.
     */
    public Integer getRowNum() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.contribution_id</code>.
     */
    public void setContributionId(UUID value) {
        set(4, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.contribution_id</code>.
     */
    public UUID getContributionId() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.audit_id</code>.
     */
    public void setAuditId(UUID value) {
        set(5, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.audit_id</code>.
     */
    public UUID getAuditId() {
        return (UUID) get(5);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.archetype_node_id</code>.
     */
    public void setArchetypeNodeId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.archetype_node_id</code>.
     */
    public String getArchetypeNodeId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.path</code>.
     */
    public void setPath(String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.path</code>.
     */
    public String[] getPath() {
        return (String[]) get(7);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.hierarchy_idx</code>.
     */
    public void setHierarchyIdx(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.hierarchy_idx</code>.
     */
    public String getHierarchyIdx() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.hierarchy_idx_cap</code>.
     */
    public void setHierarchyIdxCap(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.hierarchy_idx_cap</code>.
     */
    public String getHierarchyIdxCap() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.hierarchy_idx_len</code>.
     */
    public void setHierarchyIdxLen(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.hierarchy_idx_len</code>.
     */
    public Integer getHierarchyIdxLen() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.items</code>.
     */
    public void setItems(UUID[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.items</code>.
     */
    public UUID[] getItems() {
        return (UUID[]) get(11);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.fields</code>.
     */
    public void setFields(JSONB value) {
        set(12, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.fields</code>.
     */
    public JSONB getFields() {
        return (JSONB) get(12);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.sys_version</code>.
     */
    public void setSysVersion(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.sys_version</code>.
     */
    public Integer getSysVersion() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.sys_period_lower</code>.
     */
    public void setSysPeriodLower(OffsetDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.sys_period_lower</code>.
     */
    public OffsetDateTime getSysPeriodLower() {
        return (OffsetDateTime) get(14);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.sys_period_upper</code>.
     */
    public void setSysPeriodUpper(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.sys_period_upper</code>.
     */
    public OffsetDateTime getSysPeriodUpper() {
        return (OffsetDateTime) get(15);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.sys_deleted</code>.
     */
    public void setSysDeleted(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.sys_deleted</code>.
     */
    public Boolean getSysDeleted() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>ehr.ehr_folder_history.sys_tenant</code>.
     */
    public void setSysTenant(Short value) {
        set(17, value);
    }

    /**
     * Getter for <code>ehr.ehr_folder_history.sys_tenant</code>.
     */
    public Short getSysTenant() {
        return (Short) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<UUID, UUID, Integer, Short> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<UUID, UUID, Integer, Integer, UUID, UUID, String, String[], String, String, Integer, UUID[], JSONB, Integer, OffsetDateTime, OffsetDateTime, Boolean, Short> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<UUID, UUID, Integer, Integer, UUID, UUID, String, String[], String, String, Integer, UUID[], JSONB, Integer, OffsetDateTime, OffsetDateTime, Boolean, Short> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.ID;
    }

    @Override
    public Field<UUID> field2() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.EHR_ID;
    }

    @Override
    public Field<Integer> field3() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.EHR_FOLDERS_IDX;
    }

    @Override
    public Field<Integer> field4() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.ROW_NUM;
    }

    @Override
    public Field<UUID> field5() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.CONTRIBUTION_ID;
    }

    @Override
    public Field<UUID> field6() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.AUDIT_ID;
    }

    @Override
    public Field<String> field7() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.ARCHETYPE_NODE_ID;
    }

    @Override
    public Field<String[]> field8() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.PATH;
    }

    @Override
    public Field<String> field9() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.HIERARCHY_IDX;
    }

    @Override
    public Field<String> field10() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.HIERARCHY_IDX_CAP;
    }

    @Override
    public Field<Integer> field11() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.HIERARCHY_IDX_LEN;
    }

    @Override
    public Field<UUID[]> field12() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.ITEMS;
    }

    @Override
    public Field<JSONB> field13() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.FIELDS;
    }

    @Override
    public Field<Integer> field14() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.SYS_VERSION;
    }

    @Override
    public Field<OffsetDateTime> field15() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.SYS_PERIOD_LOWER;
    }

    @Override
    public Field<OffsetDateTime> field16() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.SYS_PERIOD_UPPER;
    }

    @Override
    public Field<Boolean> field17() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.SYS_DELETED;
    }

    @Override
    public Field<Short> field18() {
        return EhrFolderHistory.EHR_FOLDER_HISTORY.SYS_TENANT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getEhrId();
    }

    @Override
    public Integer component3() {
        return getEhrFoldersIdx();
    }

    @Override
    public Integer component4() {
        return getRowNum();
    }

    @Override
    public UUID component5() {
        return getContributionId();
    }

    @Override
    public UUID component6() {
        return getAuditId();
    }

    @Override
    public String component7() {
        return getArchetypeNodeId();
    }

    @Override
    public String[] component8() {
        return getPath();
    }

    @Override
    public String component9() {
        return getHierarchyIdx();
    }

    @Override
    public String component10() {
        return getHierarchyIdxCap();
    }

    @Override
    public Integer component11() {
        return getHierarchyIdxLen();
    }

    @Override
    public UUID[] component12() {
        return getItems();
    }

    @Override
    public JSONB component13() {
        return getFields();
    }

    @Override
    public Integer component14() {
        return getSysVersion();
    }

    @Override
    public OffsetDateTime component15() {
        return getSysPeriodLower();
    }

    @Override
    public OffsetDateTime component16() {
        return getSysPeriodUpper();
    }

    @Override
    public Boolean component17() {
        return getSysDeleted();
    }

    @Override
    public Short component18() {
        return getSysTenant();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getEhrId();
    }

    @Override
    public Integer value3() {
        return getEhrFoldersIdx();
    }

    @Override
    public Integer value4() {
        return getRowNum();
    }

    @Override
    public UUID value5() {
        return getContributionId();
    }

    @Override
    public UUID value6() {
        return getAuditId();
    }

    @Override
    public String value7() {
        return getArchetypeNodeId();
    }

    @Override
    public String[] value8() {
        return getPath();
    }

    @Override
    public String value9() {
        return getHierarchyIdx();
    }

    @Override
    public String value10() {
        return getHierarchyIdxCap();
    }

    @Override
    public Integer value11() {
        return getHierarchyIdxLen();
    }

    @Override
    public UUID[] value12() {
        return getItems();
    }

    @Override
    public JSONB value13() {
        return getFields();
    }

    @Override
    public Integer value14() {
        return getSysVersion();
    }

    @Override
    public OffsetDateTime value15() {
        return getSysPeriodLower();
    }

    @Override
    public OffsetDateTime value16() {
        return getSysPeriodUpper();
    }

    @Override
    public Boolean value17() {
        return getSysDeleted();
    }

    @Override
    public Short value18() {
        return getSysTenant();
    }

    @Override
    public EhrFolderHistoryRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value2(UUID value) {
        setEhrId(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value3(Integer value) {
        setEhrFoldersIdx(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value4(Integer value) {
        setRowNum(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value5(UUID value) {
        setContributionId(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value6(UUID value) {
        setAuditId(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value7(String value) {
        setArchetypeNodeId(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value8(String[] value) {
        setPath(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value9(String value) {
        setHierarchyIdx(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value10(String value) {
        setHierarchyIdxCap(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value11(Integer value) {
        setHierarchyIdxLen(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value12(UUID[] value) {
        setItems(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value13(JSONB value) {
        setFields(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value14(Integer value) {
        setSysVersion(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value15(OffsetDateTime value) {
        setSysPeriodLower(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value16(OffsetDateTime value) {
        setSysPeriodUpper(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value17(Boolean value) {
        setSysDeleted(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord value18(Short value) {
        setSysTenant(value);
        return this;
    }

    @Override
    public EhrFolderHistoryRecord values(UUID value1, UUID value2, Integer value3, Integer value4, UUID value5, UUID value6, String value7, String[] value8, String value9, String value10, Integer value11, UUID[] value12, JSONB value13, Integer value14, OffsetDateTime value15, OffsetDateTime value16, Boolean value17, Short value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EhrFolderHistoryRecord
     */
    public EhrFolderHistoryRecord() {
        super(EhrFolderHistory.EHR_FOLDER_HISTORY);
    }

    /**
     * Create a detached, initialised EhrFolderHistoryRecord
     */
    public EhrFolderHistoryRecord(UUID id, UUID ehrId, Integer ehrFoldersIdx, Integer rowNum, UUID contributionId, UUID auditId, String archetypeNodeId, String[] path, String hierarchyIdx, String hierarchyIdxCap, Integer hierarchyIdxLen, UUID[] items, JSONB fields, Integer sysVersion, OffsetDateTime sysPeriodLower, OffsetDateTime sysPeriodUpper, Boolean sysDeleted, Short sysTenant) {
        super(EhrFolderHistory.EHR_FOLDER_HISTORY);

        setId(id);
        setEhrId(ehrId);
        setEhrFoldersIdx(ehrFoldersIdx);
        setRowNum(rowNum);
        setContributionId(contributionId);
        setAuditId(auditId);
        setArchetypeNodeId(archetypeNodeId);
        setPath(path);
        setHierarchyIdx(hierarchyIdx);
        setHierarchyIdxCap(hierarchyIdxCap);
        setHierarchyIdxLen(hierarchyIdxLen);
        setItems(items);
        setFields(fields);
        setSysVersion(sysVersion);
        setSysPeriodLower(sysPeriodLower);
        setSysPeriodUpper(sysPeriodUpper);
        setSysDeleted(sysDeleted);
        setSysTenant(sysTenant);
        resetChangedOnNotNull();
    }
}
