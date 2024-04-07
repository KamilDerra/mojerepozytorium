package com.sdkjava.application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class SdkjavaController {

	@RequestMapping(value ="/helloworld", method = RequestMethod.GET)
	public String sayHelloWorld() {
		return "Hello World!!!";
		
	}
	
	
}
