package com.adam.test;

import java.util.HashMap;
import java.util.Map;

public class NumIdenticalPairs {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1};

        Solution solution = new Solution();
        System.out.println(solution.numIdenticalPairs(nums));
    }

    static class Solution {
        public int numIdenticalPairs(int[] nums) {
            int result = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int num : nums){
                map.merge(num, 1, Integer::sum);
            }

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int val = entry.getValue();
                if(val > 1){
                    result += val * (val - 1) / 2;
                }
            }
            return result;
        }
    }
}
