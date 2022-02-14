package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/26 11:50
 * version: 1.0.0
 */
public class Interview0804 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> list = solution.subsets(nums);
        for(List<Integer> l : list){
            for(int val : l){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    static class Solution {
        private final List<List<Integer>> ans = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            int n = nums.length;
            List<List<Integer>> ans = new ArrayList<>();
            for(int i = 0; i < 1 << n; i++){
                List<Integer> list = new ArrayList<>();
                for(int j = 0; j < n; j++){
                    if((i & (1 << j)) != 0){
                        list.add(nums[j]);
                    }
                }
                ans.add(list);
            }
            return ans;
        }
    }
}
