package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 14:06
 * version: 1.0.0
 */
public class Q541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.reverseStr(s, k));
    }

    static class Solution{
        public String reverseStr(String s, int k) {
            char[] arr = s.toCharArray();
            int n = arr.length;
            int count = n / (k << 1);
            int left = n % (k << 1);
            for(int i = 0; i < count; i++){
                reverse(arr, i * (k << 1), i * (k << 1) + k - 1);
            }

            if(left < k){
                reverse(arr, count * (k << 1), n - 1);
            }else if(left < (k << 1)){
                reverse(arr, count * (k << 1), count * (k << 1) + k - 1);
            }
            return new String(arr);
        }

        private void reverse(char[] arr, int start, int end){
            int i = start;
            int j = end;
            while(i < j){
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            }
        }
    }
}
