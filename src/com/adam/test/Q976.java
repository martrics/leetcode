package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/4 13:49
 * version: 1.0.0
 */
public class Q976 {
    public static void main(String[] args) {
        int[] A = new int[]{3, 2, 3, 4};
        Solution solution = new Solution();
        System.out.println(solution.largestPerimeter(A));
    }

    static class Solution {
        public int largestPerimeter(int[] A) {
            Arrays.sort(A);
            int n = A.length;
            for(int i = n - 1; i >= 2; i--){
                if(A[i - 1] + A[i - 2] > A[i]){
                    return A[i - 1] + A[i - 2] + A[i];
                }
            }
            return 0;
        }
    }
}
