package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/12 16:15
 * version: 1.0.0
 */
public class Q219 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        int k = 10;
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(nums, k));
    }

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            int n = nums.length;
            for(int i = 0; i < n ; i++){
                for(int j = i + 1; j < i + 1 + k && j < n; j++){
                    if(nums[i] == nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
