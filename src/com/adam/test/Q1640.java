package com.adam.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 14:29
 * version: 1.0.0
 */
public class Q1640 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7};
        int[][] pieces = new int[][]{{2}, {4}, {6}, {8}};
        Solution solution = new Solution();
        System.out.println(solution.canFormArray(arr, pieces));
    }

    static class Solution {
        public boolean canFormArray(int[] arr, int[][] pieces) {
            for (int i = 0; i < arr.length; ) {
                boolean flag = false;
                for (int[] piece : pieces) {
                    if (piece[0] == arr[i]) {
                        flag = true;
                        for (int j = 0; j < piece.length; j++) {
                            if (piece[j] != arr[i + j]) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            i += piece.length;
                        }
                        break;
                    }
                }
                if (!flag) {
                    return false;
                }
            }
            return true;
        }
    }
}
