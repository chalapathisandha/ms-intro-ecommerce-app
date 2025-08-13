package com.chalapathi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LoadBalancerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancerTestApplication.class, args);
	}

}
