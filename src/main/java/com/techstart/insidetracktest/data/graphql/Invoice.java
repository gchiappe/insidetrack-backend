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

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.Field;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Document("invoices")
public class Invoice {
    private @Id String number;

    private @Field("purchase_date") LocalDate purchaseDate;
    private @Field("detail") List<InvoiceDetail> details;
    private @Field("total_purchases") Integer totalPurchases;
    private @Field("total_payment") Double totalPayment;
    private @Field("customer") Customer customer;
    private @Field("distributor") Distributor distributor;

    public String getNumber() {
        return number;
    }

    public Invoice setNumber(String number) {
        this.number = number;
        return this;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public Invoice setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    public List<InvoiceDetail> getDetails() {
        return details;
    }

    public Invoice setDetails(List<InvoiceDetail> details) {
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

    public Double getTotalPayment() {
        return totalPayment;
    }

    public Invoice setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
        return this;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "number='" + number + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", details=" + details +
                ", totalPurchases=" + totalPurchases +
                ", totalPayment=" + totalPayment +
                ", customer=" + customer +
                ", distributor=" + distributor +
                '}';
    }
}
