package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 17:00
 * version: 1.0.0
 */
public class Q1374 {
    public static void main(String[] args) {
        int n = 4;
        Solution solution = new Solution();
        System.out.print(solution.generateTheString(n));
    }

    static class Solution{
        public String generateTheString(int n) {
            StringBuilder stringBuilder = new StringBuilder();
            if(n % 2 == 0){
                for(int i = 0; i < n-1; i++){
                    stringBuilder.append("a");
                }
                stringBuilder.append("b");
            }else{
                for(int i = 0; i < n; i++){
                    stringBuilder.append("a");
                }
            }
            return stringBuilder.toString();
        }
    }
}
