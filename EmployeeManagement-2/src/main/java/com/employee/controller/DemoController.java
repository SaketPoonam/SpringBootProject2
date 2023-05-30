package com.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")

public class DemoController {
	@GetMapping("/hi")
	public String saysayHi(@RequestParam String firstName,
			@RequestParam(required = false, defaultValue = "  Saket") String lastName,
			@RequestParam(required = false,defaultValue = "Pune") String city) {
		return " Hi "+firstName+ ""+lastName+ " Your City is "+city;
		}
	
	@GetMapping("/hello/{firstName}/{lastName}/{city}")
	public String sayHello(@PathVariable String firstName,@PathVariable String lastName,@PathVariable String city ) {
		System.out.println(city);
		return " Hello "+firstName+ ""+lastName+ " Your City is "+city;
	}
		
		
	@GetMapping("/add/{number1}/{number2}")
	public int add(@PathVariable int number1, @PathVariable int number2) {
		return number1+number2;
	}
	
	@GetMapping("/subtract/{number1}/{number2}")
	public int subtract(@PathVariable int number1, @PathVariable int number2) {
		return number1-number2;
}
	@GetMapping("/multiply/{number1}/{number2}")
	public int multiply(@PathVariable int number1, @PathVariable int number2) {
		return number1*number2;
}
	@GetMapping("/divided/{number1}/{number2}")
	public int divided(@PathVariable int number1, @PathVariable int number2) {
		return number1/number2;
	}
}




