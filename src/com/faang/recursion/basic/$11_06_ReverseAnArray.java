/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.recursion.basic;

import java.util.Arrays;

/**
 *
 * @author SHAKIR
 */
public class $11_06_ReverseAnArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int arrayLength = array.length;
        reverseArrayBruteForce(array, arrayLength);
        spaceOptimisedApproach(array, arrayLength);
        recursiveApproach(array, 0, arrayLength - 1);
    }

    /**
     *
     * We use extra array with the same length of input array and perform the
     * Iteration from end of the array and store the every iteration value in
     * the reversedArray
     * <p>
     * Time Complexity - <b>O(n)</b>
     * <p>
     * Space Complexity: <b>O(n)</b>, for the extra array used.
     *
     * @param array Input Array
     * @param arrayLength Length of Array
     */
    public static void reverseArrayBruteForce(int[] array, int arrayLength) {
        int[] reversedArray = new int[array.length];
        for (int i = arrayLength - 1; i >= 0; i--) {
            reversedArray[arrayLength - i - 1] = array[i];
        }
        System.out.println("Reversed array :::: " + Arrays.toString(reversedArray));
    }

    /**
     *
     * Swap the Elements of the Array for the specified Index Positions
     *
     * @param arr Input Array
     * @param first First Index Position
     * @param last Last Index Position
     *
     * @return int[] after swapping the array with first and last
     */
    public static int[] swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        return arr;
    }

    /**
     * We will divide the array to half and swap the first element to last and
     * vice versa, so it will Iterate till the middle of array and swap the
     * elements
     * <p>
     * Time Complexity: O(n), single-loop-Iteration involved.
     * <p>
     * Space Complexity: O(1)
     *
     * @param array Input Array
     * @param arrayLength Length Oof Array
     */
    public static void spaceOptimisedApproach(int[] array, int arrayLength) {
        int halfArrayLength = arrayLength / 2;
        for (int i = 0; i < halfArrayLength; i++) {
            array = swap(array, i, arrayLength - i - 1);
        }
        System.out.println("Reversed array :::: " + Arrays.toString(array));
    }

    /**
     *
     * We will swap the elements of array and recursively call our function by
     * incrementing the first index position and decrementing the last index
     * position which will assure us that array will be iterated till half of
     * its size, and once the base condition {@literal (head < tail)} is met our
     * array will be reversed.
     *
     * <p>
     * Time Complexity: O(n)
     * <p>
     * Space Complexity: O(1)
     * <p>
     * <b>NOTE</b>: We can do this using single pointer with the same approach
     * which is used for Iterative approach(spaceOptimisedApproach) with
     * recursive function calls
     *
     * @param array Input array
     * @param head First Index Position
     * @param tail Last Index Position
     */
    public static void recursiveApproach(int[] array, int head, int tail) {
        if (head < tail) {
            System.out.println("Reversed Array :::: " + Arrays.toString(array));
            return;
        }
        array = swap(array, head, tail);
        recursiveApproach(array, head++, tail--);
    }

}
