/*
 * Purpose: Create an array (numbers 0-9) in order to produce
 * 100 numbers within this array. The ultimate goal being
 * to count the occurrence of each of these numbers
 *
 * To compile the program:
 * javac CountInteger.java
 *
 * To execute the program:
 * java CountInteger
 *
 */

public class CountInteger {

    public static void main (String [] args) {

        //Calling the method creating the array
        int [] numbers = createNumbers();

        //Calling the method that displays the array
        System.out.println("The numbers are: " );
        displayNumbers(numbers);

        //Calling the method counting the array
        int[] counts = countNumbers(numbers);

        //Line breaks for creating a cleaner output
        System.out.println();
        System.out.println();
        //Display the results
        System.out.println("The occurrences of each number from 0 to 9 are:");
        displayCounts(counts);

        //Statement displaying that the number of numbers is 100
        System.out.println();
        System.out.println("Sum of occurrences is: " + occurrenceSum(counts));
    }

    //Create the array
    public static int[] createNumbers() {
        int[] numbers = new int[10];
        return numbers;
    }

    //Method displaying the array
    public static void displayNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((numbers[i] + i + " "));
        }
    }

    //Method counting the occurrence of each number from 0 to 9
    public static int[] countNumbers (int[] counts) {
        for (int i = 1; i <= 100; i++) {
            counts[(int)(Math.random() * 10)]++;
        }
        return counts;
    }

    //Method producing the output for the display
    public static void displayCounts (int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "'s: " + counts[i]);
        }
    }

    /*Counting the number of occurrences to ensure it equals 100
    * to match assignment parameters
    */
    public static int occurrenceSum(int[] counts) {
        int sum = 0;
        for (int value : counts) {
            sum += value;
        }
        return sum;
    }

}

