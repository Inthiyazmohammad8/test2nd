package com.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sec")
public class MyScController {

	@GetMapping
	public String returnValue() {
		return "Hi, Welcome to my spring boot app page";
	}
}
