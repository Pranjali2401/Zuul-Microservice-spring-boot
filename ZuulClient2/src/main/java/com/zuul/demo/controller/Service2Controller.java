package com.zuul.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/eureka-2")
public class Service2Controller {

	@Autowired
	private RestTemplate template;
	
	@GetMapping
	public String getMessage() {
		return "Hello from service 2 "+template.getForObject("http://localhost:7003/eureka-3", String.class);
	}
}
