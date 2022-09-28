package com.faang.arrays;

import java.util.*;

/**
 * Created by Mohammad Shakir on 13/09/2022 - 10:23 PM
 */
public class $04_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
//        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr = {1, 1, 2};
//        int noOfUniqueElements = removeDuplicates(arr);
        int noOfUniqueElementsUsingbetterSolution = betterSolution(arr);
        System.out.println(noOfUniqueElementsUsingbetterSolution);
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniqueElements.add(nums[i]);
        }
        for (Integer element : uniqueElements) {
            int setIncrementCount = 0;
            nums[setIncrementCount++] = element;
        }
        return uniqueElements.size();
    }

    public static int optimalSolution(int[] array) {

        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i]) {
                array[i++] = array[j];
            }
        }
        return i + 1;
    }

    public static int betterSolution(int[] array) {
        int i = 1;
        for (int element : array) {
            if (element > array[i - 1]) {
                array[i++] = element;
            }
        }
        return i;
    }
}
