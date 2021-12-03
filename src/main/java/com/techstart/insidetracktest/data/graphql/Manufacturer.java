package com.techstart.insidetracktest.data.graphql;

/**
 * type Manufacturer {
 *     id: String
 *     name: String
 *     address: String
 *     contact: String
 * }
 */

public class Manufacturer {
    private String id;
    private String name;
    private String address;
    private String contact;

    public String getId() {
        return id;
    }

    public Manufacturer setId(String id) {
        this.id = id;
        return this;
    }

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

    public String getContact() {
        return contact;
    }

    public Manufacturer setContact(String contact) {
        this.contact = contact;
        return this;
    }
}
