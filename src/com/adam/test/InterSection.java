package com.adam.test;

import java.util.*;

public class InterSection {
    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        Solution solution = new Solution();
        int[] result = solution.intersection(nums1, nums2);
        for(int val : result){
            System.out.println(val);
        }
    }

    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> result = new HashSet<>();
            Set<Integer> set = new HashSet<>();
            for (int value : nums1) {
                set.add(value);
            }
            for (int value : nums2) {
                if (set.contains(value)) {
                    result.add(value);
                }
            }

            int[] resultArray = new int[result.size()];
            Iterator<Integer> iterator = result.iterator();
            for(int i = 0; i < result.size(); i++){
                resultArray[i] = iterator.next();
            }
            return resultArray;
        }
    }
}
