package com.techstart.insidetracktest.data.graphql;

/**
 * type Product {
 *     code: String
 *     description: String
 *     manufacturer: Manufacturer
 * }
 */

public class Product {
    private String code;
    private String description;
    private Manufacturer manufacturer;

    public String getCode() {
        return code;
    }

    public Product setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Product setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
}
