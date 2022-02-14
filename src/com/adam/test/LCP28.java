package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/22 18:24
 * version: 1.0.0
 */
public class LCP28 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 15;
        Solution solution = new Solution();
        System.out.println(solution.purchasePlans(nums, target));
    }

    static class Solution {
        public int purchasePlans(int[] nums, int target) {
            Arrays.sort(nums);
            if (nums[0] + nums[1] > target) {
                return 0;
            }
            int j = nums.length - 1;
            int ans = 0;
            for (int i = 0; i < j; i++) {
                while (j > i && nums[i] + nums[j] > target) {
                    j--;
                }
                if (j > i) {
                    ans += j - i;
                    ans = ans % 1000000007;
                }
            }
            return ans;
        }
    }
}
