/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File MonthGenerator.java */
/*
 * Assignment 3.2
 * Purpose: Convert randomly generated number into a corresponding month
 *
 * To compile the program:
 * javac MonthGenerator.java
 *
 * To execute the program:
 * java MonthGenerator
 *
 */

public class MonthGenerator {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 13);
        System.out.println("Month " + number + ".");

        if(number == 1)
            System.out.println("Month " + number + " is January.");
        else if(number == 2)
            System.out.print("Month " + number + " is February.");
        else if(number == 3)
            System.out.println("Month " + number + " is March.");
        else if(number == 4)
            System.out.print("Month " + number + " is April.");
        else if(number == 5)
            System.out.println("Month " + number + " is May.");
        else if(number == 6)
            System.out.print("Month " + number + " is June.");
        else if(number == 7)
            System.out.println("Month " + number + " is July.");
        else if(number == 8)
            System.out.print("Month " + number + " is August.");
        else if(number == 9)
            System.out.println("Month " + number + " is September.");
        else if(number == 10)
            System.out.println("Month " + number + " is October.");
        else if(number == 11)
            System.out.print("Month " + number + " is November.");
        else if(number == 12)
            System.out.println("Month " + number + " is December.");
    }

}
