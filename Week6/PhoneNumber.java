/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File PhoneNumber.java */
/*
 * Assignment 6.3
 * Purpose: Convert a given alphanumeric phone number (string) to a standard phone number
 *
 * To compile the program:
 * javac PhoneNumber.java
 *
 * To execute the program:
 * java PhoneNumber
 *
 */

import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a phone number as a string (phone number)
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // Translate a letter to a digit and leaves all other character intact
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
            else
                System.out.print(string.charAt(i));
        }
        System.out.println();
    }

    //Return the character reference according to international letter/number mapping
    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= 'W')
            return 9;
        else if (uppercaseLetter >= 'T')
            return 8;
        else if (uppercaseLetter >= 'P')
            return 7;
        else if (uppercaseLetter >= 'M')
            return 6;
        else if (uppercaseLetter >= 'J')
            return 5;
        else if (uppercaseLetter >= 'G')
            return 4;
        else if (uppercaseLetter >= 'D')
            return 3;
        else
            return 2;
    }
}