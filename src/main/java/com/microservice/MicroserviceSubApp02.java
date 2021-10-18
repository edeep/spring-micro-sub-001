package com.microservice;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/microservice001")
public class MicroserviceSubApp02 {
	
	
	@RequestMapping("/getDetails/{message}")
	@ResponseBody
	@LoadBalanced
	public String getDetails(@PathVariable(value = "message")  String message) {

		return "Returned from microservice001 " + message ;
	}
	

}
