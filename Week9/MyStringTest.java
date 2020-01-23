/*
 * Purpose: Create a program that will turn an user input string
 * and return the string in reverse order
 *
 * To compile the program:
 * javac MyStringTest.java
 *
 * To execute the program:
 * java MyStringTest
 *
 */
import java.util.Scanner;

public class MyStringTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Enter input
        System.out.print("Enter string:");
        String stringWord = input.nextLine();

        System.out.print("The Reverse order is:");
        //Display reversed string reverse using required length() & charAt()
        for (int i = stringWord.length() - 1; i >= 0; i--)
            System.out.print(stringWord.charAt(i));
    }
}
