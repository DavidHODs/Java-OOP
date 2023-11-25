package david.dev.Registry.Student;

import david.dev.Registry.Person.Person;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student extends Person {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;

    private String college;
    private String major;
    private final int year;

    public Student(String code, String name, String email, LocalDate dob, String gender, String college, String major, int year) {
        super(code, name, email, dob, gender);
        this.college = college;
        this.major = major;
        this.year = year;
    }

    public String getCollege() {
        return college;
    }

    //    overrides setCode in person class. generates student code
    @Override
    public void setCode(String code) {
        super.setCode("std/" + this.college + "/" + super.getCode());
    }
}
