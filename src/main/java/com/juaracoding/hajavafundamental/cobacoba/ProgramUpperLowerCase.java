package com.juaracoding.hajavafundamental.cobacoba;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/3/2023 9:03 PM
@Last Modified 7/3/2023 9:03 PM
Version 1.0
*/

import java.util.Scanner;

public class ProgramUpperLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

       if(isHuruf(input.charAt(0))){
           if(isLowerCase(input.charAt(0))){
               System.out.printf("%s bukan huruf kapital", input.charAt(0));
           }else {
               System.out.printf("%s adalah huruf kapital", input.charAt(0));
           }
       }else{
           System.out.printf("%s bukan huruf", input.charAt(0));
       }
    }

    /**
     * Returns boolean true if the character is digit 0..9
     * @return boolean
     * @param x character
     * */
    public static boolean isDigit(char x) {
        return x >= '0' && x <= '9';
    }

    /**
     * Returns boolean. This function checks whether the character is alphabet or not.
     * @return boolean
     * @param x character
     * */
    public static boolean isHuruf(char x) {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }

    /**
     * Returns boolean. Checking whether the character is lowercase or not.
     * @return boolean
     * @param x character
     * */
    public static boolean isLowerCase(char x) {
        if(x >= 'a' && x <= 'z'){
            return  true;
        }else if(x >= 'A' && x <= 'Z') {
            return false;
        }
        return false;
    }


}
