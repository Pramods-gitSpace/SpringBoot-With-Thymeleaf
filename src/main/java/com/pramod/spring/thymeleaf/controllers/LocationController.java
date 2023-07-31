package com.pramod.spring.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
	@RequestMapping("/location")
	public String hello() {
		return "createLocation";
	}
}
