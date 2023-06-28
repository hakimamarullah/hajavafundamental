package com.juaracoding.hajavafundamental.cobacoba;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 6/28/2023 10:34 PM
@Last Modified 6/28/2023 10:34 PM
Version 1.0
*/

public class Method1 {

    /**
     * Method to calculate the area of rectangle with formula Area= Length * Width
     * @return area the area of the rectangle in double
     * @param length length of rectangle
     * @param width width of rectangle
     * */
    public static double areaOfRectangle(double length, double width){
        return length * width;
    }

    /**
     * Method to calculate the area of circle
     * @return the area of the circle in double
     * @param radius the radius value of the circle
     * */
    public static double areaOfCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Method to calculate the area of kite.
     * The first parameter and the second parameter can be supplied interchangeably.
     * @return the area of the kite in double
     * @param diagonal1 the first diagonal value of the kite
     * @param diagonal2 the second diagonal value of the kite
     * */
    public static double areaOfKite(double diagonal1, double diagonal2){
        return (diagonal1 * diagonal2) / 2;
    }
}
