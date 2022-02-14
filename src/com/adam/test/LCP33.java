package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/22 13:41
 * version: 1.0.0
 */
public class LCP33 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int storeWater(int[] bucket, int[] vat) {
            int max = 0;
            for (int v : vat) {
                max = Math.max(v, max);
            }
            if (max == 0) {
                return 0;
            }
            int n = bucket.length;
            int ans = Integer.MAX_VALUE;
            for (int i = 1; i <= max; i++) {
                int cur = i;
                for (int j = 0; j < n; j++) {
                    int per = (vat[j] + i - 1) / i;
                    cur += Math.max(0, per - bucket[j]);
                }
                ans = Math.min(ans, cur);
            }
            return ans;
        }
    }
}
