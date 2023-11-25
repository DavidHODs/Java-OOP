package david.dev.Registry.Person;

import jakarta.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.Period;

@MappedSuperclass
public class Person {
    private String code;
    private String name;
    private String email;
    private LocalDate dob;
    private String gender;

//    constructor for lecturer and student subclasses
    public Person(String code, String name, String email, LocalDate dob, String gender) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
    }

    public Person() {}

    //    calcAge calculates age based on supplied dob
    public int calcAge() {
        if (this.dob == null) {
            System.out.print("date of birth not set/provided");
            return 0;
        }

        Period period = Period.between(this.dob, LocalDate.now());
        return period.getYears();
    }

    //    pronoun returns right pronoun based on supplied details
    public String pronoun() {
        String pro;
        if ("Male".equals(this.gender) || "M".equals(this.gender)) {
            pro = "He/Him";
        } else if ("Female".equals(this.gender) || "F".equals(this.gender)) {
            pro = "She/Her";
        } else {
            pro = "They/Them";
        }

        return pro;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
