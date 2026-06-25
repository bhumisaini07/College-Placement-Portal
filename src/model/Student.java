package model;

public class Student {

    private String name;
    private String email;
    private String password;
    private String branch;
    private double cgpa;
    private String skills;

    public Student(String name, String email, String password,
                   String branch, double cgpa, String skills) {

        this.name = name;
        this.email = email;
        this.password = password;
        this.branch = branch;
        this.cgpa = cgpa;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBranch() {
        return branch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getSkills() {
        return skills;
    }
}