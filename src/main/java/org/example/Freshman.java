package org.example;

public class Freshman extends Student {
    //Creates field for credits
    private int credits;

    //Constructor for Freshman class
    public Freshman(String name, short age, String address, int credits) {
        super(name, age, address);
        setCredits(credits);
    }

    //Setter and Getter for credits
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Overrides Student toString method, adds how many credits the Freshman has
    @Override
    public String toString() {
        return super.toString() + " Credits: " + this.getCredits();
    }
}
