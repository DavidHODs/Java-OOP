package david.dev.Registry.Lecturer;

import java.time.LocalDate;
import java.time.Period;

public class Lecturer {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private String college;
    private String designation;

    private String post;

    public Lecturer(Long id, String name, String email, LocalDate dob,
                    String college, String designation, String post) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.college = college;
        this.designation = designation;
        this.post = post;
    }

//    calcAge calculates age based on supplied dob
    public int calcAge() {
        Period period = Period.between(this.dob, LocalDate.now());
        return period.getYears();
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
}
