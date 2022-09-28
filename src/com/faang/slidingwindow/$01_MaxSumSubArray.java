package com.faang.slidingwindow;

public class $01_MaxSumSubArray {

    public static void main(String[] args) {

        int[] array = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int subArraySize = 3;

        int maxValue = getMaxSumOfSubArray(array, subArraySize);
        int otherApproach = otherApproach(array, subArraySize);
        System.out.println("Max Value of Sub Array :::: " + maxValue);
        System.out.println("Max Value of Sub Array :::: " + otherApproach);
    }

    /**
     * In this the subarray size if fixed which is provided by the user, so once we reach the length of that subarray
     * compare that value with maxvalue and get the max value and remove the value of first index and add the next
     * index element.
     *
     * @param array
     * @param subArraySize
     * @return
     */
    private static int getMaxSumOfSubArray(int[] array, int subArraySize) {
        int currentRunningSum = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            currentRunningSum += array[i];
            if (i >= subArraySize - 1) {
                maxValue = Math.max(maxValue, currentRunningSum);
                currentRunningSum -= array[i - (subArraySize - 1)];
            }
        }
        return maxValue;
    }

    //4, 2, 1, 7, 8, 1, 2, 8, 1, 0
    private static int otherApproach(int[] a, int k) {
        int maxWindowSum = Integer.MIN_VALUE;
        int currentWindowSum = 0;

        // this wil give us the current window sun
        for (int i = 0; i < k; i++) {
            currentWindowSum += a[i];
        }
        for (int i = k; i < a.length; i++) {
            maxWindowSum = Math.max(maxWindowSum, currentWindowSum);
            currentWindowSum = currentWindowSum + a[i] - a[i - k];
        }

        return maxWindowSum;
    }
}
