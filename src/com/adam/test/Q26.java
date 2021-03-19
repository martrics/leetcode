package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/25 17:03
 * version: 1.0.0
 */
public class Q26 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
        for(int val : nums){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            if(n < 2){
                return n;
            }
            int i = 0;
            int j = 1;
            while(j < n){
                if(nums[i] != nums[j]){
                    i++;
                    j++;
                }else{
                    while(j < n && nums[j] == nums[i]){
                        j++;
                    }
                    if(j == n){
                        break;
                    }
                    nums[++i] = nums[j];
                }
            }
            return i + 1;
        }
    }
}
