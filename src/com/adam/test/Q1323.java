package com.adam.test;

public class Q1323 {
    public static void main(String[] args) {
        int num = 9669;
        Solution solution = new Solution();
        System.out.print(solution.maximum69Number(num));
    }

    static class Solution{
        public int maximum69Number (int num) {
            String str = String.valueOf(num);
            char[] chars = str.toCharArray();
            for(int i = 0; i < chars.length; i++){
                if(chars[i] == '6'){
                    chars[i] = '9';
                    break;
                }
            }
            return Integer.parseInt(new String(chars));
        }
    }
}
