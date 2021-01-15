package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 9:11
 * version: 1.0.0
 */
public class Q1018 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 0, 0, 0, 1, 0, 0, 1};
        Solution solution = new Solution();
        List<Boolean> list = solution.prefixesDivBy5(A);
        for (Boolean bool : list) {
            System.out.print(bool + "\t");
        }
    }

    static class Solution {
        public List<Boolean> prefixesDivBy5(int[] A) {
            List<Boolean> list = new ArrayList<>(A.length);
            int start = 0;
            for (int val : A) {
                start = (start * 2 + val) % 5;
                list.add(start == 0);
            }
            return list;
        }
    }
}
