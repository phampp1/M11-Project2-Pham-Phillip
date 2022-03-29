package com.company;

public class Person {
    private String name;
    private double payRate;
    private double earnings;

    public Person(String name, double payRate) {
        setName(name);
        setPayRate(payRate);
        setEarnings(payRate*1);
    }

    // Getters and setters below
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getEarnings() {
        return earnings;
    }
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}