package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/28 9:13
 * version: 1.0.0
 */
public class Q724 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, -1, 0, 1, 1, 0};
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(nums));
    }

    static class Solution {
        public int pivotIndex(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return -1;
            }
            int sumLeft = 0;
            int sumRight = 0;
            for (int i = 1; i < n; i++) {
                sumRight += nums[i];
            }
            if (sumLeft == sumRight) {
                return 0;
            }
            for (int i = 1; i < n; i++) {
                sumLeft += nums[i - 1];
                sumRight -= nums[i];
                if (sumLeft == sumRight) {
                    return i;
                }
            }
            return -1;
        }
    }
}
