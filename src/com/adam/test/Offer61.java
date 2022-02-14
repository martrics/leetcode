package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/6 16:29
 * version: 1.0.0
 */
public class Offer61 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 7, 5, 9, 2};
        Solution solution = new Solution();
        System.out.println(solution.isStraight(nums));
    }

    static class Solution {
        public boolean isStraight(int[] nums) {
            Arrays.sort(nums);
            int i = 0;
            while (i < 5 && nums[i] == 0) {
                i++;
            }
            if(i == 5){
                return true;
            }
            for(int j = i; j < 4; j++){
                if(nums[j] == nums[j + 1]){
                    return false;
                }
            }
            int m = nums[4] - nums[i];
            return m <= 4;
        }
    }
}
