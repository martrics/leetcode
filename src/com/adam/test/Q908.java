package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/13 13:38
 * version: 1.0.0
 */
public class Q908 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 6};
        int K = 3;
        Solution solution = new Solution();
        System.out.println(solution.smallestRangeI(A, K));
    }

    static class Solution {
        public int smallestRangeI(int[] A, int K) {
            int n = A.length;
            Arrays.sort(A);
            if(Math.abs(A[n - 1] - A[0]) <= 2 * K){
                return 0;
            }else{
                return Math.abs(A[n-1] - A[0]) - 2 * K;
            }
        }
    }
}
