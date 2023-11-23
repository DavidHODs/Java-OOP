package david.dev.Registry.Lecturer;

import java.time.LocalDate;
import java.time.Period;

public class Lecturer {
    private Long id;
    private String code;
    private String name;
    private String email;
    private LocalDate dob;

    private String gender;
    private String college;
    private String designation;
    private String post;


    public Lecturer(Long id, String code, String name, String email, LocalDate dob,
                    String gender, String college, String designation, String post) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.college = college;
        this.designation = designation;
        this.post = post;
    }

    public Lecturer(Long id, String code, String name, String email, LocalDate dob, String gender, String college) {
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
                return salary;
        }

        switch (this.post) {
            case "Level Adviser":
                postSalary = 2000;
                break;
            case "HOD":
                postSalary = 2500;
                break;
            case "Provost":
                postSalary = 3500;
                break;
            case "Vice Chancellor":
                postSalary = 5000;
                break;
            default:
                postSalary = 0;
                System.out.printf("%s is not a valid post\n", this.post);
                return salary;
        }

        return salary + postSalary;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

//    generates a staff id code
    public void setCode(String code) {
        this.code = "stf/" + this.college + "/" + code;
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
