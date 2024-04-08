package com.sdkjava.application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class SdkjavaController {

        //  Endpoint testowy:      

	@RequestMapping(value ="/helloworld", method = RequestMethod.GET)
	public String sayHelloWorld() {
		return "SDK Java for Paidwork";
		
	}
	
	
}
