/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File PalindromeInteger.java */
/*
 * Assignment 3.3
 * Purpose: Determine whether users input number is a palindrome integer
 *
 * To compile the program:
 * javac PalindromeInteger.java
 *
 * To execute the program:
 * java PalindromeInteger
 *
 */

import java.util.Scanner;

public class PalindromeInteger {

    public static void main (String [] args) {

        //Prompt the user to enter a three digit number
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a three digit number: ");
        int threeDigit = input.nextInt();


        ///Determine each individual number
        int digitOne = threeDigit % 10;
        int digitTwo = (threeDigit / 10) % 10;
        int digitThree = (threeDigit / 100) % 100;

        //Determine whether first and last number match for palindrome rules
        if (digitOne == digitThree) {
            System.out.println("Your number, " + threeDigit + ", is a palindrome integer!");
        }

        else {
            System.out.println("Sorry your number, " + threeDigit + ", is not a palindrome integer.");
        }




    }

}