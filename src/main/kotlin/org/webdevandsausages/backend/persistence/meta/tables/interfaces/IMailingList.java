/*
 * This file is generated by jOOQ.
 */
package meta.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public interface IMailingList extends Serializable {

    /**
     * Setter for <code>public.mailing_list.id</code>.
     */
    public IMailingList setId(Long value);

    /**
     * Getter for <code>public.mailing_list.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>public.mailing_list.affiliation</code>.
     */
    public IMailingList setAffiliation(String value);

    /**
     * Getter for <code>public.mailing_list.affiliation</code>.
     */
    public String getAffiliation();

    /**
     * Setter for <code>public.mailing_list.email</code>.
     */
    public IMailingList setEmail(String value);

    /**
     * Getter for <code>public.mailing_list.email</code>.
     */
    public String getEmail();

    /**
     * Setter for <code>public.mailing_list.first_name</code>.
     */
    public IMailingList setFirstName(String value);

    /**
     * Getter for <code>public.mailing_list.first_name</code>.
     */
    public String getFirstName();

    /**
     * Setter for <code>public.mailing_list.last_name</code>.
     */
    public IMailingList setLastName(String value);

    /**
     * Getter for <code>public.mailing_list.last_name</code>.
     */
    public String getLastName();

    /**
     * Setter for <code>public.mailing_list.created</code>.
     */
    public IMailingList setCreated(Timestamp value);

    /**
     * Getter for <code>public.mailing_list.created</code>.
     */
    public Timestamp getCreated();

    /**
     * Setter for <code>public.mailing_list.receives_mail</code>.
     */
    public IMailingList setReceivesMail(Boolean value);

    /**
     * Getter for <code>public.mailing_list.receives_mail</code>.
     */
    public Boolean getReceivesMail();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IMailingList
     */
    public void from(meta.tables.interfaces.IMailingList from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IMailingList
     */
    public <E extends meta.tables.interfaces.IMailingList> E into(E into);
}
