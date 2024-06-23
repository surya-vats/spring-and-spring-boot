package com.sjprogramming.springrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String helloworld() {
		return "welcome to SpringBoot rest API"; 
	}

}
