package com.example.Lab5_Concurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableFeignClients
@SpringBootApplication
public class Lab5ConcurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5ConcurrencyApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() { return new RestTemplate();}

}
