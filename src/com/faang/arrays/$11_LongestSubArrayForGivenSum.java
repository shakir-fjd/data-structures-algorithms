package com.faang.arrays;

/**
 * Created by Mohammad Shakir on 18/09/2022 - 12:26 AM
 */
public class $11_LongestSubArrayForGivenSum {

    public static void main(String[] args) {

        int[] arr = {7,1,6,0};
        int k = 7;
        int s = getLongestSubArrayForGivenSum(arr, k);
        System.out.println(s);
    }

    public static int getLongestSubArrayForGivenSum(int[] arr, int k) {

        int currentWindowSum = 0;
        int maxSubArr = Integer.MIN_VALUE;
        int currentWindowPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            currentWindowSum += arr[i];
            while (currentWindowSum >= k) {
                maxSubArr = Math.max(maxSubArr, i - currentWindowPosition + 1);
                currentWindowSum -= arr[currentWindowPosition];
                currentWindowPosition++;
            }
        }
        return maxSubArr;
    }
}
