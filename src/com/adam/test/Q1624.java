package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/28 9:38
 * version: 1.0.0
 */
public class Q1624 {
    public static void main(String[] args) {
        String s = "abcd";
        Solution solution = new Solution();
        System.out.println(solution.maxLengthBetweenEqualCharacters(s));
    }

    static class Solution{
        public int maxLengthBetweenEqualCharacters(String s) {
            int ans = 0;
            int[] arr = new int[26];
            for(int i = 0; i < 26; i++){
                arr[i] = -1;
            }
            for(int i = 0; i < s.length(); i++){
                int index = s.charAt(i) - 'a';
                if(arr[index] == -1){
                    arr[index] = i;
                }else{
                    ans = Math.max(ans, (i - arr[index]));
                }
            }
            return ans - 1;
        }
    }
}
