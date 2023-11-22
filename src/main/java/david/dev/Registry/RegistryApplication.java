package david.dev.Registry;

import david.dev.Registry.Lecturer.Lecturer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class RegistryApplication {

	public static void main(String[] args) {
		Lecturer lecturer1 = new Lecturer(12L, "Francis Egno", "fe@email.com", LocalDate.of(1953, 3, 22), "Sciences", "Lecturer II", "Level Adviser");

		int age = lecturer1.calcAge();

		System.out.printf("the age of %s is %d", lecturer1.getName(), age);
//		SpringApplication.run(RegistryApplication.class, args);
	}

}
