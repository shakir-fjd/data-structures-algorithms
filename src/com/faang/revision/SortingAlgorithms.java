package com.faang.revision;

import java.util.*;

/**
 * Created by Mohammad Shakir on 11/09/2022 - 05:10 PM
 */
public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] bubbleArr = {62, 94, 31, 59, 21, 37, 98, 87, 71, 75};
        int bubbleArrLength = bubbleArr.length;
        bubbleSort(bubbleArr, bubbleArrLength);
        System.out.println("Sorted Array Using Bubble Sort ::: " + Arrays.toString(bubbleArr) + "\n");

        //--------------------------------------------------------------------------------------------------------------
        int[] selectionArray = {88, 72, 19, 43, 53, 23, 94, 98, 38, 40};
        int selectionArrayLength = selectionArray.length;
        selectionSort(selectionArray, selectionArrayLength);
        System.out.println("Sorted Array Using Selection Sort ::: " + Arrays.toString(selectionArray) + "\n");

        //--------------------------------------------------------------------------------------------------------------
        int[] insertionArr = {4, 6, 93, 94, 93, 96, 38, 63, 39, 99};
        int insertionArrayLength = insertionArr.length;
        insertionSort(insertionArr, insertionArrayLength);
        System.out.println("Sorted Array Using Insertion Sort ::: " + Arrays.toString(insertionArr) + "\n");

        //--------------------------------------------------------------------------------------------------------------
        int[] mergeSortArr = {65, 52, 56, 42, 33, 19, 71, 8, 39, 78};
        int start = 0;
        int end = mergeSortArr.length - 1;
        mergeSort(mergeSortArr, start, end);
        System.out.println("Sorted Array Using Merge Sort ::: " + Arrays.toString(mergeSortArr) + "\n");

        //--------------------------------------------------------------------------------------------------------------

        int[] quickSortArray = {90, 37, 28, 79, 67, 91, 24, 83, 58, 49};
        int startIndex = 0;
        int endIndex = quickSortArray.length - 1;
        quickSort(quickSortArray, startIndex, endIndex);
        System.out.println("Sorted Array Using Quick Sort ::: " + Arrays.toString(quickSortArray) + "\n");

        //--------------------------------------------------------------------------------------------------------------

        int[] bucketSortArray = {58, 78, 45, 90, 92, 12, 78, 44, 81, 85};
        bucketSort(bucketSortArray);
        System.out.println("Sorted Array Using Bucket Sort ::: " + Arrays.toString(bucketSortArray));
    }


    public static void bucketSort(int[] arr) {

        // Number of Buckets
        int noOfBuckets = (int) Math.round(Math.sqrt(arr.length));

        // find Maximum element
        int maxElement = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > maxElement) {
                maxElement = element;
            }
        }

        // Create Buckets to insert Elements
        List<Integer>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Find the bucket for element and insert
        for (int element : arr) {
            int bucket = (int) Math.ceil(((float) element * noOfBuckets) / (float) maxElement);
            buckets[bucket - 1].add(element);
        }

        // Sort the each bucket
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Merge All the elements

        int indexPosition = 0;
        for (List<Integer> bucket : buckets) {
            for (int element : bucket) {
                arr[indexPosition++] = element;
            }
        }
    }

    public static void quickSort(int[] quickSortArray, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = getPivotIndex(quickSortArray, startIndex, endIndex);
            quickSort(quickSortArray, startIndex, pivotIndex - 1);
            quickSort(quickSortArray, pivotIndex + 1, endIndex);
        }

    }

    public static int getPivotIndex(int[] quickSortArray, int startIndex, int endIndex) {

        int pivot = endIndex;
        int i = startIndex - 1;
        for (int j = startIndex; j < endIndex; j++) {
            if (quickSortArray[j] < quickSortArray[pivot]) {
                i++;
                swap(quickSortArray, i, j);
            }
        }
        i++;
        swap(quickSortArray, i, pivot);
        return i;
    }

    public static void mergeSort(int[] arr, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            int middle = startIndex + (endIndex - startIndex) / 2;
            mergeSort(arr, startIndex, middle);
            mergeSort(arr, middle + 1, endIndex);
            merge(arr, startIndex, middle, endIndex);
        }
    }

    public static void merge(int[] arr, int startIndex, int middle, int endIndex) {
        int[] tempArr = new int[endIndex - startIndex + 1];
        int idx1 = startIndex;
        int idx2 = middle + 1;
        int index = 0;
        while (idx1 <= middle && idx2 <= endIndex) {
            if (arr[idx1] < arr[idx2]) {
                tempArr[index++] = arr[idx1++];
            } else {
                tempArr[index++] = arr[idx2++];
            }
        }
        while (idx1 <= middle) {
            tempArr[index++] = arr[idx1++];
        }
        while (idx2 <= endIndex) {
            tempArr[index++] = arr[idx2++];
        }
        for (int i = 0, j = startIndex; i < tempArr.length; i++, j++) {
            arr[j] = tempArr[i];
        }
    }

    /**
     * Original => 65,33,32,33,61,25,5,52,28,34
     * i=0 => 33,32,33,61,25,5,52,28,(34),65
     * i=1 => 32,33,33,25,5,52,28,(34),61,65
     * i=2 => 32,33,25,5,33,28,(34),52,61,65
     * i=3 => 32,25,5,33,28,(33),34,52,61,65
     * i=4 => 25,5,32,28,(33),33,34,52,61,65
     * i=5 => 5,25,28,(32),33,33,34,52,61,65
     * i=6 => 5,25,(28),32,33,33,34,52,61,65
     * i=7 => 5,(25),28,32,33,33,34,52,61,65
     * i=8 => (5),25,28,32,33,33,34,52,61,65
     */

    public static void bubbleSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * original = 38,66,44,89,36,75,38,4,90,80
     * i=0 => 0 < 10(T) => 4,66,44,89,36,75,38,38,90,80
     * i=1 => 1 < 10(T) => 4,36,66,89,44,75,38,38,90,80
     * i=2 => 2 < 10(T) => 4,36,38,89,66,75,44,38,90,80
     * i=3 => 3 < 10(T) => 4,36,38,38,89,75,66,44,90,80
     * i=4 => 4 < 10(T) => 4,36,38,38,44,89,75,66,90,80
     * i=5 => 5 < 10(T) => 4,36,38,38,44,66,89,75,90,80
     * i=6 => 6 < 10(T) => 4,36,38,38,44,66,75,89,90,80
     * i=7 => 7 < 10(T) => 4,36,38,38,44,66,75,80,90,89
     * i=8 => 8 < 10(T) => 4,36,38,38,44,66,75,80,89,90
     */

    public static void selectionSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                swap(array, i, smallest);
            }
        }
    }

    public static void insertionSort(int[] array, int n) {
        for (int i = 1; i < n; i++) {
            int currentElement = array[i];
            int j = i - 1;
            while (j >= 0 && currentElement < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentElement;
        }
    }


    public static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}
