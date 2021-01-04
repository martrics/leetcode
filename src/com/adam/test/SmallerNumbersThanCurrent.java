package com.adam.test;

import java.util.*;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args){
        int[] nums = new int[]{8, 1, 2, 2, 3};
        Solution solution = new Solution();
        int[] result = solution.smallerNumbersThanCurrent(nums);
        for(int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] sorts = nums.clone();
            Arrays.sort(sorts);
            int[] result = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                int j = 0;
                while(nums[i] > sorts[j]){
                    j++;
                }
                result[i] = j;
            }
            return result;
        }
    }
}
