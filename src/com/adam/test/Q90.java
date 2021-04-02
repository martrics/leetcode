package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/31 14:40
 * version: 1.0.0
 */
public class Q90 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2};
        Solution solution = new Solution();
        List<List<Integer>> list = solution.subsetsWithDup(nums);
        for (List<Integer> l : list) {
            for (int val : l) {
                System.out.print(val + "\t");
            }
            System.out.print("\n");
        }
    }

    static class Solution {
        private int[] freq = new int[21];
        List<List<Integer>> ans = new ArrayList<>();

        public List<List<Integer>> subsetsWithDup(int[] nums) {

            for (int num : nums) {
                freq[num + 10]++;
            }
            List<Integer> list = new ArrayList<>();
            add(list, 0);
            return ans;
        }

        private void add(List<Integer> li, int start) {
            List<Integer> list = new ArrayList<>(li);
            int i = start;
            while (i < 21 && freq[i] == 0) {
                i++;
            }
            if (i < 21) {
                int count = freq[i];
                add(list, i + 1);
                for (int j = 0; j < count; j++) {
                    list.add(i - 10);
                    add(list, i + 1);
                }
            }else{
                ans.add(list);
            }
        }
    }
}
