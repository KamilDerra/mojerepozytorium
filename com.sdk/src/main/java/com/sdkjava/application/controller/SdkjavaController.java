package com.sdkjava.application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 Controller:
 
 - zawiera kontrolery, które odpowiadają za obsługę żądań HTTP,
 
 */


@RestController
public class SdkjavaController {

        //  Endpoint testowy     

	@RequestMapping(value ="/sdkjava", method = RequestMethod.GET)
	public String testMeWithPostman() {
		return "SDK Java for Paidwork";
		
	}
	
	
}
