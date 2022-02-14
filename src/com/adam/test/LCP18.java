package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/22 17:32
 * version: 1.0.0
 */
public class LCP18 {
    public static void main(String[] args) {
        int[] staple = new int[]{2,1,1};
        int[] drinks = new int[]{8,9,5,1};
        int x = 9;
        Solution solution = new Solution();
        System.out.println(solution.breakfastNumber(staple, drinks, x));
    }

    static class Solution{
        public int breakfastNumber(int[] staple, int[] drinks, int x) {
            Arrays.sort(staple);
            Arrays.sort(drinks);
            int n = drinks.length;
            int j = n - 1;
            int ans = 0;
            for (int k : staple) {
                while (j >= 0 && k + drinks[j] > x) {
                    j--;
                }
                if (j != 0) {
                    ans += j + 1;
                    ans = ans % 1000000007;
                } else {
                    if (k + drinks[j] <= x) {
                        ans += 1;
                        ans = ans % 1000000007;
                    }
                }
            }
            return ans;
        }
    }
}
