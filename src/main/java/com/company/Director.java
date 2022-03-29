package com.company;

public class Director extends Crew {
    private double royalty;

    public Director(String name, double payRate, String department) {
        super(name, payRate, department);
    }

    // Getters and setters below
    public double getRoyalty() {
        return royalty;
    }
    public void setRoyalty(double profits) {
        // Reminder: director earns a 1% royalty based on movie profits, which will be passed in after the
        // movie profits are calculated
        this.royalty = 0.01*profits;
    }
}
