/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import java.util.UUID;

import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompositionUid extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.composition_uid.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.composition_uid.composition_uid</code>.
     */
    public static final Parameter<UUID> COMPOSITION_UID = Internal.createParameter("composition_uid", SQLDataType.UUID, false, false);

    /**
     * The parameter <code>ehr.composition_uid.server_id</code>.
     */
    public static final Parameter<String> SERVER_ID = Internal.createParameter("server_id", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public CompositionUid() {
        super("composition_uid", Ehr.EHR, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(COMPOSITION_UID);
        addInParameter(SERVER_ID);
    }

    /**
     * Set the <code>composition_uid</code> parameter IN value to the routine
     */
    public void setCompositionUid(UUID value) {
        setValue(COMPOSITION_UID, value);
    }

    /**
     * Set the <code>composition_uid</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setCompositionUid(Field<UUID> field) {
        setField(COMPOSITION_UID, field);
    }

    /**
     * Set the <code>server_id</code> parameter IN value to the routine
     */
    public void setServerId(String value) {
        setValue(SERVER_ID, value);
    }

    /**
     * Set the <code>server_id</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setServerId(Field<String> field) {
        setField(SERVER_ID, field);
    }
}
