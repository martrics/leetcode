package com.adam.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/24 10:33
 * version: 1.0.0
 */
public class Q1005 {
    public static void main(String[] args) {
        int[] A = new int[]{-8, 3, -5, -3, -5, -2};
        int K = 6;
        Solution solution = new Solution();
        System.out.println(solution.largestSumAfterKNegations(A, K));
    }

    static class Solution {
        public int largestSumAfterKNegations(int[] A, int K) {
            List<Integer> negList = new ArrayList<>();
            List<Integer> posList = new ArrayList<>();
            int posMin = Integer.MAX_VALUE;
            for (int val : A) {
                if (val < 0) {
                    negList.add(val);
                } else {
                    posList.add(val);
                    if (val < posMin) {
                        posMin = val;
                    }
                }
            }
            Collections.sort(negList);
            int negLen = negList.size();
            int len = Math.min(K, negLen);
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += -negList.get(i);
            }
            for (int i = len; i < negLen; i++) {
                sum += negList.get(i);
            }
            for (int val : posList) {
                sum += val;
            }
            if (K > negList.size() && (K - negLen) % 2 != 0) {
                if (negList.size() == 0) {
                    sum -= 2 * posMin;
                } else {
                    int negMax = -negList.get(negLen - 1);
                    if (negMax < posMin) {
                        sum -= 2 * negMax;
                    } else {
                        sum -= 2 * posMin;
                    }
                }
            }

            return sum;
        }
    }
}
