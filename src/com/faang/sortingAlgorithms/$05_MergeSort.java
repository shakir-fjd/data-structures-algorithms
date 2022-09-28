package com.faang.sortingAlgorithms;

import java.util.*;

/**
 * Created by Mohammad Shakir on 6/9/2022 - 11:36 PM
 */
public class $05_MergeSort {

    public static void main(String[] args) {

        int[] array = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
        int arrayLength = array.length - 1;
        int si = 0;
        int ei = arrayLength;
        divide(array, si, ei);
        System.out.println(Arrays.toString(array));
    }

    private static void divide(int[] array, int si, int ei) {
        if (si < ei) {
        int middle = si + (ei - si) / 2;
        divide(array, si, middle);
        divide(array, middle + 1, ei);
        conquer(array, si, middle, ei);
        }
    }

    private static void conquer(int[] array, int si, int middle, int ei) {
        int[] tempMergeArray = new int[ei - si + 1];

        // Declare starting position for first array,
        // Declare Starting position second array
        // Declare Index position for new temporary array
        int array1Idx = si;
        int array2Idx = middle + 1;
        int tempArrayIdx = 0;

        /**
         *      Iterate through 2 arrays and compare the elements of each array's
         *      first index positions. If array1 index element is less then array2 add
         *      smallest element to temporary array and accordingly until the end of one array.
         */

        while (array1Idx <= middle && array2Idx <= ei) {
            if (array[array1Idx] <= array[array2Idx]) {
                tempMergeArray[tempArrayIdx++] = array[array1Idx++];
            } else {
                 tempMergeArray[tempArrayIdx++] = array[array2Idx++];
            }
        }

        /**
         *  Untill this condition in Average case condition, any one array will be Fully Iterated
         *  and one array will be left with few elements which are already sorted, so we need to
         *  move them to temporary array.
         */

        // For First Array Incompleted Iteration
        while (array1Idx <= middle) {
            tempMergeArray[tempArrayIdx++] = array[array1Idx++];
        }

        // For Second Array Incompleted Iteration
        while (array2Idx <= ei) {
            tempMergeArray[tempArrayIdx++] = array[array2Idx++];
        }

        /**
         * Now We have a sorted array in the temporary array, It's time
         * to move it in main array and return the array
         */

        for (int i = 0, j = si; i < tempMergeArray.length; i++, j++) {
            array[j] = tempMergeArray[i];
        }
    }
}
