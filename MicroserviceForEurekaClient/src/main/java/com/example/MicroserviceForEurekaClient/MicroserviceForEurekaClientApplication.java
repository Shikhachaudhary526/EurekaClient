package com.example.MicroserviceForEurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceForEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceForEurekaClientApplication.class, args);
	}

}
