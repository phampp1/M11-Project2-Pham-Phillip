package com.company;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private double budget;
    private double moneySpent;
    private double moneyEarned;
    private double profits;
    private String title;
    private String genre;
    private Director director;
    private final List<Actor> actors = new ArrayList<>();
    private final List<Crew> crews = new ArrayList<>();

    public Movie(double budget, double moneyEarned, double moneySpent, String genre, String title) {
        setBudget(budget);
        setMoneyEarned(moneyEarned);
        // I am taking into account the money spent on other things, for example, marketing, food, equipment, etc.
        setMoneySpent(moneySpent);
        setGenre(genre);
        setTitle(title);
    }

    public void addActor(Actor a) {
        this.actors.add(a);
    }

    public void addCrew(Crew a) {
        this.crews.add(a);
    }

    public void Payday(Actor a, Actor b, Crew c, Crew d, Director e) {
        // Pay all actors and crew on the movie and adds the total to the existing money spent
        double totalPay = a.getEarnings() + b.getEarnings() + c.getEarnings() + d.getEarnings() + e.getEarnings();
        setMoneySpent(getMoneySpent() + totalPay);
    }

    // Note: this is a double because I expected to use this as a way to set profit while instantiating the director
    public void calcProfit() {
        double prof = getBudget() + getMoneyEarned() - getMoneySpent();
        setProfits(prof);
    }
    // Getters and setters located below
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public double getMoneySpent() {
        return moneySpent;
    }
    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }
    public double getMoneyEarned() {
        return moneyEarned;
    }
    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }
    public double getProfits() {
        return profits;
    }
    public void setProfits(double profits) {
        this.profits = profits;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }
    public ArrayList<Actor> getActors() {
        return (ArrayList<Actor>) actors;
    }
    public ArrayList<Crew> getCrews() {
        return (ArrayList<Crew>) crews;
    }
}
