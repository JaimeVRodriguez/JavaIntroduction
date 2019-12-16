/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File BubbleSort.java */
/*
 * Assignment 8.2
 * Purpose: Create an array list of 10 randomly generated numbers
 * and use a method to "bubble sort" them in descending order
 *
 * To compile the program:
 * javac BubbleSort.java
 *
 * To execute the program:
 * java BubbleSort
 *
 */

public class BubbleSort {

    public static void main (String [] args){

        int [] numbers = new int[10];               //create the array
        for(int i=0; i<numbers.length; i++)
            numbers[i]=(int)(Math.random()*10);

        System.out.println("The ten digit array is: ");
        for (int number : numbers)                  //print the array
            System.out.print(number + " ");

        System.out.println();
        System.out.println();

        bubbleSort(numbers);                        //invoke the sorting method

        System.out.println("The array in descending order is:");
        for(int sorted: numbers) {                  //print array in descending order
            System.out.print(sorted + " ");
        }

    }

    public static void bubbleSort(int[] numbers){
        boolean changed;                            // set flag to true to begin first pass
        int temp;
        do{
            changed = false;                        //set flag to false awaiting a possible swap
            for(int i=0; i<numbers.length-1; i++){
                if(numbers[i] < numbers[i+1]){
                    temp = numbers[i];              //swap numbers
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;            //swap occured
                    changed = true;
                }
            }
        }
        while(changed);
    }

}
