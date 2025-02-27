package com.feignclient_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/*
Feign is a declarative web service client that simplifies HTTP requests
in Spring Boot applications. It allows applications to interact with REST APIs
without writing boilerplate HTTP client code.

When to Use Feign Client?
✔ Microservices Communication: Best suited for making REST API calls within a microservices architecture.
✔ Internal API Calls: Use when services frequently communicate with each other.
✔ Load Balancing Needs: Works well with Eureka and Ribbon.
✔ Simplified API Consumption: Ideal for projects that require multiple API integrations.
 */
@SpringBootApplication
@EnableFeignClients
public class FeignclientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientServiceApplication.class, args);
	}

}


