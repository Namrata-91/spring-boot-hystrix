package com.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@RestController
@EnableHystrix
@EnableHystrixDashboard
public class ShoppingApp {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "onlineShoppingFallBack")
	@GetMapping("/onlineshopping")
	public String bookShow() {
		String customerAccountService = restTemplate.getForObject("http://localhost:8081/customerdata", String.class);
		String reviewProduct = restTemplate.getForObject("http://localhost:8086/productReview", String.class);
		return customerAccountService + "\n" + reviewProduct;
	}

	@GetMapping("/shoppingWitoutHystrix")
	public String bookShowWitoutHystrix() {
		String customerAccountService = restTemplate.getForObject("http://localhost:8081/customerdata", String.class);
		String reviewProduct = restTemplate.getForObject("http://localhost:8086/productReview", String.class);
		return customerAccountService + "\n" + reviewProduct;
	}

	public String onlineShoppingFallBack() {
		return "service gateway failed.....";
	}

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApp.class, args);
	}

}
