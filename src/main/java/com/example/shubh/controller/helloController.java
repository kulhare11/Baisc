package com.example.shubh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class helloController {

	@GetMapping("/hello")
	public String hello() {
		try {
			return "Hello Shubhangi Kulhare";
		} catch (Exception e) {
			return ("exception {}" + e);
		}
	}
}