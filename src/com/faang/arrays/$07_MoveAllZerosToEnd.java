package com.faang.arrays;

import java.util.*;

/**
 * Created by Mohammad Shakir on 15/09/2022 - 09:52 PM
 */
public class $07_MoveAllZerosToEnd {

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
//        int[] array = {1, 2};
        int arrayLength = array.length;
//        moveArraysBruteForce(array, arrayLength);
        optimalApproach(array, arrayLength);
//        zerosToEnd(array);
    }

    private static void moveArraysBruteForce(int[] a, int n) {
        int i = 0;
        for (int element : a) {

            if (element != 0) {
                a[i] = element;
                i++;
            }
        }
        for (int j = i; j < n; j++) {
            a[j] = 0;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void optimalApproach(int[] a, int n) {

        int i = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void zerosToEnd(int[] arr) {

        //finding first zero occurrence
        int k = 0;
        while (k < arr.length) {
            if (arr[k] == 0) {
                break;
            } else {
                k = k + 1;
            }
        }

        //finding zeros and immediate non-zero elements and swapping them
        int i = k, j = k + 1;

        while (i < arr.length && j < arr.length) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;

            }
            j++;

        }
        System.out.println(Arrays.toString(arr));
    }
}
