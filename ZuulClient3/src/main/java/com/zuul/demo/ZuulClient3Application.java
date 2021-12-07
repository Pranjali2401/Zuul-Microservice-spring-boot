package com.zuul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuulClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulClient3Application.class, args);
	}

}
