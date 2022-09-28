/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.basic;

/**
 *
 * @author SHAKIR
 */
public class $02_ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Reversed Number :::::: " + reverseNumber(12458));
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        int tempNumber = number;

        while (tempNumber != 0) {

            // When I divide the number(%) with 10 I will get remainder as last number
            int individualLastDigit = tempNumber % 10;

            // multiply the last digit with 10 for every iteration which will make it 10,100,1000,10000... and add the last individual
            reversedNumber = reversedNumber * 10 + individualLastDigit;

            // When I divide the number(/) with 10 It will provide all numbers but not last.
            tempNumber = tempNumber / 10;
        }

        return reversedNumber;
    }
}
