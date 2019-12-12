/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File FeetToMeters.java */
/*
 * Assignment 2.3
 * Purpose: Find the sum of all digits in an integer
 *
 * To compile the program:
 * javac ReadInteger.java
 *
 * To execute the program:
 * java ReadInteger
 *
 */

import java.util.Scanner;

public class ReadInteger {

    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print( "Enter a value between 0 and 1000: ");
        //Users value input into console
        int value = input.nextInt();

        //Determination of each individual digit
        int digitOne = value % 10;

        int digitTwo = (value / 10) % 10;

        int digitThree = (value / 100) % 100 ;

        //Sum of each individual digit
        int sum = (digitOne + digitTwo + digitThree);

        System.out.println(sum);

    }
}
