package com.techstart.insidetracktest.data.graphql;

/**
 * GraphQL Object
 *
 * type InvoiceDetail {
 *     quantity: Int
 *     weight: Float
 *     measureUnit: String
 *     unitPrice: Float
 * }
 */

public class InvoiceDetail {
    private Integer quantity;
    private Double weight;
    private String measureUnit;
    private Double unitPrice;
    private Product product;

    public Integer getQuantity() {
        return quantity;
    }

    public InvoiceDetail setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public InvoiceDetail setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public InvoiceDetail setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
        return this;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public InvoiceDetail setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public InvoiceDetail setProduct(Product product) {
        this.product = product;
        return this;
    }
}
