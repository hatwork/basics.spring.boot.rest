package com.hatim.basics.spring.boot.rest.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	Map<Long, Student> data = new HashMap<>();
	
	public StudentService() {
		data.put(Long.valueOf(1), new Student(1, "Hatim Kamaal", "Male" , "1st"));
	}
	
	public void add(Student s) {
		if( null == s ) {
			return;
		}
		data.put(s.getRollNumber(), s);
	}
	
	public Student get(long rollNumber) {
		return data.get(rollNumber);
	}
	
	public Collection<Student> get() {
		return data.values();
	}
	
	
}
