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
    private String name;
    private Manufacturer manufacturer;

    public String getCode() {
        return code;
    }

    public Product setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Product setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
