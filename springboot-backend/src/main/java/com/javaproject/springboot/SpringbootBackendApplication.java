package com.javaproject.springboot;

import com.javaproject.springboot.model.Employee;
import com.javaproject.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Manishkumar");
//		employee.setLastName("Singh");
//		employee.setEmailId("manish123@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Anjali");
//		employee1.setLastName("Singh");
//		employee1.setEmailId("anjali123@gmail.com");
//		employeeRepository.save(employee1);
	}
}
