package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/22 9:12
 * version: 1.0.0
 */
public class Q746 {
    public static void main(String[] args) {
        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Solution solution = new Solution();
        System.out.println(solution.minCostClimbingStairs(cost));
    }

    static class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length + 1;
            if (n < 3) {
                return 0;
            }
            int[] ans = new int[n];
            ans[0] = 0;
            ans[1] = 0;
            for (int i = 2; i < n; i++) {
                ans[i] = Math.min(ans[i - 2] + cost[i - 2], ans[i - 1] + cost[i - 1]);
            }
            return ans[n - 1];
        }
    }
}
