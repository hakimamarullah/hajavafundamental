package com.juaracoding.hajavafundamental.testharian.praktikum2;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 6/27/2023 9:35 PM
@Last Modified 6/27/2023 9:35 PM
Version 1.0
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0; // Input sum
        int n = 0; // Input counter

        while(true) {
            try{
                int input = scanner.nextInt();
                total += input;
                n++;
            }catch (Exception e) {
                break;
            }
        }

        var decimalFormat = new DecimalFormat("#.##"); // Format value to at most two decimal places and remove trailing zeros
        var result = decimalFormat.format(average(total, n));

        System.out.printf("Rata-rata: %s", result); // Print the average with two digits after the decimal point.

    }

    /**
     * Return average calculation
     * @param total total int value. This is the sum of all value input by user
     * @param n total data. This value represented how many data points there were.
     * @return average value of total/n of type double
     */
    public static double average(int total, double n){
        return total / n;
    }
}
