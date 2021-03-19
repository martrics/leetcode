package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/22 11:48
 * version: 1.0.0
 */
public class Interview1001 {
    public static void main(String[] args) {
        int[] A = new int[]{0, 0};
        int m = 0;
        int[] B = new int[]{1};
        int n = 1;
        Solution solution = new Solution();
        solution.merge(A, m, B, n);
        for(int val : A){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public void merge(int[] A, int m, int[] B, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;
            while(i >= 0 && j >=0){
                if (B[j] >= A[i]) {
                    A[k] = B[j];
                    j--;
                } else {
                    A[k] = A[i];
                    i--;
                }
                k--;
            }
            while(j >= 0){
                A[k--] = B[j--];
            }
        }
    }
}
