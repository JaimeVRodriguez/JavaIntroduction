/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File SumMethod.java */
/*
 * Assignment 5.3
 * Purpose: Sum the three digits input by user using a method
 *
 * To compile the program:
 * javac SumMethod.java
 *
 * To execute the program:
 * java SumMethod
 *
 */

import java.util.Scanner;

public class SumMethod {

    public static void main (String [] args) {

        //Prompt user to input a three digit number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int userInput = input.nextInt();

        //Determine individual digits
        int digitOne = (userInput / 100) % 100;
        int digitTwo = (userInput / 10) % 10;
        int digitThree = userInput % 10 ;
        int digitTotal = sumDigits(digitOne, digitTwo, digitThree);

        //Output of the users input number and total of each individual digit
        System.out.println("The sum of " + digitOne + ", " + digitTwo + " and "
                + digitThree + " is " + digitTotal + ".");
    }

    //Call for the digitTotal
    public static int sumDigits (int num1, int num2, int num3) {
        int result;

        result = (num1 + num2 + num3);

        return result;
    }
}
