/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File RandomArray.java */
/*
 * Assignment 7.2
 * Purpose: Create an array list of 10 randomly generated numbers
 * and print the result of the array list
 *
 * To compile the program:
 * javac RandomArray.java
 *
 * To execute the program:
 * java RandomArray
 *
 */

public class RandomArray {

    public static void main (String [] args) {

        //Create an array list with 10 items
        int myList [] = new int[10];

        //Call random numbers to include in "myList"
        for (int i = 0; i < myList.length; i++)
            myList[i] = (int)((Math.random() * 10) + 1);

        //Print the randomly generated 10 numbers from 1 - 10
        for (int i = 0; i < myList.length; i++)
            System.out.print(myList[i] + " ");

    }
}
