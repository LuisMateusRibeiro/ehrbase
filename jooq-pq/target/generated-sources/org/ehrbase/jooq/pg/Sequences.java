/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in ehr.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>ehr.sys_tenant_seq</code>
     */
    public static final Sequence<Long> SYS_TENANT_SEQ = Internal.createSequence("sys_tenant_seq", Ehr.EHR, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);
}
