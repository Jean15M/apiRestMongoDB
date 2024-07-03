package com.ista.nomina;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CrudMongoApplication {
	
	 @Bean
	    public GroupedOpenApi publicApi() {
	        return GroupedOpenApi.builder()
	                .group("public")
	                .pathsToMatch("/**")
	                .build();
	    }

	public static void main(String[] args) {
		SpringApplication.run(CrudMongoApplication.class, args);
	}

}
