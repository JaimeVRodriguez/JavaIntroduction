/*
 *
 * Student Jaime Rodriguez
 * Bellevue University
 *
 */
/* File MyRectangle.java */
/*
 * Assignment 9.3
 * Purpose: Construct a MyRectangle class that constructs a rectangle
 * and will be able to a run a client program that will identify different
 * parameters of each respective rectangle
 *
 * To compile the program:
 * javac MyRectangle.java
 *
 * To execute the program:
 * java MyRectangle
 *
 */

public class MyRectangle{

    //Data fields
    private double width = 1.0;
    private double height = 1.0;
    private String color = "white";

    //Construct rectangle object
    public MyRectangle(){
        width = 1.0;
        height = 1.0;
        color = "white";
    }

    public MyRectangle(double widthParam, double heightParam, String colorParam){
        setWidth(widthParam);
        setHeight(heightParam);
        setColor(colorParam);
    }

    //The following are all methods to return specific rectangle parameters
    public double getWidth(){
        return width;
    }

    public void setWidth(double widthParam){
        width = widthParam;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double heightParam){
        height = heightParam;
    }

    public String getColor(){
       return color;
    }

    public void setColor(String colorParam){
        color = colorParam;
    }

    public double findArea(){
        return getWidth() * getHeight();
    }
}