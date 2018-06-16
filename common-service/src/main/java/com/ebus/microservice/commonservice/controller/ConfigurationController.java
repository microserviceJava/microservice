package com.ebus.microservice.commonservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebus.microservice.commonservice.config.Configuration;
import com.ebus.microservice.commonservice.model.ApplicationConfiguration;



@RestController
public class ConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/configuration")
	public ApplicationConfiguration retriveApplicationConfiguration(){
		return new ApplicationConfiguration(configuration.getAutoApprovalInterval(), configuration.isUserEditable());
	}

}