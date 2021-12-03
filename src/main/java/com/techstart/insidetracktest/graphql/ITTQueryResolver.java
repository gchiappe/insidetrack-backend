package com.techstart.insidetracktest.graphql;

import com.techstart.insidetracktest.data.graphql.Customer;
import com.techstart.insidetracktest.data.graphql.Invoice;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class ITTQueryResolver implements GraphQLQueryResolver {

    public Invoice[] invoices() {
        return new Invoice[]{
            new Invoice().setCustomer(new Customer().setName("Giancarlo"))
        };
    }

}
