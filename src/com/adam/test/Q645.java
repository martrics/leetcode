package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/9 18:00
 * version: 1.0.0
 */
public class Q645 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 4, 6, 5};
        Solution solution = new Solution();
        int[] ans = solution.findErrorNums(nums);
        System.out.println(ans[0] + "\t" + ans[1]);
    }

    static class Solution{
        public int[] findErrorNums(int[] nums) {
            int[] ans = new int[2];
            int n = nums.length;
            int[] arr = new int[n];
            for(int num : nums){
                arr[num - 1]++;
            }
            for(int i = 0; i < n; i++){
                if(arr[i] == 0){
                    ans[1] = i + 1;
                }else if(arr[i] > 1){
                    ans[0] = i + 1;
                }
            }
            return ans;
        }
    }
}
