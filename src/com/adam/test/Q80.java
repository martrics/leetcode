package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/6 10:00
 * version: 1.0.0
 */
public class Q80 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return n;
            }
            int DUP_NUM = Integer.MAX_VALUE;
            int cur = nums[0];
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (nums[i] == cur) {
                    count++;
                    if (count == 3) {
                        while (i < n && nums[i] == cur) {
                            nums[i] = DUP_NUM;
                            i++;
                        }
                        if (i < n) {
                            cur = nums[i];
                            count = 1;
                        }
                    }
                } else {
                    cur = nums[i];
                    count = 1;
                }
            }
            int i = 0;
            int j = 0;
            while (j < n) {
                while (i < n && nums[i] != DUP_NUM) {
                    i++;
                }
                j = i;
                while (j < n && nums[j] == DUP_NUM) {
                    j++;
                }
                if (j < n) {
                    nums[i] = nums[j];
                    nums[j] = DUP_NUM;
                }
            }
            return i;
        }
    }
}
