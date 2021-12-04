package com.techstart.insidetracktest.data.graphql;

import com.arangodb.springframework.annotation.Field;

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
    private @Field("addr") String address;

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

    @Override
    public String toString() {
        return "Distributor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
