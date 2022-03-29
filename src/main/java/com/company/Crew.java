package com.company;

public class Crew extends Person {
    private String Department;

    public Crew(String name, double payRate, String dept) {
        super(name, payRate);

        setDepartment(dept);
    }

    // Getters and setters below
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        this.Department = department;
    }
}
