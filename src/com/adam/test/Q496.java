package com.adam.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 17:34
 * version: 1.0.0
 */
public class Q496 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        Solution solution = new Solution();
        int[] result = solution.nextGreaterElement(nums1, nums2);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums2.length; i++) {
                map.put(nums2[i], i);
            }
            int[] result = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                int index = map.get(nums1[i]);
                if (index == nums2.length - 1) {
                    result[i] = -1;
                } else {
                    int j = index + 1;
                    for (; j < nums2.length; j++) {
                        if (nums2[j] > nums1[i]) {
                            result[i] = nums2[j];
                            break;
                        }
                    }
                    if (j == nums2.length) {
                        result[i] = -1;
                    }
                }
            }
            return result;
        }
    }
}
