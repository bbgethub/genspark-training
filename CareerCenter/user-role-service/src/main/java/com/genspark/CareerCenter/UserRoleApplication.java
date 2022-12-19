package com.genspark.CareerCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserRoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRoleApplication.class, args);
	}

}
