package com.adam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 9:55
 * version: 1.0.0
 */
public class Q1237 {
    public static void main(String[] args) {
        CustomFunction customFunction = new CustomFunction();
        int z = 5;
        Solution solution = new Solution();
        List<List<Integer>> listList = solution.findSolution(customFunction, z);
        for (List<Integer> list : listList) {
            for (int val : list) {
                System.out.print(val + "\t");
            }
            System.out.print("\n");
        }
    }

    static class Solution {
        public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
            List<List<Integer>> list = new ArrayList<>();
            int max = 1001;
            int upper = max;
            for (int i = 1; i < max; i++) {
                for (int j = upper - 1; j >= 1; j--) {
                    int val = customfunction.f(i, j);
                    if (val == z) {
                        list.add(Arrays.asList(i, j));
                        upper = j;
                        break;
                    } else if (val < z) {
                        upper = j + 1;
                        break;
                    }
                }
            }
            return list;
        }
    }

    static class CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        public int f(int x, int y) {
            return x * y;
        }
    }
}
