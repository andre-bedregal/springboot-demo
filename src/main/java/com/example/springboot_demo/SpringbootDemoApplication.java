package com.example.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}

@Controller

class UserController {

	private final CustomerRepository repository;

	public UserController(CustomerRepository repository) {
		this.repository = repository;
	}

	@ResponseBody
	@GetMapping("/customers")
	Iterable<Customer> customers() {
		return this.repository.findAll();
	}
}

interface CustomerRepository extends CrudRepository<Customer, Integer> {}

record Customer(@Id Integer id, String name) {

}