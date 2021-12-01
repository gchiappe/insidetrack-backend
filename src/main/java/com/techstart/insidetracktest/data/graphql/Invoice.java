package com.techstart.insidetracktest.data.graphql;

/*
GraphQL Object

type Invoice {
    number: String
    purchaseDate: String
    details: [InvoiceDetail]
    totalPurchases: Int
    customer: Customer
    distributor: Distributor
}
 */

public class Invoice {
    private String number;
    private String purchaseDate;
    private Object details;
    private Integer totalPurchases;
    private Object customer;
    private Object distributor;
}
