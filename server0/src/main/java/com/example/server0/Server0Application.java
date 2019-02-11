package com.example.server0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Server0Application {

	public static void main(String[] args) {
		SpringApplication.run(Server0Application.class, args);
	}

}

