package com.company;

public class PA extends Crew {

    private double hoursWorked;

    public PA(String name, double payRate, String department, double hours) {
        super(name, payRate, department);
        setHoursWorked(hours);
        setEarnings(hours*payRate);
    }

    // Getters and setters below
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
