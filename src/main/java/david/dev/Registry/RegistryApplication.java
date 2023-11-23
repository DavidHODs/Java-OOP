package david.dev.Registry;

import david.dev.Registry.Lecturer.Lecturer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class RegistryApplication {

	public static void main(String[] args) {
		Lecturer lecturer1 = new Lecturer(12L, "12f", "Francis Egno", "fe@email.com", LocalDate.of(1953, 3, 22), "Male", "Sciences", "Lecturer II", "Level Adviser");

		int age = lecturer1.calcAge();
		int salary = lecturer1.calcSalary();
		lecturer1.setCode("12f");

		System.out.printf("the age of %s is %d\n", lecturer1.getName(), age);
		System.out.printf("code is %s\n", lecturer1.getCode());
		System.out.printf("salary is %d\n", salary);
//		SpringApplication.run(RegistryApplication.class, args);
	}

}
