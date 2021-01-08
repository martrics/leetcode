package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/7 11:20
 * version: 1.0.0
 */
public class Q893 {
    public static void main(String[] args) {
        String[] A = new String[]{"abcd","cdab","cbad","xyzz","zzxy","zzyx"};
        Solution solution = new Solution();
        System.out.println(solution.numSpecialEquivGroups(A));
    }

    static class Solution {
        public int numSpecialEquivGroups(String[] A) {
            String[] sorted = new String[A.length];
            for (int i = 0; i < A.length; i++) {
                sorted[i] = sortStr(A[i]);
            }
            Arrays.sort(sorted);
            int total = 0;
            int pre = 0;
            int next = 0;
            while(pre <  sorted.length){
                while(next < sorted.length && sorted[next].equals(sorted[pre])){
                    next++;
                }
                if(next != pre){
                    total++;
                }
                pre = next;
            }
            return total;
        }

        private String sortStr(String str) {
            char[] sorted = new char[str.length()];
            int index = 0;
            int oddIndex = 0;
            for (int i = 0; i < str.length(); i += 2) {
                sorted[index++] = str.charAt(i);
            }
            oddIndex = index;
            Arrays.sort(sorted, 0, oddIndex);
            for (int i = 1; i < str.length(); i += 2) {
                sorted[index++] = str.charAt(i);
            }
            Arrays.sort(sorted, oddIndex, sorted.length);
            return String.valueOf(sorted);
        }
    }
}
