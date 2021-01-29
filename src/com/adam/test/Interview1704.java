package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 15:43
 * version: 1.0.0
 */
public class Interview1704 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int sum = n * (n + 1) / 2;
            for(int val : nums){
                sum -= val;
            }
            return sum;
        }
    }
}
