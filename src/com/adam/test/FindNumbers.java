package com.adam.test;

public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = new int[]{12, 345, 2, 6, 7896};
        Solution solution = new Solution();
        System.out.println(solution.findNumbers(nums));
    }

    static class Solution {
        public int findNumbers(int[] nums) {
            int total = 0;
            for(int num : nums){
                if((num > 9 && num < 100) || (num > 999 && num < 10000) || num == 100000){
                    total++;
                }
            }
            return total;
        }
    }
}
