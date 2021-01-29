package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 15:20
 * version: 1.0.0
 */
public class Offer21 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5};
        Solution solution = new Solution();
        int[] result = solution.exchange(nums);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public int[] exchange(int[] nums) {
            int n = nums.length - 1;
            int i = 0;
            int j = n;
            while(i < j){
                while(i <= n &&(nums[i] & 0x1) != 0){
                    i++;
                }
                while(j >= 0 && (nums[j] & 0x1) == 0){
                    j--;
                }
                if(i < j){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
            return nums;
        }
    }
}
