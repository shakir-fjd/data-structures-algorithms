package com.faang.arrays;

import java.util.*;

/**
 * Created by Mohammad Shakir on 14/09/2022 - 09:32 PM
 */
public class $06_RotateArrayLeftByNSteps {

    public static void main(String[] args) {
        int[] array = {81, 67, 16, 24, 16, 80, 28, 75, 43, 69};
//        int[] array = {1, 2, 3, 4, 5};
        int noOfIterations = 2;

//        bruteForceRotateArray(array, noOfIterations);
        optimalSolution(array, noOfIterations);
    }

    /**
     * 1 2 3 4 5
     * <p>
     * 3 4 5 1 2
     *
     * @param array
     * @param noOfIterations
     */
    private static void bruteForceRotateArray(int[] array, int noOfIterations) {

        int length = array.length;
        int[] temp = new int[length];

        for (int i = 0; i < noOfIterations; i++) {
            temp[i] = array[i];
        }

        for (int i = noOfIterations; i < length; i++) {
            array[i - noOfIterations] = array[i];
        }

        for (int i = length - noOfIterations; i < length; i++) {
            array[i] = temp[i - (length - noOfIterations)];
        }

        System.out.println(Arrays.toString(array));
    }

    public static void optimalSolution(int[] array, int iterations) {
        int length = array.length;
        if (iterations < 0 || length == 1) {
            return;
        }
        reverse(array, 0, iterations - 1);
        reverse(array, iterations, length - 1);
        reverse(array, 0, length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] a, int si, int ei) {
        while (si < ei) {
            swap(a, si, ei);
            si++;
            ei--;
        }
    }

    public static void swap(int[] a, int si, int ei) {
        int temp = a[si];
        a[si] = a[ei];
        a[ei] = temp;
    }

}
