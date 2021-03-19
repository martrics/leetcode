package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/5 10:42
 * version: 1.0.0
 */
public class Q997 {
    public static void main(String[] args) {
        int N = 3;
        int[][] trust = new int[][]{{1, 2}, {2, 3}};
        Solution solution = new Solution();
        System.out.println(solution.findJudge(N, trust));
    }

    static class Solution {
        public int findJudge(int N, int[][] trust) {
            if (N == 1) {
                return 1;
            }
            int[] trustOther = new int[N];
            int[] trustedByOther = new int[N];
            for (int[] arr : trust) {
                trustedByOther[arr[1] - 1]++;
                trustOther[arr[0] - 1]++;
            }
            for (int i = 0; i < N; i++) {
                if (trustedByOther[i] == N - 1 && trustOther[i] == 0) {
                    return i + 1;
                }
            }
            return -1;
        }
    }
}
