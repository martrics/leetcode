package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 13:37
 * version: 1.0.0
 */
public class Offer03 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        Solution solution = new Solution();
        System.out.println(solution.findRepeatNumber(nums));
    }

    static class Solution {
        public int findRepeatNumber(int[] nums) {
            for(int i = 0; i < nums.length; i++){
                while(nums[i] != i){
                    if(nums[nums[i]] == nums[i]){
                        return nums[i];
                    }else{
                        int tmp = nums[nums[i]];
                        nums[nums[i]] = nums[i];
                        nums[i] = tmp;
                    }
                }
            }
            return -1;
        }
    }
}
