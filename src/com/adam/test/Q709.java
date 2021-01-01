package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/28 22:19
 * version: 1.0.0
 */
public class Q709 {
    public static void main(String[] args) {
        String str = "LOVELY";
        Solution solution = new Solution();
        System.out.println(solution.toLowerCase(str));
    }

    static class Solution{
        public String toLowerCase(String str) {
            char[] chars = str.toCharArray();
            for(int i = 0; i < chars.length; i++){
                if(chars[i] >= 'A' && chars[i] <= 'Z'){
                    chars[i] = (char)(chars[i] - 'A' + 'a');
                }
            }
            return new String(chars);
        }
    }
}
