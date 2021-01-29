package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/27 17:40
 * version: 1.0.0
 */
public class Q283 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        for(int num : nums){
            System.out.print(num + "\t");
        }
    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int i = 0;
            int j = 0;
            for(i = 0; i < n; i++){
                if(nums[i] != 0) {
                    nums[j++] = nums[i];
                }
            }
            while(j < n){
                nums[j++] = 0;
            }
        }
    }
}
