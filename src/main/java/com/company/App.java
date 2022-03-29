package com.company;

public class App {
    public static void main(String[] args) {

        // Instantiating the classes, along with some of their attributes
        Person person = new Person("Alex",70000);
        Crew crew1 = new Crew("Chris",100000.00, "Writing");
        Crew crew2 = new Crew("Elena",100000.00,"Makeup");
        Actor act1 = new Actor("Robert Pattinson",3000000.00,"Batman");
        Actor act2 = new Actor("Zoe Kravitz",3000000.00,"Catwoman");
        PA pa = new PA("John",100.00,"Art",1000.00);
        Movie batman = new Movie(150000000.00,672000000.00,75000000.00, "Superhero", "'The Batman'");

        // Note: I had to instantiate the movie first to be able to access the movie profits and calculate the director's royalty
        Director dir = new Director("Matt Reeves",400000.00,"Directing");

        // Note: I had to set the movie director in the main branch because if I included the director in the Movie
        // constructor, it would have created a circular type of issue (director not instantiated before movie).
        // Here, I am adding aspects of the Batman movie into its attributes. I have to use a separate "add"
        // function to append the actors and crew members to a List
        batman.setDirector(dir);
        batman.addActor(act1);
        batman.addActor(act2);
        batman.addCrew(crew1);
        batman.addCrew(crew2);

        // Note: Payday MUST be called before calculating the profit in order to get the correct profit number.
        // This is because Payday updates the "moneySpent" attribute of the Batman movie, which then becomes a
        // factor in calculating the profit.
        batman.Payday(act1, act2, crew1, crew2, dir);
        batman.calcProfit();

        // Have to set royalty after profits have been calculated
        dir.setRoyalty(batman.getProfits());

        // Output lines of code!
        System.out.println("This is a movie budget manager for the " + batman.getGenre()
                + " movie, " + batman.getTitle() + ".\n\n");
        // PA Pay
        System.out.println("The PA for " + batman.getTitle()
                + ", " + pa.getName() + ", was paid $" + pa.getEarnings()
                + " dollars for working a total of " + pa.getHoursWorked()
                + " hours while filming. His rate was $" + pa.getPayRate()
                + " dollars per hour and he specialized in the " + pa.getDepartment()
                + " department.\n");

        System.out.println("The movie spent $" + batman.getMoneySpent()/1000000
                + " million dollars out of its budget of $" + batman.getBudget()/1000000 + " million dollars.\n");

        System.out.println(batman.getTitle() + " made a total of $"
                + batman.getProfits()/1000000 + " million dollars in profits. The director of the film, "
                + batman.getDirector().getName() + ", earned a total of $"
                + batman.getDirector().getRoyalty()/1000000 + " million dollars in royalties.\n");

        System.out.println("The actor who played " + act1.getRole()
                + " was " + batman.getActors().get(0).getName() + ". His co-star, " + act2.getName()
                + ", played " + act2.getRole() + ".\n");

        System.out.println("Some of my friends were crew members. Their names were "
                + batman.getCrews().get(0).getName() + " and " + batman.getCrews().get(1).getName()
                + ". They told me that they had a lot of fun on set.\n");

        System.out.println("A movie critic, " + person.getName() + ", said that he absolutely loved the film.");
    }
}
