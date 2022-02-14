package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/2 17:02
 * version: 1.0.0
 */
public class Q35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 0;
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, target));
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            if(target > nums[high]){
                return high + 1;
            }
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }
}
