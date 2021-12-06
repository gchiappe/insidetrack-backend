package com.techstart.insidetracktest.graphql;

import com.techstart.insidetracktest.data.arangodb.InvoiceRepository;
import com.techstart.insidetracktest.data.graphql.*;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class ITTQueryResolver implements GraphQLQueryResolver {

    private InvoiceRepository invoiceRepository;

    public ITTQueryResolver(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Iterable<Invoice> invoices() {
        return invoiceRepository.findAll();
    }

    public Invoice invoice(String invoiceNumber) {
        return this.invoiceRepository.getInvoiceByNumber(invoiceNumber);
    }

    public Iterable<Invoice> invoicesByDistributor(String distributorName) {
        return this.invoiceRepository.findInvoicesByDistributor_Name(distributorName);
    }

    public Iterable<Invoice> invoicesByCustomerLocation(String customerAddress) {
        return this.invoiceRepository.findInvoicesByCustomer_Address(customerAddress);
    }

    public Iterable<Invoice> invoicesByProduct(String productCode) {
        return this.invoiceRepository.findInvoicesByProduct_Code(productCode);
    }

    public Iterable<Distributor> distributors() {
        HashMap<String, Distributor> distributorHashMap = new HashMap<>();
        Iterable<Invoice> invoiceIterable = this.invoiceRepository.findAll();
        for ( Invoice invoice : invoiceIterable ) {
            Distributor distributor = invoice.getDistributor();
            if (!distributorHashMap.containsKey(distributor.getName())) {
                distributorHashMap.put(distributor.getName(), distributor);
            }
        }
        return distributorHashMap.values();
    }

    public Iterable<Customer> customers() {
        HashMap<String, Customer> customersHashMap = new HashMap<>();
        Iterable<Invoice> invoiceIterable = this.invoiceRepository.findAll();

        for ( Invoice invoice : invoiceIterable ) {
            Customer customer = invoice.getCustomer();
            if (!customersHashMap.containsKey(customer.getName())) {
                customersHashMap.put(customer.getName(), customer);
            }
        }
        return customersHashMap.values();
    }

    public Iterable<Product> products() {
        HashMap<String, Product> productHashMap = new HashMap<>();
        Iterable<Invoice> invoiceIterable = this.invoiceRepository.findAll();
        for ( Invoice invoice : invoiceIterable ) {
            for (InvoiceDetail invoiceDetail : invoice.getDetails()) {
                Product product = invoiceDetail.getProduct();
                if (!productHashMap.containsKey(product.getCode())) {
                    productHashMap.put(product.getCode(), product);
                }
            }
        }
        return productHashMap.values();
    }



}
