package com.faang.arrays;

/**
 * Created by Mohammad Shakir on 12/09/2022 - 09:36 PM
 */
public class $02_SecondLargestAndSmallestElement {

    public static void main(String[] args) {
//        int[] array = {78, 61, 5, 54, 77, 47};
//        int[] array = {90, 40, 72, 57, 12, 28};
        int[] array = {15, 20,30,40,50};
        int n = array.length;
        getSecondSmallestAndLargest(array, n);
        getSecondSmallestAndLargestOtherApproach(array, n);
        effictiveApproachToGetSecondSmallestAndLargest(array, n);
    }

    /**
     * OUTPUT:
     * SECOND SMALLEST - 47
     * SECOND LARGEST - 77
     *
     * @param array
     * @param n
     */
    private static void getSecondSmallestAndLargest(int[] array, int n) {

        int maximum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (array[i] < maximum && array[i] > secondMax) {
                secondMax = array[i];
            }

            if (array[i] > minimum && array[i] < secondMin) {
                secondMin = array[i];
            }
        }
        System.out.println("Second Smallest ::: " + secondMin);
        System.out.println("Second Largest ::: " + secondMax);
    }

    public static void getSecondSmallestAndLargestOtherApproach(int[] array, int n) {
        int maximum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        //90, 40, 72, 57, 12, 28
        for (int i = 0; i < n; i++) {
            maximum = Math.max(maximum, array[i]);
            minimum = Math.min(minimum, array[i]);
        }
        for (int i = 0; i < n; i++) {
            if (array[i] != maximum) {
                secondMax = Math.max(secondMax, array[i]);
            }
            if (array[i] != minimum) {
                secondMin = Math.min(secondMin, array[i]);
            }
        }
        System.out.println("Second Smallest ::: " + secondMin);
        System.out.println("Second Largest ::: " + secondMax);
    }

    // 15, 20,30,40,50
    public static void effictiveApproachToGetSecondSmallestAndLargest(int[] array, int n) {
        int maximum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] > maximum) {
                secondMax = maximum;
                maximum = array[i];
            } else if (array[i] > secondMax && array[i] != maximum) {
                secondMax = array[i];
            }

            if (array[i] < minimum) {
                secondMin = minimum;
                minimum = array[i];
            } else if (array[i] < secondMin && array[i] != minimum) {
                secondMin = array[i];
            }
        }
        System.out.println("Second Smallest ::: " + secondMin);
        System.out.println("Second Largest ::: " + secondMax);

    }
}
