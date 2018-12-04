package com.hatim.basics.spring.boot.rest.controller;

public class Student {

	private long rollNumber;
	private String name;
	private String gender;
	private String standard;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long rollNumber, String name, String gender, String standard) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.gender = gender;
		this.standard = standard;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

}
