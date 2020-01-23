/*
 * Purpose: Convert value of feet to meters
 *
 * To compile the program:
 * javac FeetToMeters.java
 *
 * To execute the program:
 * java FeetToMeters
 *
 */

import java.util.Scanner;

public class FeetToMeters {

    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print( "Enter number of feet: ");
        //Number of feet to be converted to meters
        double feet = input.nextDouble();

        //Constant of feet per meter
        final double FEET_PER_METER = 0.305;

        //Equation to convert feet to meters
        double meters = feet * FEET_PER_METER;

        System.out.println( feet + " feet is " +  meters + " meters" );

    }

}
