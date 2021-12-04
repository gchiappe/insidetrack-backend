package com.techstart.insidetracktest.config;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.ArangoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableArangoRepositories(basePackages = "com.techstart.insidetracktest.data.arangodb")
public class ArangoDBConfig implements ArangoConfiguration {

    @Value("${#{environment.ARANGO_HOST}:10.1.0.101}")
    private String arangoHost;
    @Value("${#{environment.ARANGO_PORT}:8529}")
    private Integer arangoPort;
    @Value("${#{environment.ARANGO_DATABASE}:it_invoices}")
    private String arangoDbName;
    @Value("${#{environment.ARANGO_USER}:root}")
    private String arangoUser;
    @Value("${#{environment.ARANGO_PW}:123456}")
    private String arangoUserPassword;

    @Override
    public ArangoDB.Builder arango() {
        ArangoDB.Builder bld = new ArangoDB.Builder()
                .host(arangoHost, arangoPort)
                .user(arangoUser);
        if (arangoUserPassword.length() > 0) bld = bld.password(arangoUserPassword);
        return bld;
    }

    @Override
    public String database() {
        return arangoDbName;
    }
}
