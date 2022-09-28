package com.faang.sortingAlgorithms;

import java.util.*;

/**
 * Created by Mohammad Shakir on 5/9/2022 - 09:57 PM
 * <p>
 * Time Complexity - O(N log N) as we used @code {Collections.sort()} provided by java
 * Space Complexity - O(N) as we Used extra array
 */
public class $04_BucketSort {


    public static void main(String[] args) {

        int[] array = {14, 5, 8, 20, 1, 6, 9, 7, 22, 13};
        int arrayLength = array.length;
        int[] sortedArray = getSortedArrayUsingBucketSort(array, arrayLength);
        System.out.println(Arrays.toString(sortedArray));
    }

    /**
     * Key Points:
     * <p>
     * 1. Generated Number of buckets for array using the formula.
     * 2. Identified the exact bucket where element needs to be inserted.
     * 3. Created a Array for ArrayList of static and made sure it is Initialised or else it would be empty.
     * 4. Made use of float to get the exact bucket number.
     * 5. Sorted List of buckets.
     * 6. At the End Merged all the Buckets Elements to the array , which will be sorted array.
     *
     * @param array       - Input Array
     * @param arrayLength - Array Length
     */
    public static int[] getSortedArrayUsingBucketSort(int[] array, int arrayLength) {

        // find the number of Buckets
        int numberOfBuckets = (int) Math.round(Math.sqrt(arrayLength));

        // find the Maximum value from Bucket
        int maximumElement = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > maximumElement) {
                maximumElement = element;
            }
        }

        // create an array of buckets which will have list of elements
        List<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // find Bucket in which element to be inserted and Insert element
        for (int element : array) {
            int bucket = (int) Math.ceil(((float) element * numberOfBuckets) / (float) maximumElement);
            buckets[bucket - 1].add(element);
        }

        // Sort all the elements present in the bucket
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
//            System.out.println(bucket);
        }

        // Merge all the elements from the buckets into array
        int arrayIndex = 0;
        for (List<Integer> bucket : buckets) {
            for (int element : bucket) {
                array[arrayIndex++] = element;
            }
        }
        return array;
    }
}
