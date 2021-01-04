package com.adam.test;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};
        Solution solution = new Solution();
        int[] array = solution.createTargetArray(nums, index);
        for (int i : array) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> list = new ArrayList<>(index.length);
            for (int i = 0; i < index.length; i++) {
                list.add(index[i], nums[i]);
            }
            int[] array = new int[index.length];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            return array;
        }
    }
}
