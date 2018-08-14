/*
 * This file is generated by jOOQ.
 */
package meta;


import javax.annotation.Generated;

import meta.tables.Event;
import meta.tables.FlywaySchemaHistory;
import meta.tables.MailingList;
import meta.tables.Participant;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index EVENT_PKEY = Indexes0.EVENT_PKEY;
    public static final Index FLYWAY_SCHEMA_HISTORY_PK = Indexes0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final Index FLYWAY_SCHEMA_HISTORY_S_IDX = Indexes0.FLYWAY_SCHEMA_HISTORY_S_IDX;
    public static final Index MAILING_LIST_PKEY = Indexes0.MAILING_LIST_PKEY;
    public static final Index PARTICIPANT_PKEY = Indexes0.PARTICIPANT_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index EVENT_PKEY = Internal.createIndex("event_pkey", Event.EVENT, new OrderField[] { Event.EVENT.ID }, true);
        public static Index FLYWAY_SCHEMA_HISTORY_PK = Internal.createIndex("flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static Index FLYWAY_SCHEMA_HISTORY_S_IDX = Internal.createIndex("flyway_schema_history_s_idx", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS }, false);
        public static Index MAILING_LIST_PKEY = Internal.createIndex("mailing_list_pkey", MailingList.MAILING_LIST, new OrderField[] { MailingList.MAILING_LIST.ID }, true);
        public static Index PARTICIPANT_PKEY = Internal.createIndex("participant_pkey", Participant.PARTICIPANT, new OrderField[] { Participant.PARTICIPANT.ID }, true);
    }
}
