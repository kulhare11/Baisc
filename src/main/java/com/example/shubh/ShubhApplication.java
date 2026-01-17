package com.example.shubh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ShubhApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShubhApplication.class, args);
		System.out.println("My Project ");
}}

