package com.adam.test;

public class Shuffle {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,4,3,2,1};
        int n = 4;
        Solution solution = new Solution();
        int[] result = solution.shuffle(nums, n);
        for(int val : result){
            System.out.println(val);
        }
    }

    static class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] result = new int[nums.length];
            for(int i = 0; i < n; i++){
                result[i * 2] = nums[i];
                result[i * 2 + 1] = nums[n + i];
            }
            return result;
        }
    }
}
