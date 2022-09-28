package com.faang.grind75.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created By Mohammad Shakir - 28/09/2022
 */
public class $05_MeetingRoom {

    public static void main(String[] args) {
        int[][] array = {{15, 20}, {0, 30}, {5, 10}};
        int n = array.length;

        willAttendAllMeetings(array, n);
    }

    private static boolean willAttendAllMeetings(int[][] array, int n) {
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] previousArray = null;
        for (int[] currentArr : array) {
            if (previousArray != null && previousArray[1] > currentArr[0]) {
                return false;
            }
            previousArray = currentArr;
        }
        return true;
    }
}
