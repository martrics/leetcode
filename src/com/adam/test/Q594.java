package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/19 11:56
 * version: 1.0.0
 */
public class Q594 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1};
        Solution solution = new Solution();
        System.out.println(solution.findLHS(nums));
    }

    static class Solution {
        public int findLHS(int[] nums) {
            int n = nums.length;
            int ans = 0;
            if (n == 1) {
                return 0;
            }
            Arrays.sort(nums);
            int i = 0;
            int j = 0;
            while (j < n) {
                while (j < n && nums[j] == nums[i]) {
                    j++;
                }
                int k = j;
                while (j < n && nums[j] == nums[i] + 1) {
                    j++;
                }
                if(nums[j - 1] == nums[i] + 1) {
                    ans = Math.max(ans, j - i);
                }
                i = k;
                j = k;
            }
            return ans;
        }
    }
}
