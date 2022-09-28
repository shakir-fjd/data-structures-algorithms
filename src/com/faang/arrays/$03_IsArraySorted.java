package com.faang.arrays;

/**
 * Created by Mohammad Shakir on 12/09/2022 - 11:45 PM
 */
public class $03_IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {5,4,6,7,8};
        int n = arr.length;
        boolean isSorted = isArraySorted(arr, n);
        System.out.println(isSorted);
    }

    private static boolean isArraySorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (!(arr[i] <= arr[i + 1])) {
                return false;
            }
        }
        return true;
    }

}
