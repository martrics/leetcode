package com.adam.test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
	    int[] nums = new int[]{1, 2, 8, 4, 5};
	    int target = 10;
	    Solution solution = new Solution();
	    int[] result = solution.twoSum(nums, target);
	    System.out.println("Result is: " + result[0] + ", " + result[1]);
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                if(!map.containsKey(target - nums[i])){
                    map.put(nums[i], i);
                }else{
                    return new int[]{map.get(target - nums[i]), i};
                }
            }
            return new int[]{0, 0};
        }
    }
}
