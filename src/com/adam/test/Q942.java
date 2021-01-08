package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 15:38
 * version: 1.0.0
 */
public class Q942 {
    public static void main(String[] args) {
        String s = "DDI";
        Solution solution = new Solution();
        int[] result = solution.diStringMatch(s);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] diStringMatch(String S) {
            char[] arr = S.toCharArray();
            int n = arr.length;
            int[] result = new int[n + 1];
            int max = n;
            int min = 0;
            for(int i = n - 1; i >= 0; i--){
                if(arr[i] == 'D'){
                    result[i + 1] = min;
                    min++;
                }else{
                    result[i + 1] = max;
                    max--;
                }
            }
            result[0] = max;
            return result;
        }
    }
}
