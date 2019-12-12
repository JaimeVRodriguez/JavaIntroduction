/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File Overload.java */
/*
 * Assignment 6.2
 * Purpose: Use method overload in order to run the difference between
 * a set of 2 numbers (the larger of int and double)
 *
 * To compile the program:
 * javac Overload.java
 *
 * To execute the program:
 * java Overload
 *
 */

public class Overload {

    public static void main(String[] args) {

        //Series of numbers in both integer and double (dependent of assignment requirements)
        int a = 11;
        int b = 6;
        double c = 4.2;
        double d = 9.4;
        int e = 19;
        double f = 12.9;
        double g = 15.7;
        int h = 7;

        //Results for each method (data type dependent of assignment requirements)
        int result1 = subtractionReturn(a, b);
        double result2 = subtractionReturn(c, d);
        double result3 = subtractionReturn(e, f);
        double result4 = subtractionReturn(g, h);

        //Print results for each line
        System.out.println("The larger number subtracted by the smaller number is "  + result1);
        System.out.println("The larger number subtracted by the smaller number is "  + result2);
        System.out.println("The larger number subtracted by the smaller number is " + result3);
        System.out.println("The larger number subtracted by the smaller number is " + result4);
    }

    //Return result for result1
    public static int subtractionReturn(int n1, int n2) {
        int result;
        if (n1 > n2)
            result = (n1 - n2);
        else
            result = (n2 - n1);
        return result;
    }

    //Return result for result2
    public static double subtractionReturn(double n1, double n2) {
        double result;
        if (n1 > n2)
            result = (n1 - n2);
        else
            result = (n2 - n1);
        return result;
    }

    //Return result for result3
    public static double subtractionReturn(int n1, double n2) {
        double result;
        if (n1 > n2)
            result = (n1 -n2);
        else
            result = (n2 - n1);
        return result;
    }

    //Return result for result4
    public static double subtractionReturn(double n1, int n2) {
        double result;
        if (n1 > n2)
            result = (n1 - n2);
        else
            result = (n2 - n1);
        return result;
    }
}