package com.adam.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/25 10:43
 * version: 1.0.0
 */
public class Q1769 {
    public static void main(String[] args) {
        String boxes = "001011";
        Solution solution = new Solution();
        int[] ans = solution.minOperations(boxes);
        for(int val : ans){
            System.out.println(val + "\t");
        }
    }

    static class Solution {
        public int[] minOperations(String boxes) {
            int n = boxes.length();
            if(n == 1){
                return new int[]{0};
            }
            int[] dp = new int[n];
            int left = boxes.charAt(0) - '0';
            int right = 0;
            for(int i = 1; i < n; i++){
                if(boxes.charAt(i) == '1'){
                    right++;
                    dp[0] += i;
                }
            }

            for(int i = 1; i < n; i++){
                if(boxes.charAt(i) == '1'){
                    right--;
                    dp[i] = dp[i - 1] + left - right - 1;
                    left++;
                }else {
                    dp[i] = dp[i - 1] + left - right;
                }
            }

            return dp;
        }
    }
}
