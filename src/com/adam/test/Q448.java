package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 16:49
 * version: 1.0.0
 */
public class Q448 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        Solution solution = new Solution();
        List<Integer> list = solution.findDisappearedNumbers(nums);
        for (int val : list) {
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                int index = nums[i] > 0? nums[i] - 1 : -nums[i] - 1;
                if(nums[index] > 0){
                    nums[index] = - nums[index];
                }
            }
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > 0){
                    list.add(i + 1);
                }
            }
            return list;
        }
    }
}
