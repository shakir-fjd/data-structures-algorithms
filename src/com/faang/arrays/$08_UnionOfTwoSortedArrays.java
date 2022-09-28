package com.faang.arrays;

import java.util.*;

/**
 * Created by Mohammad Shakir on 16/09/2022 - 09:20 PM
 */
public class $08_UnionOfTwoSortedArrays {

    public static void main(String[] args) {

//        int a1[] = {11, 12, 13, 4, 5, 6, 7, 8, 9, 10};
//        int a2[] = {1, 2, 3, 4, 4, 5, 11, 12};
        int a1[] = {0, 2, 3, 4, 5};
        int a2[] = {2, 3, 4, 4, 5};
        bruteForceApproach(a1, a2);
        optimalSolution(a1, a2);
    }

    public static void optimalSolution(int[] a1, int[] a2) {

        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n1 = a1.length;
        int n2 = a2.length;
        while (i < n1 && j < n2) {
            if (a1[i] <= a1[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != a1[i]) {
                    list.add(a1[i++]);
                }
            } else if (a1[i] > a1[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != a1[j]) {
                    list.add(a1[j++]);
                }
            }
        }
        while (i < n1) {
            if (list.size() == 0 || list.get(list.size() - 1) != a1[i]) {
                list.add(a1[i++]);
            }
        }
        while (j < n2) {
            if (list.size() == 0 || list.get(list.size() - 1) != a1[j]) {
                list.add(a1[j++]);
            }
        }
        System.out.println(list);
    }

    /**
     * Time Complexity - O(N)
     * N for Iterating the Array
     * Space Complexity - O(N)
     * <p>
     * Optimal solution in O(N) could be possible using the Two pointers Approach
     *
     * @param a1
     * @param a2
     */
    public static void bruteForceApproach(int[] a1, int[] a2) {
        Set<Integer> set = new HashSet<>();
        for (Integer element : a1) {
            set.add(element);
        }
        for (Integer element : a2) {
            set.add(element);
        }
        System.out.println(set);
    }
}
