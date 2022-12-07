package com.example.circuitbreaker;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@RestController
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class CircuitbreakerApplication {

	@GetMapping
	@HystrixCommand(fallbackMethod = "defaultsubjectsList")
	public List<String> cloudProductList() {

		RestTemplate restTemplate = new RestTemplate();
//		URI uri = URI.create("http://localhost:9093/subject-service");
		URI uri = URI.create("http://localhost:9093/subject-service");


		return restTemplate.getForObject(uri, List.class);
	}
	public List<String> defaultsubjectsList() {
		return Arrays.asList("spring cloud");
	}
	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerApplication.class, args);
	}

}
