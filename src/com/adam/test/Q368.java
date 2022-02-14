package com.adam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/23 11:20
 * version: 1.0.0
 */
public class Q368 {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 9, 18, 54, 108, 540, 90, 180, 360, 720};
        Solution solution = new Solution();
        List<Integer> ans = solution.largestDivisibleSubset(nums);
        for (int val : ans) {
            System.out.println(val + "\t");
        }
    }

    static class Solution {
        public List<Integer> largestDivisibleSubset(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int[] dp = new int[n];
            Arrays.fill(dp, 1);
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] % nums[j] == 0) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }
            int max = 0;
            int index = 0;
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (dp[i] > max) {
                    max = dp[i];
                    index = i;
                }
            }
            List<Integer> ans = new ArrayList<>();
            ans.add(nums[index]);
            max--;
            last = nums[index];
            while (max > 0) {
                for (int i = 0; i < n; i++) {
                    if (dp[i] == max && last % nums[i] == 0) {
                        ans.add(nums[i]);
                        max--;
                        last = nums[i];
                        break;
                    }
                }
            }
            Collections.reverse(ans);
            return ans;
        }
    }
}
