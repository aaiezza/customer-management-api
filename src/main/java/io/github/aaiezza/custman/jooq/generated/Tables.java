/*
 * This file is generated by jOOQ.
 */
package io.github.aaiezza.custman.jooq.generated;


import io.github.aaiezza.custman.jooq.generated.tables.Customer;
import io.github.aaiezza.custman.jooq.generated.tables.FlywaySchemaHistory;

import org.jooq.Generated;


/**
 * Convenience access to all tables in public.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.19.18"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables {

    /**
     * The table <code>public.customer</code>.
     */
    public static final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;
}
