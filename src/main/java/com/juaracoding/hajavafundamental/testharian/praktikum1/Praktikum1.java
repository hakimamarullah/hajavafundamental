package com.juaracoding.hajavafundamental.testharian.praktikum1;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 6/23/2023 10:04 PM
@Last Modified 6/23/2023 10:04 PM
Version 1.0
*/

import java.util.Scanner;
import java.util.function.Predicate;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String input = scan.nextLine();

        System.out.printf("Hasil\t: %d%n", sumNonLowerCaseAscii(input));
    }

    /* Returns the sum of non-lowercase ASCII value */
    public static int sumNonLowerCaseAscii(String input) {
        Predicate<Character> isLower = t -> (int) t >= 97 && (int) t <= 122;
        int intSum = 0;
        for(int i=0; i<input.length(); i++){
           if(!isLower.test(input.charAt(i))){
                intSum += input.charAt(i);
            }
        }

        return intSum;
    }
}
