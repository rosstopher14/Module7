package org.example;

public class Senior extends Student {
    //Creates field for credits
    private int credits;

    //Constructor for Senior class
    public Senior(String name, short age, String address, int credits) {
        super(name, age, address);
        // If created senior does not have at least 85 credits, the program closes
        // Otherwise, new senior is created with their amount of credits
        if(credits < 85) {
            System.out.println("A senior must have a minimum of 85 credits. Unable to create Senior");
            System.exit(0);
        }
        else setCredits(credits);
    }

    //Setter and Getter for credits
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Overrides Student toString method, adds how many credits the Senior has
    @Override
    public String toString() {
        return super.toString() + " Credits: " + this.getCredits();
    }
}

