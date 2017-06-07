package com.citi.cosine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CitiCosineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiCosineApplication.class, args);
	}
}
