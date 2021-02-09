package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/5 9:13
 * version: 1.0.0
 */
public class Q1208 {
    public static void main(String[] args) {
        String s = "krpgjbjjznpzdfy";
        String t = "nxargkbydxmsgby";
        int cost = 14;
        Solution solution = new Solution();
        System.out.println(solution.equalSubstring(s, t, cost));
    }

    static class Solution{
        public int equalSubstring(String s, String t, int maxCost) {
            int n = s.length();
            int[] diff = new int[n];
            for(int i = 0; i < n; i++){
                diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
            }
            int left = 0;
            int right = 0;
            int sum = 0;
            int ans = 0;
            while (right < n) {
                sum += diff[right];
                while (sum > maxCost) {
                    sum -= diff[left++];
                }
                ans = Math.max(ans, right - left + 1);
                right++;
            }
            return ans;
        }
    }
}
