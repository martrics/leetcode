package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 10:43
 * version: 1.0.0
 */
public class Q189 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;
        Solution solution = new Solution();
        solution.rotate(nums, k);
        for (int val : nums) {
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            if (n == 0 || n == 1) {
                return;
            }
            k = k % n;
            for(int i = 0; i < k; i++){
                int val = nums[n - 1];
                System.arraycopy(nums, 0, nums, 1, n - 1);
                nums[0] = val;
            }
        }
    }
}
