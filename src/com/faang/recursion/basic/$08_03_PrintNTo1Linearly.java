/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.recursion.basic;

/**
 *
 * @author SHAKIR
 */
public class $08_03_PrintNTo1Linearly {

    public static void main(String[] args) {
        int num = 4;
        int limit = 4;
        print(num, limit);
        printNTo1UsingBacktracking(1, limit);
    }

    private static void print(int num, int limit) {
        if (num < 1) {
            return;
        }
//        System.out.println(num);
        print(num - 1, limit);
    }

    private static void printNTo1UsingBacktracking(int num, int limit) {

        if (num > limit) {
            return;
        }
        printNTo1UsingBacktracking(num + 1, limit);
        System.out.println(num);

    }

}
