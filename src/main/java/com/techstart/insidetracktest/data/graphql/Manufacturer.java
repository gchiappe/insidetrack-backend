package com.techstart.insidetracktest.data.graphql;

import com.arangodb.springframework.annotation.Field;

/**
 * type Manufacturer {
 *     id: String
 *     name: String
 *     address: String
 *     contact: String
 * }
 */

public class Manufacturer {
    private String name;
    private @Field("addr") String address;

    public String getName() {
        return name;
    }

    public Manufacturer setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Manufacturer setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
