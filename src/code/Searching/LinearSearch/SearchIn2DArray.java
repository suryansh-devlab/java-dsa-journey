package code.Searching.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 12 } };

        // Search in the array
        int[] ans = search(arr, 18);
        System.out.println(Arrays.toString(ans));

        // Maximum Value
        System.out.println(max(arr));

        // Minimum Value
        System.out.println(min(arr));

    }

    static int[] search(int[][] brr, int target) {
        for (int row = 0; row < brr.length; row++) {
            for (int cols = 0; cols < brr[row].length; cols++) {
                if (brr[row][cols] == target) {
                    return new int[] { row, cols };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] brr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < brr.length; row++) {
            for (int cols = 0; cols < brr[row].length; cols++) {
                if (brr[row][cols] > max) {
                    max = brr[row][cols];
                }
            }
        }
        return max;
    }

    static int min(int[][] brr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < brr.length; row++) {
            for (int cols = 0; cols < brr[row].length; cols++) {
                if (brr[row][cols] < min) {
                    min = brr[row][cols];
                }
            }
        }
        return min;
    }
}
