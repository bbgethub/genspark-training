package com.genspark.gensparkeurekaserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CareerCenterServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareerCenterServiceRegistryApplication.class, args);
	}

}
