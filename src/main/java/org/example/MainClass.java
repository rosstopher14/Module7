package org.example;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        // ToDo 5: Fix the error

        // ToDo 6: Fix the constructor of the Student class

        // Todo 7: Create two classes for Freshman and Senior

        // ToDo 8: The senior class should have a minimum of 85 credits

        // ToDo 9: Add a toString method for the Student class
        // ToDo 10: Add a toString method for the Freshman class

        // Creates a student from the Student class
        Student std1= new Student("James", (short) 20, "4000 Farmingdale Turnpike");
        // ToDo 11: Add a toString method for the Senior class
        // Creates a student from the Freshman class
        Student std2= new Freshman("James", (short) 20, "300 School Avenue", 12); // name, age, credits

        // Creates a student from the Senior class
        Student std3 = new Senior("John", (short) 30, "25 University Drive", 90);

        // ToDo 12: Set the gpa of the student using the scanner and user
        // 			input and then print the output.

	 	/*
	 	Created Scanner object that reads input
	 	Asks user to enter student's GPA then sets it using the setGPA method
	 	Prints out the student's info using toString which is called implicitly
	 	 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the GPA of std1.");
        double gpa = scanner.nextDouble();
        std2.setGpa(gpa);
        System.out.println(std2);

        System.out.println("Enter the GPA of std2.");
        gpa = scanner.nextDouble();
        std3.setGpa(gpa);
        System.out.println(std3);

        // ToDo 13: add comments and explain your code

        // ToDo 14: submit using a pull request.
    }

}

