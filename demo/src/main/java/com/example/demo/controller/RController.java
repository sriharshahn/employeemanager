package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rcont")
public class RController {

	@GetMapping("/add")
	public String add()
	{
		return "hi";
	}
	
	@GetMapping("/all")
	public String GetAll()
	{
		return "all data";
	}
	
}
