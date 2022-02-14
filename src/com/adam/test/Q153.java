package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/8 9:13
 * version: 1.0.0
 */
public class Q153 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2};
        Solution solution = new Solution();
        System.out.println(solution.findMin(nums));
    }

    static class Solution {
        public int findMin(int[] nums) {
            int n = nums.length;
            if (n == 1) {
                return nums[0];
            }
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] > nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return nums[left];
        }
    }
}
