package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/2 16:46
 * version: 1.0.0
 */
public class Q405 {
    public static void main(String[] args) {
        int num = -1;
        Solution solution = new Solution();
        System.out.println(solution.toHex(num));
    }

    static class Solution{
        public String toHex(int num) {
            if(num == 0){
                return "0";
            }
            String hex = "0123456789abcdef";
            StringBuilder builder = new StringBuilder();
            do{
                builder.append(hex.charAt(num & 0xf));
                num = num >>> 4;
            } while(num != 0);
            return builder.reverse().toString();
        }
    }
}
