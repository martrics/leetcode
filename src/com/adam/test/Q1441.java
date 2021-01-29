package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 15:05
 * version: 1.0.0
 */
public class Q1441 {
    public static void main(String[] args) {
        int[] target = new int[]{1,2};
        int n = 4;
        Solution solution = new Solution();
        System.out.println(solution.buildArray(target, n));
    }

    static class Solution{
        public List<String> buildArray(int[] target, int n) {
            List<String> list = new ArrayList<>();
            int pos = 1;
            for(int val : target){
                while(pos < val){
                    list.add("Push");
                    list.add("Pop");
                    pos++;
                }
                list.add("Push");
                pos++;
            }
            return list;
        }
    }
}
