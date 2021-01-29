package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 13:38
 * version: 1.0.0
 */
public class Q696 {
    public static void main(String[] args) {
        String s = "00110011";
        Solution solution = new Solution();
        System.out.println(solution.countBinarySubstrings(s));
    }

    static class Solution {
        public int countBinarySubstrings(String s) {
            if (s == null || s.length() < 2) {
                return 0;
            }
            int count = 0;
            char[] arr = s.toCharArray();
            int n = arr.length;
            for (int i = 0; i < n;) {
                int k = 0;
                int kMax = 0;
                int j = i;
                while (j < n && arr[j] == arr[i]) {
                    k++;
                    kMax = k;
                    j++;
                }
                while (j < n && (arr[j] - '0') == ('1' - arr[i])) {
                    k--;
                    if(k == 0){
                        break;
                    }
                    j++;
                }
                if (k == 0) {
                    count+= kMax;
                    i += kMax;
                }else{
                    i++;
                }
            }
            return count;
        }
    }
}
