/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.basic;

/**
 *
 * @author SHAKIR
 */
public class $03_GCDOfTwoNumbers {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        System.out.println("GCD of (" + num1 + "," + num2 + ") ::::::: " + gcd(num1, num2));
        System.out.println("GCD of (" + num1 + "," + num2 + ") ::::::: " + usingEuclidean(num1, num2));
    }

    private static int gcd(int num1, int num2) {
        int gcdNumber = 0;
        int lastTraversalPosition = Math.min(num1, num2);
        for (int i = 1; i <= lastTraversalPosition; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcdNumber = i;
            }
        }
        return gcdNumber;
    }

    /*
    *   As per Euclid's algorithm for the greatest common divisor, the GCD of two positive integers (a, b) can be calculated as:
    *   If a = 0, then GCD (a, b) = b as GCD (0, b) = b.
    *   If b = 0, then GCD (a, b) = a as GCD (a, 0) = a.
    *   If both a≠0 and b≠0, we write 'a' in quotient remainder form (a = b×q + r) where q is the quotient and r is the remainder, and a>b.
    *   Find the GCD (b, r) as GCD (b, r) = GCD (a, b)
    *   We repeat this process until we get the remainder as 0.
     */
    private static int usingEuclidean(int a, int b) {
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }
        //(b,r) = (a,b)
        return usingEuclidean(b, a % b);
    }

}
