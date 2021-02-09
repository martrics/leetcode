package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/4 14:05
 * version: 1.0.0
 */
public class Q985 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4};
        int[][] queries = new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        Solution solution = new Solution();
        int[] ans = solution.sumEvenAfterQueries(A, queries);
        for(int val : ans){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
            int n = queries.length;
            int[] ans = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                if((A[i] & 0x1) == 0){
                    sum += A[i];
                }
            }
            ans[0] = sum;
            for(int i = 0; i < n; i++){
                int val = queries[i][0];
                int index = queries[i][1];
                int before = A[index];
                A[index] += val;
                if((before & 0x1) == 0){
                    if((val & 0x1) == 0){
                        sum += val;
                    }else{
                        sum -= before;
                    }
                }else{
                    if((val & 0x1) != 0){
                        sum += val + before;
                    }
                }
                ans[i] = sum;
            }
            return ans;
        }
    }
}
