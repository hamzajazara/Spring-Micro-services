package com.hamzajazara.hotels.best;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Hamza Aljazara
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class BestHotelsApplication {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BestHotelsApplication.class, args);
	}
}
