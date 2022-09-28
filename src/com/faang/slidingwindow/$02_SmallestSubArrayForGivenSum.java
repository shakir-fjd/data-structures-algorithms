package com.faang.slidingwindow;

public class $02_SmallestSubArrayForGivenSum {

    public static void main(String[] args) {

        int[] a = {4, 2, 2, 7, 8, 1, 2, 8, 10};
        int sum = 8;

        int smallestSubArraylength = getSmallestSubArrayLength(a, sum);
        System.out.println(smallestSubArraylength);
    }

    private static int getSmallestSubArrayLength(int[] a, int sum) {
        int currentWindowSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowStart = 0;
        for (int i = 0; i < a.length; i++) {
            currentWindowSum += a[i];
            while (currentWindowSum >= sum) {
                minWindowSize = Math.min(minWindowSize, i - currentWindowStart + 1);
                currentWindowSum -= a[currentWindowStart];
                currentWindowStart++;
                if (minWindowSize == 1) {
                    return minWindowSize;
                }
            }
        }
        return minWindowSize;
    }
}
