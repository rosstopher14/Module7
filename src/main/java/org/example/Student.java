package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    // ToDo 1: Make this class a child of Human

    // ToDo 2: Fix the resulting errors

    // ToDo 3: Add a field for GPA and create a setter and a getter
// Create field for GPA
    private double gpa;


    // Constructor for Student
    public Student(String name, short age, String address) {
        super(name, age, address);
    }
    // Setters and Getters for Address, and GPA
    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString method that returns a student's info
    public String toString() {
        return "Name: " + this.getName() + " Age: " + this.getAge() +
                " Address: " + this.getAddress() + " GPA: " + this.getGpa();
    }

    // ToDo 4: Add comments to your code
}
