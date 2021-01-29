package com.adam.test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/20 15:21
 * version: 1.0.0
 */
public class Q566 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        Solution solution = new Solution();
        int[][] result = solution.matrixReshape(nums, r, c);
        for(int[] arr : result){
            for(int val : arr){
                System.out.print(val + "\t");
            }
            System.out.print("\n");
        }
    }

    static class Solution{
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int n = nums.length;
            int m = nums[0].length;
            if(r * c != m * n){
                return nums;
            }
            int[][] result = new int[r][c];
            int s = 0;
            int t = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    result[s][t] = nums[i][j];
                    t++;
                    if(t == c){
                        t = 0;
                        s++;
                    }
                }
            }
            return result;
        }
    }
}
