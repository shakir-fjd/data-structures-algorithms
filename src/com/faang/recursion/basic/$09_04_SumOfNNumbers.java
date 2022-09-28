/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.recursion.basic;

/**
 *
 * @author SHAKIR
 */
public class $09_04_SumOfNNumbers {

    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        usingParameterisedApproach(number, sum);
        System.out.println("Sum using functional a~pproach::: " + usingFunctionalApproach(number));
    }

    // This will use extra parameter for summation to store the sum
    private static void usingParameterisedApproach(int number, int sum) {

        if (number == 0) {
            System.out.println("Sum ::: " + sum);
            return;
        }
        usingParameterisedApproach(number - 1, sum + number);
    }

    private static int usingFunctionalApproach(int number) {
        if (number == 0) {
            return 0;
        }
        return number + usingFunctionalApproach(number - 1);
    }
}
