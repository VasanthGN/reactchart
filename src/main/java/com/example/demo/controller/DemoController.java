package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repo.DemoRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DemoController{
	
	@Autowired
	private DemoRepository demoRepository;
	
	@GetMapping("/{name}")
	public Users getById(@PathVariable("name") String name)
	{
		return demoRepository.findByName(name);
	}
	
	
	@GetMapping("/follow/{name}")
	public List<Users> getByFollow(@PathVariable("name") String name)
	{
		return demoRepository.findByFollow(name);
	}
}