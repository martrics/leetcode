package com.adam.test;

public class RunningSum {
    public static void main(String[] args){
        int[] nums = new int[]{3,1,2,10,1};
        Solution solution = new Solution();
        int[] result = solution.runningSum(nums);
        for(int val : result){
            System.out.println(val);
        }
    }

    static class Solution {
        public int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];
            result[0] = nums[0];
            for(int i = 1; i < nums.length; i++){
                result[i] = result[i-1] + nums[i];
            }
            return result;
        }
    }
}
