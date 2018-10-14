package com.hamzajazara.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ApiDiscoveryApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApiDiscoveryApplication.class, args);
	}
}
