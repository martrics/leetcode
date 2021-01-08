package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/6 17:07
 * version: 1.0.0
 */
public class Q1636 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1};
        Solution solution = new Solution();
        int[] result = solution.frequencySort(nums);
        for (int val : result) {
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] frequencySort(int[] nums) {
            int[] result = new int[nums.length];
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                Integer freq = map.get(num);
                if (freq == null) {
                    map.put(num, 1);
                    list.add(num);
                } else {
                    map.put(num, freq + 1);
                }
            }
            list.sort((o1, o2) -> {
                if (map.get(o1).equals(map.get(o2))) {
                    return o2 - o1;
                } else {
                    return map.get(o1) - map.get(o2);
                }
            });
            int index = 0;
            for (int num : list) {
                for (int i = 0; i < map.get(num); i++) {
                    result[index++] = num;
                }
            }
            return result;
        }
    }
}
