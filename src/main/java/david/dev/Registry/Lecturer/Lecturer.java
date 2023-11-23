package david.dev.Registry.Lecturer;

import david.dev.Registry.Person.Person;

import java.time.LocalDate;

public class Lecturer extends Person {
    private String college;
    private final String designation;
    private final String post;


    public Lecturer(Long id, String code, String name, String email, LocalDate dob,
                    String gender, String college, String designation, String post) {
        super(id, code, name, email, dob, gender);
        this.college = college;
        this.designation = designation;
        this.post = post;
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
                break;
        }

        return salary + postSalary;
    }

//    generates a staff id code. overrides parent's method implementation
    @Override
    public String createCode() {
        return ("stf/" + this.college + "/" + super.createCode());
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
