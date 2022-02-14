package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/13 9:29
 * version: 1.0.0
 */
public class Q747 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Solution solution = new Solution();
        System.out.println(solution.dominantIndex(nums));
    }

    static class Solution {
        public int dominantIndex(int[] nums) {
            int n = nums.length;
            if (n == 1) {
                return 0;
            }
            int ans = 0;
            int secondLarge = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[ans]) {
                    ans = i;
                }
            }
            for(int i = 0; i < n; i++){
                if(i != ans){
                    secondLarge = Math.max(secondLarge, nums[i]);
                }
            }
            return nums[ans] >= 2 * secondLarge ? ans : -1;
        }
    }
}
