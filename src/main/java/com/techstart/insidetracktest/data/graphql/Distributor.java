package com.techstart.insidetracktest.data.graphql;

/**
 * type Distributor {
 *     id: String
 *     name: String
 *     address: String
 *     contact: String
 * }
 */

public class Distributor {
    private String id;
    private String name;
    private String address;
    private String contact;

    public String getId() {
        return id;
    }

    public Distributor setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Distributor setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Distributor setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getContact() {
        return contact;
    }

    public Distributor setContact(String contact) {
        this.contact = contact;
        return this;
    }
}
