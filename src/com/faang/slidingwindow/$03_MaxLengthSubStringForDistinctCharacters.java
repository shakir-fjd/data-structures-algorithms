package com.faang.slidingwindow;

import java.util.*;

public class $03_MaxLengthSubStringForDistinctCharacters {

    public static void main(String[] args) {
        String inputString = "";
        getLengthOfSubstringForDistinctCharacters(inputString, 2);
    }

    private static int getLengthOfSubstringForDistinctCharacters(String inputString, int distinctCharLength) {

        int windowStart = 0;
        int maxSubstringLength = Integer.MIN_VALUE;
        Map<Character, Integer> nDistinctCharacters = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            Character currentChar = inputString.charAt(i);
            nDistinctCharacters.put(currentChar, nDistinctCharacters.getOrDefault(currentChar, 0) + 1);
            while (nDistinctCharacters.size() > distinctCharLength) {
                char leftChar = inputString.charAt(windowStart);
                nDistinctCharacters.put(leftChar, nDistinctCharacters.get(currentChar) - 1);
                windowStart++;
                if (nDistinctCharacters.get(leftChar) == 0) {
                    nDistinctCharacters.remove(leftChar);
                }
            }
            maxSubstringLength = Math.max(maxSubstringLength, i - windowStart + 1);
        }
        return maxSubstringLength;
    }
}
