/*
 * This file is generated by jOOQ.
 */
package com.otto.lab4.jooq.tables.records;


import com.otto.lab4.jooq.tables.AppUsers;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppUsersRecord extends UpdatableRecordImpl<AppUsersRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>s335109.app_users.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>s335109.app_users.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>s335109.app_users.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>s335109.app_users.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>s335109.app_users.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>s335109.app_users.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AppUsers.APP_USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return AppUsers.APP_USERS.NAME;
    }

    @Override
    public Field<String> field3() {
        return AppUsers.APP_USERS.PASSWORD;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public AppUsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AppUsersRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AppUsersRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public AppUsersRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AppUsersRecord
     */
    public AppUsersRecord() {
        super(AppUsers.APP_USERS);
    }

    /**
     * Create a detached, initialised AppUsersRecord
     */
    public AppUsersRecord(Integer id, String name, String password) {
        super(AppUsers.APP_USERS);

        setId(id);
        setName(name);
        setPassword(password);
    }
}