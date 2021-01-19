package com.leporonitech.mongowebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication @EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class MongowebfluxApplication {

	public static void main(String[] args) {

		SpringApplication.run(MongowebfluxApplication.class, args);

		System.out.println("Hello world");
	}


}