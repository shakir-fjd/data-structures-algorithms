/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.basic;

/**
 *
 * @author SHAKIR
 */
public class $01_CountDigits {

    public static void main(String[] args) {

        System.out.println("Count ::::: "+ countDigits(12252));
    }

    public static int countDigits(int number) {

        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }
        return digitCount;
    }

}
