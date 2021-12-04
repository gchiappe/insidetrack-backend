package com.techstart.insidetracktest.data.graphql;

import com.arangodb.springframework.annotation.Field;

/**
 * type Customer {
 *     id: String
 *     name: String
 *     address: String
 *     contact: String
 * }
 */

public class Customer {
    private String id;
    private String name;
    private @Field("addr") String address;

    public String getId() {
        return id;
    }

    public Customer setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
