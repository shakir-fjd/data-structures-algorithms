package com.faang.arrays;

import java.util.*;

/**
 * Created by Mohammad Shakir on 16/09/2022 - 11:40 PM
 */
public class $09_IntersectionOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 3, 4,5, 5};
        int[] a2 = {3, 3, 5, 5};
        intersectArray(a1, a2);
    }

    /**
     * 0,0 - true ne less so p1 - 1
     * 1,0 - true ne less  so p1 - 2
     * 2,0 - true e add p1++, p2++ so p1 - 3 p2 - 1
     * 3,1 - true e add p1++, p2++ so p1 - 4, p2 - 2
     * 4,2 - true ne less p1++, p1 - 5
     * 5,2 - true e add p1+, p1++ so p1 -6, p2 - 3
     * 6,3 - false break
     *
     * @param a1
     * @param a2
     */

    public static void intersectArray(int[] a1, int[] a2) {
        int p1 = 0;
        int p2 = 0;

        List<Integer> list = new ArrayList<>();
        while (p1 < a1.length && p2 < a2.length) {
            if (a1[p1] == a2[p2]) {
                list.add(a1[p1]);
                p1++;
                p2++;
            } else if (a1[p1] < a2[p2]) {
                p1++;

            } else if (a1[p1] > a2[p2]) {
                p2++;
            }
        }
        System.out.println(list);
    }
}
