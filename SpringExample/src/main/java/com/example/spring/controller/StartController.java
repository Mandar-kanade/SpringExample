package com.example.spring.controller;

import javax.el.MethodNotFoundException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

	@GetMapping(path = "/start")
	public String start() {
		// basic controller
		return "Hello";
	}
	
	
	@PostMapping (path = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
	public String xmlResponse()
	{
		throw new MethodNotFoundException();
//		return null;
	}
	
	
	@PostMapping (path = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public String jsonResponse()
	{
		throw new MethodNotFoundException();
//		return null;
	}
}
