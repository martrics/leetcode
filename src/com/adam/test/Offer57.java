package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/21 16:04
 * version: 1.0.0
 */
public class Offer57 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int i = 0;
            int j = n - 1;
            while(i < j){
                if(nums[i] + nums[j] > target){
                    j--;
                }else if(nums[i] + nums[j] < target){
                    i++;
                }else{
                    break;
                }
            }
            return new int[]{nums[i], nums[j]};
        }
    }
}
