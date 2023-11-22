package david.dev.Registry.Lecturer;

import java.time.LocalDate;
import java.time.Period;

public class Lecturer {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;

    private String gender;
    private String college;
    private String designation;
    private String post;
    private int salary;

    public Lecturer(Long id, String name, String email, LocalDate dob,
                    String gender, String college, String designation, String post) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.college = college;
        this.designation = designation;
        this.post = post;
    }

//    calcAge calculates age based on supplied dob
    public int calcAge() {
        Period period = Period.between(this.dob, LocalDate.now());
        return period.getYears();
    }

//    calcSalary calculates salary of lecturer from provided object info
    public int calcSalary() {
        int salary;
        int postSalary;

        switch (this.designation) {
            case "Assistant Lecturer":
                salary = 10000;
                break;
            case "Lecturer I":
                salary = 20000;
                break;
            case "Lecturer II":
                salary = 30000;
                break;
            case "Senior Lecturer":
                salary = 40000;
                break;
            case "Associate Professor":
                salary = 50000;
                break;
            case "Professor":
                salary = 60000;
                break;
            default:
                salary = 0;
                System.out.printf("%s is not a valid option\n", this.designation);
                break;
        }

        switch (this.post) {
            case "Level Adviser":
                postSalary = 2000;
            case "HOD":
                postSalary = 2500;
            case "Provost":
                postSalary = 3500;
            case "Vice Chancellor":
                postSalary = 5000;
            default:
                postSalary = 0;
                System.out.printf("%s is not a valid post", this.post);
        }

        return salary + postSalary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
