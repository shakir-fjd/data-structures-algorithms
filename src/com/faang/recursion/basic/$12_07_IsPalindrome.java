/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.recursion.basic;

/**
 *
 * @author SHAKIR
 */
public class $12_07_IsPalindrome {

    public static void main(String[] args) {
//        String s = "MADAM";
        String s = "A man, a plan, a canal: Panama";
        if (isPalindromeCheckRecursively(s, 0)) {
            System.out.println("Palindrome ::::: ");
        } else {
            System.out.println("Not Palindrome :::: ");
        }

        if (isPalindromeAfterReplacingSpecialCharacters(s.toLowerCase(), 0, s.length() - 1)) {
            System.out.println("Palindrome ::::: ");
        } else {
            System.out.println("Not Palindrome :::: ");
        }
    }

    /**
     *
     * We will Divide the String to its half and will compare whether the first
     * character and last character are equal,
     * <p>
     * if not equal, String is not palindrome, return {@code false}
     * <p>
     * if equal will proceed with second character and second last character and
     * vice versa, once the base condition is met all the characters are
     * matched, String is palindrome return {@code true}
     * <p>
     * <b>NOTE:</b> This logic is not applicable if you don't remove special
     * characters and numbers
     *
     * @param s String to be Checked
     * @param limit Initial Position of String
     * @return {@code true} if String is Palindrome
     */
    public static boolean isPalindromeCheckRecursively(String s, int limit) {
        if (limit >= s.length() / 2) {
            return true;
        }
        if (s.charAt(limit) != s.charAt(s.length() - limit - 1)) {
            return false;
        }
        return isPalindromeCheckRecursively(s, limit + 1);
    }

    /**
     *
     * We will check String which contains Special characters and numbers,
     * initially we will extract the first index position and last index
     * position of String and will Iterate till half of the String t the base
     * condition will check till half of string.
     * <p>
     * We will extract the first and last character and check whether they are
     * one of alphabets and numbers, if true we will check whether both
     * characters are equal, if {@code true}, not palindrome, if {@code false}
     * we will increment head position and decrement the tail position and check
     * for second and second last index position and vice versa.
     * <p>
     * In between the index positions may be special characters so we will check
     * if any of index positions are special character, we will increment if it
     * is from head index or decrement if it is tail position and make a
     * recursive call.
     *
     *
     * @param s Lower Case String
     * @param head First Index Position
     * @param tail Last Index Position
     * @return {@code true} if String is Palindrome
     */
    public static boolean isPalindromeAfterReplacingSpecialCharacters(String s, int head, int tail) {
        if (head > tail) {
            return true;
        }
        int headChar = s.charAt(head);
        int tailChar = s.charAt(tail);

        if (!Character.isLetterOrDigit(headChar) || !Character.isLetterOrDigit(tailChar)) {
            if (!Character.isLetterOrDigit(headChar)) {
                head++;
            } else {
                tail--;
            }
        } else {
            if (headChar != tailChar) {
                return false;
            } else {
                head++;
                tail--;
            }
        }
        return isPalindromeAfterReplacingSpecialCharacters(s, head, tail);
    }
}
