package com.jwtauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

	@RequestMapping({ "/business" })
	public String firstPage() {
		return "uen 123";
	}
	
}
