package com.company;

public class Actor extends Person {
    private String Role;

    public Actor(String name, double payRate, String role) {
        super(name, payRate);

        setRole(role);
    }

    // Getters and setters below
    public String getRole() {
        return Role;
    }
    public void setRole(String Role) {
        this.Role = Role;
    }
}
