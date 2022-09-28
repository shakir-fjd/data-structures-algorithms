package com.faang.sortingAlgorithms;

import java.util.*;

/**
 * Created by Mohammad Shakir on 10/9/2022 - 12:43 AM
 */
public class $06_QuickSort {

    public static void main(String[] args) {
        int[] array = {5, 9, 15, 17, 1, 3};
        int n = array.length - 1;
        quickSort(array, 0, n);
        System.out.println(Arrays.toString(array));
    }

    private static int getPivotIndexAfterPartition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (array[j] < pivot) {
                i++;
                //swap the position
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[end] = temp;
        return i;
    }

    private static void quickSort(int[] array, int start, int end) {

        if (start < end) {
            int pivotIndex = getPivotIndexAfterPartition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }

    }

}
