package com.adam.test;

public class DecompressRLElist {
    public static void main(String[] args){
        int[] nums = new int[]{1, 2, 3, 4};
        Solution solution = new Solution();
        int[] result = solution.decompressRLElist(nums);
        for(int val : result){
            System.out.println(val);
        }
    }


    static class Solution {
        public int[] decompressRLElist(int[] nums) {
            int length = 0;
            for(int i = 0; i < nums.length - 1; i+= 2){
                length += nums[i];
            }

            int[] result = new int[length];
            int index = 0;
            for(int i = 0; i < nums.length - 1; i += 2){
                for(int j = 0; j < nums[i]; j++){
                    result[index] = nums[i + 1];
                    index++;
                }
            }

            return result;
        }
    }
}
