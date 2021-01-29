package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 9:51
 * version: 1.0.0
 */
public class Q1128 {
    public static void main(String[] args) {
        int[][] dominoes = new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        Solution solution = new Solution();
        System.out.println(solution.numEquivDominoPairs(dominoes));
    }

    static class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {
            int[] arr = new int[100];
            for (int[] domino : dominoes) {
                int index = domino[1] * 10 + domino[0];
                if (domino[0] > domino[1]) {
                    index = domino[0] * 10 + domino[1];
                }
                arr[index]++;
            }
            int count = 0;
            for (int val : arr) {
                if (val > 1) {
                    count += (val * (val - 1)) >> 1;
                }
            }
            return count;
        }
    }
}
