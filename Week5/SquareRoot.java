/*
 * Purpose: Display a chart of the square root of even numbers from 0 to 20
 *
 * To compile the program:
 * javac SquareRoot.java
 *
 * To execute the program:
 * java SquareRoot
 *
 */

public class SquareRoot {

    public static void main (String [] args) {

        //Title of table
        System.out.println("Number | SquareRoot");
        System.out.println("-------------------");

        int i;

        //First set of square roots (Single Digits-Formatting)
        for (i = 0; i <= 8; i+=2) {
            System.out.print(i + "      " + "|" + "   ");
            double squareRoot = Math.sqrt(i);
            System.out.printf("%.4f" + "\n", squareRoot);
        }

        //Second set of square roots (Double Digits-Formatting)
        for (i = 10; i <= 20; i+=2) {
            System.out.print(i + "     " + "|" + "   ");
            double squareRoot = Math.sqrt(i);
            System.out.printf("%.4f" + "\n", squareRoot);
        }
    }
}


