package com.faang.sortingAlgorithms;

import java.util.*;

/**
 * Created by Mohammad Shakir on 3/9/2022 - 02:13 PM
 */
public class $02_SelectionSort {

    public static void main(String[] args) {
        int[] array = {10, 4, 5, 5, 9, 55, 88, 5, 3, 8, 66};
//        int[] array = {13, 46, 24, 52, 20, 9};
        int arrayLength = array.length;
        int[] sortedArray = sortArray(array, arrayLength);
        System.out.println("sorted Array :::: " + Arrays.toString(sortedArray));
    }

    private static int[] sortArray(int[] array, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            int minValue = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j] < array[minValue]) {
                    minValue = j;
                }
            }
            if (minValue != i) {
                int temp = array[i];
                array[i] = array[minValue];
                array[minValue] = temp;
            }
        }
        return array;
    }
}
