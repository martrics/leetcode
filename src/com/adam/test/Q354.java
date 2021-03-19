package com.adam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/4 10:13
 * version: 1.0.0
 */
public class Q354 {
    public static void main(String[] args) {
        int[][] envelopes = new int[][]{{1, 3}, {3, 5}, {6, 7}, {6, 8}, {8, 4}, {9, 5}};
        Solution solution = new Solution();
        System.out.println(solution.maxEnvelopes(envelopes));
    }

    static class Solution {
        public int maxEnvelopes(int[][] envelopes) {
            int n = envelopes.length;
            if (n <= 1) {
                return n;
            }
            Arrays.sort(envelopes, (o1, o2) -> {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                } else {
                    return o1[0] - o2[0];
                }
            });

            List<Integer> f = new ArrayList<>();
            f.add(envelopes[0][1]);
            for (int i = 1; i < n; ++i) {
                int num = envelopes[i][1];
                if (num > f.get(f.size() - 1)) {
                    f.add(num);
                } else {
                    int index = binarySearch(f, num);
                    f.set(index, num);
                }
            }
            return f.size();
        }

        private int binarySearch(List<Integer> f, int target) {
            int low = 0, high = f.size() - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if (f.get(mid) < target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }
}
