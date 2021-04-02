package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 17:26
 * version: 1.0.0
 */
public class Q504 {
    public static void main(String[] args) {
        int num = -7;
        Solution solution = new Solution();
        System.out.println(solution.convertToBase7(num));
    }

    static class Solution{
        public String convertToBase7(int num) {
            String sign = "";
            if(num < 0){
                sign = "-";
                num = -num;
            }
            if(num == 0){
                return "0";
            }
            StringBuilder builder = new StringBuilder();
            while(num != 0){
                builder.append(num % 7);
                num = num / 7;
            }
            return sign + builder.reverse().toString();
        }
    }
}
