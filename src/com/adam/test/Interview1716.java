package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/25 17:51
 * version: 1.0.0
 */
public class Interview1716 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9};
        Solution solution = new Solution();
        System.out.println(solution.massage(nums));
    }

    static class Solution {
        public int massage(int[] nums) {
            int n = nums.length;
            if(n == 0){
                return 0;
            }
            if(n == 1){
                return nums[0];
            }
            int[] ans = new int[n];
            ans[0] = nums[0];
            ans[1] = Math.max(nums[0], nums[1]);
            for(int i = 2; i < n; i++){
                ans[i] = Math.max(ans[i - 1], ans[i - 2] + nums[i]);
            }
            return ans[n - 1];
        }
    }
}
