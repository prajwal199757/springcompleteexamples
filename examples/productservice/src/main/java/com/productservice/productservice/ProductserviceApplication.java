package com.productservice.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class ProductserviceApplication {

	@GetMapping(value = "/products")
	public List<String> getAllproduct(){
		return Arrays.asList("abcd","efgh","ijkl");
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

}
