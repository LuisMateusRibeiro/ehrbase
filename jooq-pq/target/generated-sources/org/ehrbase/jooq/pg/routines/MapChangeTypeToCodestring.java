/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


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
public class MapChangeTypeToCodestring extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>ehr.map_change_type_to_codestring.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.map_change_type_to_codestring.literal</code>.
     */
    public static final Parameter<String> LITERAL = Internal.createParameter("literal", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public MapChangeTypeToCodestring() {
        super("map_change_type_to_codestring", Ehr.EHR, SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(LITERAL);
    }

    /**
     * Set the <code>literal</code> parameter IN value to the routine
     */
    public void setLiteral(String value) {
        setValue(LITERAL, value);
    }

    /**
     * Set the <code>literal</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setLiteral(Field<String> field) {
        setField(LITERAL, field);
    }
}
