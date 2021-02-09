package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/5 17:02
 * version: 1.0.0
 */
public class Q27 {
    public static void main(String[] args) {
        int[] nums = new int[]{0};
        int val = 0;
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums, val));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != val){
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
        }
    }
}
