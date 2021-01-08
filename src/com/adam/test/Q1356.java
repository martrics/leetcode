package com.adam.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 11:43
 * version: 1.0.0
 */
public class Q1356 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        Solution solution = new Solution();
        int[] result = solution.sortByBits(arr);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] sortByBits(int[] arr) {
            return Arrays.stream(arr).boxed().sorted(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    int val1 = o1;
                    int val2 = o2;
                    int oneResult = numberOfOne(val1) - numberOfOne(val2);
                    if (oneResult != 0) {
                        return oneResult;
                    } else {
                        return val1 - val2;
                    }
                }
            }).mapToInt(o -> o).toArray();
        }

        private int numberOfOne(int n){
            int count = 0;
            while(n != 0){
                n = n & (n - 1);
                count++;
            }
            return count;
        }
    }
}
