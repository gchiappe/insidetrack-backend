package com.techstart.insidetracktest;

import graphql.kickstart.tools.SchemaParserDictionary;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InsidetrackTestApplication extends SpringBootServletInitializer {

	@Bean
	public GraphQLScalarType date() {
		return ExtendedScalars.Date;
	}

	public static void main(String[] args) {
		System.setProperty("java.net.preferIPv4Stack" , "true");
		SpringApplication.run(InsidetrackTestApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return configureApplication(builder);
	}

	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
		return builder.sources(InsidetrackTestApplication.class).bannerMode(Banner.Mode.OFF);
	}

	@Bean
	public SchemaParserDictionary schemaParserDictionary() {
		return new SchemaParserDictionary();
	}
}
