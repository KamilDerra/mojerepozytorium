package com.sdkjava.application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class SdkjavaController {

        //  Endpoint testowy:      

	@RequestMapping(value ="/sdkjava", method = RequestMethod.GET)
	public String writeSDKJava() {
		return "SDK Java for Paidwork";
		
	}
	
	
}
