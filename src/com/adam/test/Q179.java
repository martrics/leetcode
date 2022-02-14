package com.adam.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/12 9:34
 * version: 1.0.0
 */
public class Q179 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 11};
        Solution solution = new Solution();
        System.out.println(solution.largestNumber(nums));
    }

    static class Solution {
        public String largestNumber(int[] nums) {
            int n = nums.length;
            Integer[] arr = new Integer[n];
            boolean allZero = true;
            for (int i = 0; i < n; i++) {
                arr[i] = nums[i];
                if(allZero && nums[i] != 0){
                    allZero = false;
                }
            }
            if(allZero){
                return "0";
            }
            Arrays.sort(arr, (o1, o2) -> {
                String s1 = o1.toString() + o2.toString();
                String s2 = o2.toString() + o1.toString();
                int len = s1.length();
                for (int i = 0; i < len; i++) {
                    if (s1.charAt(i) > s2.charAt(i)) {
                        return 1;
                    } else if (s1.charAt(i) < s2.charAt(i)) {
                        return -1;
                    }
                }
                return 0;
            });
            StringBuilder builder = new StringBuilder();
            for (int i = n - 1; i >= 0; i--) {
                builder.append(arr[i]);
            }
            return builder.toString();
        }
    }
}
