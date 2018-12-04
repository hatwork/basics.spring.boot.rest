package com.hatim.basics.spring.boot.rest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private StudentService service;	
	
	@GetMapping(value="/" , produces= MediaType.APPLICATION_JSON_VALUE)
	public Collection<Student> getAll() {
		return service.get();
	}
	
	@GetMapping(value="/{id}" , produces= MediaType.APPLICATION_JSON_VALUE)
	public Student get(@PathVariable long id) {
		return service.get(id);
	}
	
	@PostMapping(value="/add")
	public void add(Student s) {
		service.add(s);
	}

	@PostMapping(value="/edit")
	public void edit(Student s) {
		service.add(s);
	}

}
