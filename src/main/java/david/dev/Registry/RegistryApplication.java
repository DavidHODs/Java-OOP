package david.dev.Registry;

import david.dev.Registry.Lecturer.Lecturer;
import david.dev.Registry.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class RegistryApplication {

	public static void main(String[] args) {
		Lecturer lecturer1 = new Lecturer(12L, "12f", "Francis Egno", "fe@email.com", LocalDate.of(1953, 3, 22), "Male", "Sciences", "Lecturer II", "Level Adviser");


		int age = lecturer1.calcAge();
		int salary = lecturer1.calcSalary();

		System.out.printf("the age of %s is %d\n", lecturer1.getName(), age);
		System.out.printf("code is %s\n", lecturer1.createCode());
		System.out.printf("salary is %d\n", salary);

		Student student1 = new Student(12L, "12f", "Francis Egno", "fe@email.com", LocalDate.of(1953, 3, 22), "Male", "Sciences", "Computer Science", 3);
		int stdAge = student1.calcAge();

		System.out.printf("the age of %s is %d\n", student1.getName(), stdAge);
		System.out.printf("code is %s\n", student1.createCode());
//		SpringApplication.run(RegistryApplication.class, args);
	}

}
