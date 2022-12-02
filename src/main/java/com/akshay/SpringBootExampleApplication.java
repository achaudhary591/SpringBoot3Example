package com.akshay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@GetMapping("/")
	public greetResponse greet(){
//		return "<h1>Hello Friend</h1>";
		return new greetResponse("Hello!", List.of("Java","C++","Python","JavaScript"), new Person("Akshay",27,3000));
	}

	record Person (String name, int age, double sal){

	}
	record greetResponse(String greet, List<String> favProgrammingLanguages, Person person){

	}

}
