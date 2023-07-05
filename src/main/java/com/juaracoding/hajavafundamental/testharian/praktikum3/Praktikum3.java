package com.juaracoding.hajavafundamental.testharian.praktikum3;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/5/2023 10:18 PM
@Last Modified 7/5/2023 10:18 PM
Version 1.0
*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> data = new ArrayList<>();
        System.out.println("Enter any integer as you want below (one integer/row)");
        System.out.println("Please type any non-integer character to stop");
        try {
            while(true){
                int input = scan.nextInt();
                data.add(input);
            }
        }catch (Exception e){
            DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Format value to at most two decimal places and remove trailing zeros
            String result = decimalFormat.format(averageList(data));
            System.out.printf("User melakukan input data sebanyak %d kali\n", data.size());
            System.out.printf("Dengan data input %s\n", formatListString(data));
            System.out.printf("Rata-rata: %s\n", result);
        }
    }


    /**
     * Return average calculation
     * @param data list of integer.
     * @return average value of data in the given list
     */
    public static double averageList(List<Integer> data){
        int total = data.stream().reduce(0, Integer::sum);
        double n = data.size();

        return total / n;
    }

    /**
     * Returns string of format data1,data2,... dan dataN.
     * @param data java list which could contains any type of element
     * @return string in format data1,data2,... dan dataN
     * */
    public static <T> String formatListString(List<T> data){
        StringBuilder stringBuilder = new StringBuilder();
        String[] dataArray = data.toString().split(",");

        for(int i=0; i<dataArray.length; i++){
            stringBuilder.append(dataArray[i]);

            if(i < dataArray.length - 2){
                stringBuilder.append(",");
            } else if (i == dataArray.length - 2) {
                stringBuilder.append(" dan");
            }
        }

        return stringBuilder.toString().replaceAll("[\\[\\]]", "");
    }
}
