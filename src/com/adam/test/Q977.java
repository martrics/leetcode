package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 13:54
 * version: 1.0.0
 */
public class Q977 {
    public static void main(String[] args) {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        Solution solution = new Solution();
        int[] result = solution.sortedSquares(nums);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            int start = 0;
            int end = n - 1;
            for(int i = n - 1; i >= 0; i--){
                if(Math.abs(nums[start]) >= Math.abs(nums[end])){
                    result[i] = nums[start] * nums[start++];
                }else{
                    result[i] = nums[end] * nums[end--];
                }
            }
            return result;
        }
    }
}
