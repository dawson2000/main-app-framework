package com.citi.otc.instruction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CitiCosineOtcInstructionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiCosineOtcInstructionsApplication.class, args);
	}
}
