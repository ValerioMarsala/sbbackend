package com.demo.myproject;

import com.demo.myproject.model.Employee;
import com.demo.myproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception{
		/*Employee employee = new Employee();
		employee.setFirstName("Valerio");
		employee.setLastName("Marsala");
		employee.setEmailId("valerio@marsala.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Pino");
		employee1.setLastName("Scotto");
		employee1.setEmailId("pino@scotto.com");
		employeeRepository.save(employee1);*/
	}

}
