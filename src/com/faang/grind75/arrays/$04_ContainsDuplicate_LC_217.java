package com.faang.grind75.arrays;

import java.util.*;

/**
 * Created By Mohammad Shakir - 27/09/2022
 */
public class $04_ContainsDuplicate_LC_217 {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int n = array.length;
        boolean isDuplicate = isDuplicateUsingSet(array, n);
        boolean isDuplicateUsingSort = isDuplicateUsingSort(array, n);
        System.out.println("Is Duplicate :::: " + isDuplicateUsingSort);
    }

    /**
     * Time Complexity - O(NlogN)
     * Space Complexity - O(N) if space consider for sorting the array
     *
     * @param array
     * @param n
     * @return
     */
    private static boolean isDuplicateUsingSort(int[] array, int n) {
        Arrays.sort(array);
        for (int i = 1; i < n; i++) {
            if (array[i] == array[i - 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Time complexity - O(N)
     * Space Complexity - O(N)
     *
     * @param array
     * @param n
     * @return
     */
    private static boolean isDuplicateUsingSet(int[] array, int n) {
        Set<Integer> set = new HashSet<>();
        for (Integer element : array) {
            if (set.contains(element)) {
                return true;
            }
            set.add(element);
        }
        return false;
    }
}
