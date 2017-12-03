package com.eeqmc2.rest.restexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RestExampleApplication {

	@Autowired
	EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RestExampleApplication.class, args);
	}


	@PostConstruct
	private void init() {

		Employee employee1 = new Employee();
		employee1.setFirstName("Thomas");
		employee1.setLastName("Gregson");
		employee1.setTitle("Captain");
		repository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Sherlock");
		employee2.setLastName("Holmes");
		employee2.setTitle("Consulting Detective");
		repository.save(employee2);

	}
}
