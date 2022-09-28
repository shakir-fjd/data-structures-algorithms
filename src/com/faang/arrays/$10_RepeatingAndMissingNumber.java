package com.faang.arrays;

/**
 * Created by Mohammad Shakir on 17/09/2022 - 03:48 PM
 */
public class $10_RepeatingAndMissingNumber {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 5, 3};
        int n = array.length;
        findRepeatingAndMissingNumber(array, n);
        System.out.println(missingNumber(array));
    }

    public static void findRepeatingAndMissingNumber(int[] array, int n) {
        // 1,2,3,3,5         i < 4
        // 3,1,2,5,4,6,7,5 - 1,2,3,4,5,5,6,7
        int missingNumber = 0;
        int repeatingNumber = 0;
        int[] tempArray = new int[n + 1];
        for (int i = 0; i < n; i++) {
            tempArray[array[i]]++;
        }

        for (int i = 1; i < tempArray.length; i++) {
            if (tempArray[i] == 0) {
                missingNumber = i;
            } else if (tempArray[i] > 1) {
                repeatingNumber = i;
            }
        }
        System.out.println("Repeating Number :::: " + repeatingNumber);
        System.out.println("Missing Number :::: " + missingNumber);
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;

        return (nums.length * (nums.length + 1)) / 2 ;
    }
}
