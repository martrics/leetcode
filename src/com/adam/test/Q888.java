package com.adam.test;

import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/1 9:34
 * version: 1.0.0
 */
public class Q888 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 5};
        int[] B = new int[]{2, 4};
        Solution solution = new Solution();
        int[] ans = solution.fairCandySwap(A, B);
        System.out.println(ans[0] + "\t" + ans[1]);
    }

    static class Solution {
        public int[] fairCandySwap(int[] A, int[] B) {
            int sumA = 0;
            int sumB = 0;
            Set<Integer> set = new HashSet<>();
            for (int j : A) {
                sumA += j;
            }
            for (int j : B) {
                sumB += j;
                set.add(j);
            }
            int diff = (sumA - sumB) >> 1;
            for (int j : A) {
                if (set.contains(j - diff)) {
                    return new int[]{j, j - diff};
                }
            }
            return new int[]{-1, -1};
        }
    }
}
