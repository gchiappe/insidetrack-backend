package com.techstart.insidetracktest.data.graphql;

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
    private String address;
    private String contact;

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

    public String getContact() {
        return contact;
    }

    public Customer setContact(String contact) {
        this.contact = contact;
        return this;
    }
}
