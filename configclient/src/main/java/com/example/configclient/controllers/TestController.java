package com.example.configclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${some.value}")
	private String myValue;

	@Value("${spring.profiles.dev}")
	private String profileDev;

	@GetMapping("/myValueDev")
	public String myValueDev() {
		return this.myValue + " " + profileDev;
	}
	
	@Value("${spring.profiles.test}")
	private String profileTest;

	@GetMapping("/myValueTest")
	public String myValusTest() {
		return this.myValue + " " + profileTest;
	}
}