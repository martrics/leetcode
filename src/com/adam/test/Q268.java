package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/5 16:50
 * version: 1.0.0
 */
public class Q268 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int ans = 0;
            for(int i = 0; i < n; i++){
                ans ^= i ^ nums[i];
            }
            return ans;
        }
    }
}
