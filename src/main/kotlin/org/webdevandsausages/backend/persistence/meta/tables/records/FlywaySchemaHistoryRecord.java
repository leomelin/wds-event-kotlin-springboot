/*
 * This file is generated by jOOQ.
 */
package meta.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import meta.tables.FlywaySchemaHistory;
import meta.tables.interfaces.IFlywaySchemaHistory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FlywaySchemaHistoryRecord extends UpdatableRecordImpl<FlywaySchemaHistoryRecord> implements Record10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean>, IFlywaySchemaHistory {

    private static final long serialVersionUID = 1641963171;

    /**
     * Setter for <code>public.flyway_schema_history.installed_rank</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setInstalledRank(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.installed_rank</code>.
     */
    @Override
    public Integer getInstalledRank() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.flyway_schema_history.version</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setVersion(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.version</code>.
     */
    @Override
    public String getVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.flyway_schema_history.description</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.description</code>.
     */
    @Override
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.flyway_schema_history.type</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.type</code>.
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.flyway_schema_history.script</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setScript(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.script</code>.
     */
    @Override
    public String getScript() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.flyway_schema_history.checksum</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setChecksum(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.checksum</code>.
     */
    @Override
    public Integer getChecksum() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.flyway_schema_history.installed_by</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setInstalledBy(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.installed_by</code>.
     */
    @Override
    public String getInstalledBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.flyway_schema_history.installed_on</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setInstalledOn(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.installed_on</code>.
     */
    @Override
    public Timestamp getInstalledOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>public.flyway_schema_history.execution_time</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setExecutionTime(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.execution_time</code>.
     */
    @Override
    public Integer getExecutionTime() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.flyway_schema_history.success</code>.
     */
    @Override
    public FlywaySchemaHistoryRecord setSuccess(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.flyway_schema_history.success</code>.
     */
    @Override
    public Boolean getSuccess() {
        return (Boolean) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SCRIPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.CHECKSUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.EXECUTION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getInstalledRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getScript();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getChecksum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getInstalledBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getInstalledOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getExecutionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getInstalledRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getScript();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getChecksum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInstalledBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getInstalledOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getExecutionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value1(Integer value) {
        setInstalledRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value2(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value5(String value) {
        setScript(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value6(Integer value) {
        setChecksum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value7(String value) {
        setInstalledBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value8(Timestamp value) {
        setInstalledOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value9(Integer value) {
        setExecutionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord value10(Boolean value) {
        setSuccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistoryRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, Timestamp value8, Integer value9, Boolean value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IFlywaySchemaHistory from) {
        setInstalledRank(from.getInstalledRank());
        setVersion(from.getVersion());
        setDescription(from.getDescription());
        setType(from.getType());
        setScript(from.getScript());
        setChecksum(from.getChecksum());
        setInstalledBy(from.getInstalledBy());
        setInstalledOn(from.getInstalledOn());
        setExecutionTime(from.getExecutionTime());
        setSuccess(from.getSuccess());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IFlywaySchemaHistory> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FlywaySchemaHistoryRecord
     */
    public FlywaySchemaHistoryRecord() {
        super(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY);
    }

    /**
     * Create a detached, initialised FlywaySchemaHistoryRecord
     */
    public FlywaySchemaHistoryRecord(Integer installedRank, String version, String description, String type, String script, Integer checksum, String installedBy, Timestamp installedOn, Integer executionTime, Boolean success) {
        super(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY);

        set(0, installedRank);
        set(1, version);
        set(2, description);
        set(3, type);
        set(4, script);
        set(5, checksum);
        set(6, installedBy);
        set(7, installedOn);
        set(8, executionTime);
        set(9, success);
    }
}
