package com.techstart.insidetracktest.data.graphql;

import com.arangodb.springframework.annotation.Field;

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
    private @Field("purchased_weight") Double weight;
    private @Field("unit_of_measure") String measureUnit;
    private @Field("unit_price") Double unitPrice;
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

    @Override
    public String toString() {
        return "InvoiceDetail{" +
                "quantity=" + quantity +
                ", weight=" + weight +
                ", measureUnit='" + measureUnit + '\'' +
                ", unitPrice=" + unitPrice +
                ", product=" + product +
                '}';
    }
}
