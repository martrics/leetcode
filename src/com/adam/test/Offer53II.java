package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/7 13:48
 * version: 1.0.0
 */
public class Offer53II {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(nums));
    }

    static class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            if(n == 1){
                return 1 - nums[0];
            }
            if(nums[n - 1] == n - 1){
                return n;
            }
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if(nums[mid] == mid){
                    low = mid + 1;
                }else if(nums[mid] > mid){
                    high = mid;
                }
            }
            return low;
        }
    }
}
