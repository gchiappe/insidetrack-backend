package com.techstart.insidetracktest.graphql;

import com.techstart.insidetracktest.data.arangodb.InvoiceRepository;
import com.techstart.insidetracktest.data.graphql.Invoice;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

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

}
