package com.faang.sortingAlgorithms;

import java.util.*;

/**
 * Created by Mohammad Shakir on 3/9/2022 - 01:47 PM
 */
public class $01_BubbleSort {

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 5, 9, 55, 88, 33, 5, 8, 66};
        int arrayLength = array.length;
        int[] sortedArray = sortArray(array, arrayLength);
        System.out.println("sorted Array :::: " + Arrays.toString(sortedArray));
    }

    private static int[] sortArray(int[] array, int arrayLength) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
