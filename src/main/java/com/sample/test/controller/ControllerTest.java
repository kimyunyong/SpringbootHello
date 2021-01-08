package com.sample.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello 스프링부트!!";
	}

}
