/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File Client.java */
/*
 * Assignment 9.3
 * Purpose: Construct a MyRectangle class that constructs a rectangle
 * and will be able to a run a client program that will identify different
 * parameters of each respective rectangle
 *
 * To compile the program:
 * javac Client.java
 *
 * To execute the program:
 * java Client
 *
 */

public class Client{

    public static void main(String[] args){

        //Set parameters for first rectangle
        MyRectangle r1 = new MyRectangle();
        r1.setWidth(5.5);
        r1.setHeight(9.5);
        r1.setColor("Red");

        //Set parameters for second rectangle
        MyRectangle r2 = new MyRectangle();
        r2.setWidth(15.0);
        r2.setHeight(7.0);
        r2.setColor("Yellow");


        //Displaying details of first rectangle object
        System.out.println("Rectangle 1 Details: ");
        System.out.println("Width: " + r1.getWidth() + " inches");
        System.out.println("Height: "+r1.getHeight() + " inches");
        System.out.println("Area: "+r1.findArea() + " inches squared");
        System.out.println("Color: "+r1.getColor());

        System.out.println("");

        //Displaying details of first rectangle object
        System.out.println("Rectangle 2 Details: ");
        System.out.println("Width: "+r2.getWidth() + " inches");
        System.out.println("Height: "+r2.getHeight() + " inches");
        System.out.println("Area: "+r2.findArea() + " inches squared");
        System.out.println("Color: "+r2.getColor());

    }
}
