package com.trifork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DutchCityServiceApplication {

	public static void main(String[] args) {
      //  new JHades().overlappingJarsReport();
        SpringApplication.run(DutchCityServiceApplication.class, args);
	}
}
