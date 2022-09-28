/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.recursion.basic;

/**
 *
 * @author SHAKIR
 */
public class $07_02_Print1ToNLinearly {

    public static void main(String[] args) {
        int num = 4;
        printNumber(num, 1);
        print1ToNUsingBacktracking(num, num);
    }

    private static void printNumber(int num, int times) {
        if (times > num) {
            return;
        }
//        System.out.println(times);
        printNumber(num, times + 1);

    }

    private static void print1ToNUsingBacktracking(int limit, int number) {

        if (number <= 0) {
            return;
        }
        print1ToNUsingBacktracking(limit, number - 1);
        System.out.println(number);
    }
}
