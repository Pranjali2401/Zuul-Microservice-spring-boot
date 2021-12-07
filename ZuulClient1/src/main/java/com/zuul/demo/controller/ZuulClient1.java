package com.zuul.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/eureka-1")
public class ZuulClient1 {
	
	@Autowired
	private RestTemplate template;

	@GetMapping
	public String getMessage() {
//		return "Hello from Service 1 ,";
		return "Hello from Service 1 ,"+template.getForObject("http://localhost:7002/eureka-2", String.class);
	}
}
