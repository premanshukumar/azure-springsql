package com.kgpco.azure.springsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class AzureSpringsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringsqlApplication.class, args);
	}

}
