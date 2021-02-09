package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 11:37
 * version: 1.0.0
 */
public class Q485 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        Solution solution = new Solution();
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }

    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int i = 0;
            int n = nums.length;
            int max = 0;
            while (i < n) {
                while (i < n && nums[i] == 0) {
                    i++;
                }
                int j = i;
                while (j < n && nums[j] == 1) {
                    j++;
                }
                max = Math.max(max, j - i);
                if (j == n) {
                    break;
                } else {
                    i = j;
                }
            }
            return max;
        }
    }
}
