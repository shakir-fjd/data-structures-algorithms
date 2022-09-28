package com.faang.grind75.arrays;

import java.util.*;

/**
 * Created By Mohammad Shakir - 22/09/2022
 */
public class $01_TwoSum_LC_01 {

    public static void main(String[] args) {

        int[] a = {2, 7, 11, 15};
        int n = a.length;
        int target = 9;
        int[] solution = usingMap(a, target, n);
        System.out.println(Arrays.toString(solution));

    }

    public static int[] usingMap(int[] a, int target, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            int diff = target - a[i];
            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                break;
            }
            map.put(a[i], i);
        }
        return result;
    }
}
