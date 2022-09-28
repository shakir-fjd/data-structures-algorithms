package com.faang.arrays;

import java.util.*;

/**
 * Created by Mohammad Shakir on 13/09/2022 - 11:42 PM
 */
public class $05_RotateArrayRightByNSteps {

    public static void main(String[] args) {

        int[] array = {81, 67, 16, 24, 16, 80, 28, 75, 43, 69};
//        int[] array = {1, 2};
        int noOfIterations = 3;

//        bruteForceRotateArray(array, noOfIterations);
        optimalApproach(array, noOfIterations);
    }

    private static void bruteForceRotateArray(int[] array, int k) {
        int n = array.length;
        int[] temp = new int[n];
        for (int i = 0; i < k; i++) {
            temp[i] = array[n - k + i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            temp[i + k] = array[i];
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void optimalApproach(int[] nums, int k) {
        int length = nums.length;

        if (k < 0 || k >= length) {
            return;
        }
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
        System.out.println(Arrays.toString(nums));
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
