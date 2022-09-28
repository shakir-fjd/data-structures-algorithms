package com.faang.arrays;

/**
 * Created by Mohammad Shakir on 12/09/2022 - 09:00 PM
 */
public class $01_LargestElementInArray {

    public static void main(String[] args) {
        int[] array = {5, 85, 36, 12, 82, 76, 23, 89, 48, 84};
        int n = array.length;
        int maximum = getLargestElement(array, n);
        System.out.println("Maximum Element ::: " + maximum);
    }

    /**
     * Time Complexity : O(N)
     * SPace Complexity : O(1)
     *
     * @param array
     * @param n
     * @return Maximum Element of Array
     */
    private static int getLargestElement(int[] array, int n) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
