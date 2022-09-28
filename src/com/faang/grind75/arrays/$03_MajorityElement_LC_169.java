package com.faang.grind75.arrays;

import java.util.*;

/**
 * Created By Mohammad Shakir - 26/09/2022
 */
public class $03_MajorityElement_LC_169 {

    public static void main(String[] args) {

        int[] array = {2, 2, 1, 1, 1, 2, 2};
        int n = array.length;

        int majorityElement = getMajorityElementUsingHashMap(array, n);
        getMajorityElementUsingMooreVotiongAlgorithm(array, n);
        getMajorityElementBySortingArray(array, n);
        System.out.println("Majority Element ::: " + majorityElement);
    }

    private static int getMajorityElementBySortingArray(int[] array, int n) {
        Arrays.sort(array);
        return array[n / 2];
    }

    private static int getMajorityElementUsingMooreVotiongAlgorithm(int[] array, int n) {
        int majorityElement = 0;
        int count = 0;

        /**
         * Using foreach loop,
         * once the Item is not equals it will decrement the count
         * if item is equal it will increment the count
         * if count is 0 that is the majority element
         */
        for (int element : array) {
            if (count == 0) {
                majorityElement = element;
            }

            if (majorityElement == element) {
                count++;
            } else {
                count--;
            }
        }
        return majorityElement;


    }

    private static int getMajorityElementUsingHashMap(int[] array, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : array) {
            map.put(element, map.getOrDefault(element, 0) + 1);
            if (map.get(element) > n / 2) {
                return element;
            }
        }
        return -1;
    }
}
