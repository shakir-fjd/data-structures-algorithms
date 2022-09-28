/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author SHAKIR
 */
public class $05_PrintAllDivisors {

    public static void main(String[] args) {
        int num = 144;
        printAllDivisors(num);
        printAllDivisorsNlogN(num);
    }

    private static void printAllDivisors(int num) {
        int iterationLimit = (int) Math.sqrt(num);
        List<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i <= iterationLimit; i++) {
            if (num % i == 0) {
                divisorList.add(i);
                if (num / i != i) {
                    divisorList.add(num / i);
                }
            }
        }
        Collections.sort(divisorList);
        System.out.println(divisorList);
    }

    private static void printAllDivisorsNlogN(int num) {
        int iterationLimit = num / 2;
        List<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i <= iterationLimit; i++) {
            if (num % i == 0) {
                divisorList.add(i);
            }
        }
        divisorList.add(num);
        System.out.println(divisorList);
    }
}
