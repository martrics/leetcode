package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 16:04
 * version: 1.0.0
 */
public class Q704 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(solution.search(nums, target));
    }

    static class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            int left = 0;
            int right = n - 1;
            while(left <= right){
                int mid = left + (right - left) >> 1;
                if(nums[mid] > target){
                    right = mid - 1;
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    return mid;
                }
            }
            return -1;
        }
    }
}
