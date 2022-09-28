/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.basic;

/**
 *
 * @author SHAKIR
 */
public class $06_IsPrimeNumber {

    public static void main(String[] args) {
        int num = 1092;
        System.out.println("Is Prime :::: " + isPrimeNumber(num));
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int limit = (int) Math.sqrt(num);
        System.out.println("Square Root ::: " + limit);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                System.out.println("Divisible by ::::: " + i);
                return true;
            }
        }
        return false;
    }
}
