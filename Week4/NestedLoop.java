/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File NestedLoop.java */
/*
 * Assignment 4.2
 * Purpose: Use nested loops in order to "print" desired numerical outline
 *
 * To compile the program:
 * javac NestedLoop.java
 *
 * To execute the program:
 * java NestedLoop
 *
 */

public class NestedLoop {

    public static void main(String[] args) {

        //Start of nested loops for #2 series
        for (int i = 6; i <= 6; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
        }

        System.out.println();

        for (int i = 5; i <= 5; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
        }

        System.out.println();

        for (int i = 4; i <= 4; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
        }

        System.out.println();

        for (int i = 3; i <= 3; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
        }

        System.out.println();

        for (int i = 2; i <= 2; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
        }

        System.out.println();

        for (int i = 1; i <= 1; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
        }

        System.out.println();
        System.out.print("         ");

        for (int i = 1; i <= 1; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(" " + j);
                j++;
            }
        }

        System.out.println();
        System.out.print("       ");

        for (int i = 2; i <= 2; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(" " + j);
                j++;
            }
        }
        //End of nested loops for #2 series

        //Start of nested loops for #3 series
        System.out.println();
        System.out.print("     ");

        for (int i = 3; i <= 3; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(" " + j);
                j++;
            }
        }

        System.out.println();
        System.out.print("   ");

        for (int i = 4; i <= 4; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(" " + j);
                j++;
            }
        }

        System.out.println();
        System.out.print(" ");

        for (int i = 5; i <= 5; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(" " + j);
                j++;
            }
        }

        System.out.println();

        for (int i = 6; i <= 6; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
        }
        //End of nested loops for #3 series

    }

}
