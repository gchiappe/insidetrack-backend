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
    private InvoiceDetail[] details;
    private Integer totalPurchases;
    private Customer customer;
    private Distributor distributor;

    public String getNumber() {
        return number;
    }

    public Invoice setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public Invoice setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    public InvoiceDetail[] getDetails() {
        return details;
    }

    public Invoice setDetails(InvoiceDetail[] details) {
        this.details = details;
        return this;
    }

    public Integer getTotalPurchases() {
        return totalPurchases;
    }

    public Invoice setTotalPurchases(Integer totalPurchases) {
        this.totalPurchases = totalPurchases;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Invoice setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public Invoice setDistributor(Distributor distributor) {
        this.distributor = distributor;
        return this;
    }
}
