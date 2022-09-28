/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.recursion.basic;

/**
 *
 * @author SHAKIR
 */
public class $10_05_FactorialofNNumbers {

    public static void main(String[] args) {

        int number = 4;
        int product = 1;
        usingParameterisedApproach(number, product);
        System.out.println("Product using functional approach ::: " + usingFunctionalApproach(number));
    }

    // This will use extra parameter to store product after for Multiplying
    private static void usingParameterisedApproach(int number, int product) {

        if (number == 0) {
            System.out.println("Product ::: " + product);
            return;
        }
        usingParameterisedApproach(number - 1, product * number);
    }

    private static int usingFunctionalApproach(int number) {
        if (number == 0) {
            return 1;
        }
        return number * usingFunctionalApproach(number - 1);
    }
}
