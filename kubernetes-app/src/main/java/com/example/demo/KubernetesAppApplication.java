package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@SpringBootApplication
@RestController
public class KubernetesAppApplication {

	@GetMapping("/students")
	public Student students() {
		
		Student student = new Student(1,"Chetan","BE","Mech");
		return student;
	}
	public static void main(String[] args) {
		SpringApplication.run(KubernetesAppApplication.class, args);
		
	}

}
