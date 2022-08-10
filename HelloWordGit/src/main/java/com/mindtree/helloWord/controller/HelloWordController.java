package com.mindtree.helloWord.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWordController {

	@RequestMapping
	public String hello()
	{
		return "Hello Word";
	}
}
