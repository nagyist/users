/*
 * This file is generated by jOOQ.
*/
package org.openforis.users.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.openforis.users.jooq.tables.OfGroup;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OfGroupRecord extends UpdatableRecordImpl<OfGroupRecord> implements Record7<Long, String, String, String, Boolean, Boolean, String> {

    private static final long serialVersionUID = -860851519;

    /**
     * Setter for <code>OF_USERS.OF_GROUP.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_GROUP.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>OF_USERS.OF_GROUP.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_GROUP.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>OF_USERS.OF_GROUP.LABEL</code>.
     */
    public void setLabel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_GROUP.LABEL</code>.
     */
    public String getLabel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>OF_USERS.OF_GROUP.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_GROUP.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>OF_USERS.OF_GROUP.ENABLED</code>.
     */
    public void setEnabled(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_GROUP.ENABLED</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>OF_USERS.OF_GROUP.SYSTEM_DEFINED</code>.
     */
    public void setSystemDefined(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_GROUP.SYSTEM_DEFINED</code>.
     */
    public Boolean getSystemDefined() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>OF_USERS.OF_GROUP.VISIBILITY</code>. PUB=Public, PRV=Private
     */
    public void setVisibility(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>OF_USERS.OF_GROUP.VISIBILITY</code>. PUB=Public, PRV=Private
     */
    public String getVisibility() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, Boolean, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, Boolean, Boolean, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return OfGroup.OF_GROUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OfGroup.OF_GROUP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OfGroup.OF_GROUP.LABEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OfGroup.OF_GROUP.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return OfGroup.OF_GROUP.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return OfGroup.OF_GROUP.SYSTEM_DEFINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return OfGroup.OF_GROUP.VISIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLabel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getSystemDefined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfGroupRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfGroupRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfGroupRecord value3(String value) {
        setLabel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfGroupRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfGroupRecord value5(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfGroupRecord value6(Boolean value) {
        setSystemDefined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfGroupRecord value7(String value) {
        setVisibility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfGroupRecord values(Long value1, String value2, String value3, String value4, Boolean value5, Boolean value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OfGroupRecord
     */
    public OfGroupRecord() {
        super(OfGroup.OF_GROUP);
    }

    /**
     * Create a detached, initialised OfGroupRecord
     */
    public OfGroupRecord(Long id, String name, String label, String description, Boolean enabled, Boolean systemDefined, String visibility) {
        super(OfGroup.OF_GROUP);

        set(0, id);
        set(1, name);
        set(2, label);
        set(3, description);
        set(4, enabled);
        set(5, systemDefined);
        set(6, visibility);
    }
}
