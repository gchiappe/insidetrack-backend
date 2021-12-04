package com.techstart.insidetracktest.data.arangodb;

import com.arangodb.springframework.annotation.Query;
import com.arangodb.springframework.repository.ArangoRepository;
import com.techstart.insidetracktest.data.graphql.Invoice;
import com.techstart.insidetracktest.data.graphql.Product;
import org.springframework.data.repository.query.Param;

public interface InvoiceRepository extends ArangoRepository<Invoice, String> {
    Iterable<Invoice> findAll();
    Invoice getInvoiceByNumber(String invoiceNumber);

    @Query("FOR c IN #collection FILTER c.distributor.name == @distributorName RETURN c")
    Iterable<Invoice> findInvoicesByDistributor_Name(@Param("distributorName") String distributorName);

    @Query("FOR c IN #collection FILTER c.customer.addr == @customerAddress RETURN c")
    Iterable<Invoice> findInvoicesByCustomer_Address(@Param("customerAddress") String customerAddress);

    @Query("FOR c IN #collection FILTER @productCode IN c.detail[*].product.code RETURN c")
    Iterable<Invoice> findInvoicesByProduct_Code(@Param("productCode") String productCode);


}
