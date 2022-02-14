package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/5/17 10:42
 * version: 1.0.0
 */
public class Q1282 {
    public static void main(String[] args) {
        int[] groupSizes = new int[]{3, 3, 3, 3, 3, 1, 3};
        Solution solution = new Solution();
        List<List<Integer>> list = new ArrayList<>();
        for(List<Integer> li : list){
            for(int val : li){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    static class Solution {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {
            int n = groupSizes.length;
            List<List<Integer>> ans = new ArrayList<>();
            for(int i = 0; i < n; i++){

            }
        }
    }
}
