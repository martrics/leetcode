package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/28 11:20
 * version: 1.0.0
 */
public class Interview0807 {
    public static void main(String[] args) {
        String S = "qwe";
        Solution solution = new Solution();
        String[] ans = solution.permutation(S);
        for(String str : ans){
            System.out.println(str);
        }
    }

    static class Solution {
        private int index = 0;
        private String[] ans;

        public String[] permutation(String S) {
            int n = S.length();
            if(n == 1){
                return new String[]{S};
            }

            int len = 1;
            for(int i = 1; i <= n; i++){
                len *= i;
            }
            ans = new String[len];
            permutationInternal(0, "", S);
            return ans;
        }

        private void permutationInternal(int cur, String str, String s){
            if(cur == s.length()){
                ans[index++] = str;
                return;
            }
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '#') {
                    permutationInternal(cur + 1, str + s.charAt(i), s.replace(s.charAt(i), '#'));
                }
            }
        }
    }
}
