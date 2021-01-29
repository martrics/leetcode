package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/20 9:12
 * version: 1.0.0
 */
public class Q628 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Solution solution = new Solution();
        System.out.println(solution.maximumProduct(nums));
    }


    static class Solution {
        public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            if (nums[n - 1] < 0) {
                return nums[n - 1] * nums[n - 2] * nums[n - 3];
            }
            if(nums[n - 1] == 0){
                return 0;
            }
            if(nums[n - 1] > 0 && nums[n - 2] <= 0){
                return nums[n - 1] * nums[0] * nums[1];
            }
            if(nums[n - 1] > 0 && nums[n - 2] > 0 && nums[n - 3] <= 0){
                return nums[0] * nums[1] * nums[n - 1];
            }
            return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3 ], nums[0] * nums[1] * nums[n - 1]);
        }
    }
}
