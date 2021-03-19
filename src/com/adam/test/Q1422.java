package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/23 17:42
 * version: 1.0.0
 */
public class Q1422 {
    public static void main(String[] args) {
        String s = "00111";
        Solution solution = new Solution();
        System.out.println(solution.maxScore(s));
    }

    static class Solution{
        public int maxScore(String s) {
            int n = s.length();
            if(n <= 1){
                return 0;
            }
            int left = s.charAt(0) == '0'? 1 : 0;
            int right = 0;
            for(int i = 1; i < n; i++){
                right += s.charAt(i) == '1'? 1 : 0;
            }
            int ans = left + right;
            for(int i = 1; i < n - 1; i++){
                if(s.charAt(i) == '0'){
                    left++;
                }else{
                    right--;
                }
                ans = Math.max(ans, left + right);
            }
            return ans;
        }
    }
}
