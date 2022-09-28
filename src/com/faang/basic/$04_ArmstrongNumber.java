/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.basic;

/**
 *
 * @author SHAKIR
 *
 *
 * Armstrong Numbers are the numbers having the sum of digits raised to power
 * no. of digits is equal to a given number. Examples- 0, 1, 153, 370, 371, 407,
 * and 1634 are some of the Armstrong Numbers.
 *
 *
 * Example 1: Input:153 Output: Yes, it is an Armstrong Number Explanation: 1^3
 * + 5^3 + 3^3 = 153
 *
 * Input:170 Output: No, it is not an Armstrong Number Explanation: 1^3 + 7^3 +
 * 0^3 != 170
 *
 */
public class $04_ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Is Armstrong Number :::: " + getArmStringNumber(num));
    }

    private static boolean getArmStringNumber(int num) {
        int numCount = 0;
        int tempNumCount = num;
        int tempNumSum = num;
        while (tempNumCount != 0) {
            numCount++;
            tempNumCount = tempNumCount / 10;
        }

        int sum = 0;
        while (tempNumSum != 0) {
            int base = tempNumSum % 10;
            sum += Math.pow(base, numCount);
            tempNumSum = tempNumSum / 10;
        }
        return sum == num;
    }
}
