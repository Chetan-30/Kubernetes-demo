package com.example.demo.model;

import lombok.Data;

@Data
public class Student {

	
	public int id;
	public String name;
	public String year;
	public String branch;
	
	public Student(int i, String name, String year, String branch) {
		this.id = i;
		this.name = name;
		this.year = year;
		this.branch = branch;
	}
}
