package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/22 11:12
 * version: 1.0.0
 */
public class LCP22 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.paintingPlan(6, 18));
    }

    static class Solution {
        public int paintingPlan(int n, int k) {
            if(k == 0 || k == n * n){
                return 1;
            }
            int ans = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(n * (i + j) - i * j == k){
                        ans += combine(n, i) * combine(n, j);
                    }
                }
            }
            return ans;
        }

        private int combine(int n, int k){
            if(k == 0){
                return 1;
            }
            return fac(n) / fac(k) / fac(n - k);
        }

        private int fac(int k){
            int ans = 1;
            for(int i = 1; i <= k; i++){
                ans *= i;
            }
            return ans;
        }
    }
}
