/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetSystemVersion extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.get_system_version.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public GetSystemVersion() {
        super("get_system_version", Ehr.EHR, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
    }
}
