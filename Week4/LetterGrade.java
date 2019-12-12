/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File LetterGrade.java */
/*
 * Assignment 4.3
 * Purpose: Generate a numerical value to a letter grade
 *
 * To compile the program:
 * javac LetterGrade.java
 *
 * To execute the program:
 * java LetterGrade
 *
 */

import java.util.Scanner;

public class LetterGrade {

    public static void main(String[] args) {

        //Prompt user to enter their letter grade
        System.out.print("Enter your letter grade: ");
        Scanner input = new Scanner(System.in);
        char letterGrade = input.next().charAt(0);

        //Determine whether input is a letter grade
        if(Character.isDigit(letterGrade)){
            System.out.println(letterGrade + " is not a valid grade.");
        }

        //Ensure input is capitalized (typical school format)
        letterGrade = Character.toUpperCase(letterGrade);

        //Determine what the letter grade value is
        if('A' == letterGrade) {
            int value = letterGrade - 'A' + 4;
            System.out.println("The numeric value for a grade of " + letterGrade + " is " + value + ".");
        }
        else if('B' == letterGrade) {
            int value = letterGrade - 'B' + 3;
            System.out.println("The numeric value for a grade of " + letterGrade + " is " + value + ".");
        }
        else if('C' == letterGrade) {
            int value = letterGrade - 'C' + 2;
            System.out.println("The numeric value for a grade of " + letterGrade + " is " + value + ".");
        }
        else if('D' == letterGrade) {
            int value = letterGrade - 'D' + 1;
            System.out.println("The numeric value for a grade of " + letterGrade + " is " + value + ".");
        }
        else if('F' == letterGrade) {
            int value = letterGrade - 'F';
            System.out.println("The numeric value for a grade of " + letterGrade + " is " + value + ".");
        }
        else {
            System.out.println(letterGrade + " is not a valid grade" );
        }


    }

}