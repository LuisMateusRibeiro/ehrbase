/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import java.util.UUID;

import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsParticipations extends AbstractRoutine<JSONB[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.js_participations.RETURN_VALUE</code>.
     */
    public static final Parameter<JSONB[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB.array(), false, false);

    /**
     * The parameter <code>ehr.js_participations.event_context_id</code>.
     */
    public static final Parameter<UUID> EVENT_CONTEXT_ID = Internal.createParameter("event_context_id", SQLDataType.UUID, false, false);

    /**
     * Create a new routine call instance
     */
    public JsParticipations() {
        super("js_participations", Ehr.EHR, SQLDataType.JSONB.array());

        setReturnParameter(RETURN_VALUE);
        addInParameter(EVENT_CONTEXT_ID);
    }

    /**
     * Set the <code>event_context_id</code> parameter IN value to the routine
     */
    public void setEventContextId(UUID value) {
        setValue(EVENT_CONTEXT_ID, value);
    }

    /**
     * Set the <code>event_context_id</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    public void setEventContextId(Field<UUID> field) {
        setField(EVENT_CONTEXT_ID, field);
    }
}