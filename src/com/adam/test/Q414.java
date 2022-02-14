package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/20 18:26
 * version: 1.0.0
 */
public class Q414 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, -2147483648};
        Solution solution = new Solution();
        System.out.println(solution.thirdMax(nums));
    }

    static class Solution {
        public int thirdMax(int[] nums) {
            int n = nums.length;
            if (n == 1) {
                return nums[0];
            }
            if (n == 2) {
                return Math.max(nums[0], nums[1]);
            }

            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            int thirdMax = Integer.MIN_VALUE;
            boolean flag = false;
            for (int num : nums) {
                if(num == Integer.MIN_VALUE){
                    flag = true;
                }
                if (num == max || num == secondMax || num == thirdMax) {
                    continue;
                }
                if (num > max) {
                    thirdMax = secondMax;
                    secondMax = max;
                    max = num;
                } else {
                    if (num > secondMax) {
                        thirdMax = secondMax;
                        secondMax = num;
                    } else {
                        thirdMax = Math.max(thirdMax, num);
                    }
                }
            }

            if (max == secondMax || secondMax == thirdMax) {
                return max;
            }

            if(!flag) {
                return thirdMax == Integer.MIN_VALUE ? max : thirdMax;
            }else{
                return thirdMax;
            }
        }
    }
}
