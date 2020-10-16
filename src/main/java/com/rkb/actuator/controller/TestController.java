package com.rkb.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot-actuator")
public class TestController {

	@GetMapping("/test")
	public String testEndPoint() {
		return "Welcome to apring boot actuator";
	}
}
