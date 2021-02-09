package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 11:11
 * version: 1.0.0
 */
public class Q38 {
    public static void main(String[] args) {
        int n = 4;
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(n));
    }

    static class Solution{
        public String countAndSay(int n) {
            if(n == 1){
                return "1";
            }
            char[] arr = countAndSay(n - 1).toCharArray();
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < arr.length;){
                int j = i;
                int count = 0;
                while(j < arr.length && arr[j] == arr[i]){
                    count++;
                    j++;
                }
                builder.append(count).append(arr[i]);
                i = j;
            }
            return builder.toString();
        }
    }
}
