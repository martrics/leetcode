package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/2 17:18
 * version: 1.0.0
 */
public class Q1796 {
    public static void main(String[] args) {
        String s = "ck";
        Solution solution = new Solution();
        System.out.println(solution.secondHighest(s));
    }

    static class Solution{
        public int secondHighest(String s) {
            int[] freq = new int[11];
            if(s.length() < 2){
                return -1;
            }
            for(char c : s.toCharArray()){
                if(c >= '0' && c <= '9'){
                    freq[c - '0']++;
                }
                if(freq[10] > 0 && freq[9] > 0){
                    return 8;
                }
            }
            for(int i = 10; i >= 1; i--){
                if(freq[i] > 0){
                    for(int j = i - 1; j >= 0; j--){
                        if(freq[j] > 0){
                            return j;
                        }
                    }
                }
            }
            return -1;
        }
    }
}
