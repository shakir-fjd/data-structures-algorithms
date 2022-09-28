/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faang.hashing.basic;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SHAKIR
 */
public class $13_01_CountFrequencyOfEachElementInArray {

    public static void main(String[] args) {
        int[] inputArray = {10, 5, 10, 15, 10, 5};
        countFrequencyBruteForce(inputArray);
        countFrequencyUsingHashMap(inputArray);
    }

    /**
     *
     * We will use two for loops and an extra Boolean array which will keep
     * track of the element counted and update it as true and if index position
     * is true it means that element is already counted so we will continue
     * <p>
     * The first Loop's each element will be compared with second loops each and
     * if they match increment the count and update the array as true.
     *
     * @param inputArray
     */
    private static void countFrequencyBruteForce(int[] inputArray) {
        int arrayLength = inputArray.length;
        boolean[] visitedArray = new boolean[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            if (visitedArray[i]) {
                continue;
            }
            int count = 0;
            for (int j = i; j < arrayLength; j++) {
                if (inputArray[i] == inputArray[j]) {
                    count++;
                    visitedArray[j] = true;
                }
            }
            System.out.println("Count of " + inputArray[i] + " ::::: " + count);
        }
    }

    private static void countFrequencyUsingHashMap(int[] inputArray) {
        int arrayLength = inputArray.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arrayLength; i++) {
            if (map.containsKey(inputArray[i])) {
                map.put(inputArray[i], map.get(inputArray[i]) + 1);
            } else {
                map.put(inputArray[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println("Count of " + key + " ::::: " + map.get(key));
        }
    }
}
