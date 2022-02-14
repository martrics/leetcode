package com.adam.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/22 19:03
 * version: 1.0.0
 */
public class Q1238 {
    public static void main(String[] args) {
        int n = 3;
        int start = 2;
        Solution solution = new Solution();
        List<Integer> list = solution.circularPermutation(n, start);
        for(int val : list){
            System.out.println(val + "\t");
        }
    }

    static class Solution{
        public List<Integer> circularPermutation(int n, int start) {
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < 1 << n; i++){
                list.add(binaryToGray(i, n));
            }
            for(int i = 0; i < 1 << n; i++){
                if(list.get(i) == start){
                    Collections.rotate(list, (1 << n) - i);
                    return list;
                }
            }
            return list;
        }

        private int binaryToGray(int val, int n){
            int ans = val & (1 << (n - 1));
            for(int i = 0; i < n - 1; i++){
                int bit = ((val & (1 << i)) >> i) ^ ((val & (1 << (i + 1))) >> (i + 1));
                ans |= bit << i;
            }
            return ans;
        }

    }
}
