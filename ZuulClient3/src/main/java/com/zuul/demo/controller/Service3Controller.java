package com.zuul.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka-3")
public class Service3Controller {

	@GetMapping
	public String getMessage() {
		return "Hello from service 3";
	}
}
