package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 13:54
 * version: 1.0.0
 */
public class Q944 {
    public static void main(String[] args) {
        String[] A = new String[]{"a", "b"};
        Solution solution = new Solution();
        System.out.println(solution.minDeletionSize(A));
    }

    static class Solution{
        public int minDeletionSize(String[] A) {
            int count = 0;
            int n = A[0].length();
            for(int i = 0; i < n; i++){
                for(int j = 0; j < A.length - 1; j++){
                    if(A[j].charAt(i) > A[j+1].charAt(i)){
                        count++;
                        break;
                    }
                }
            }
            return count;
        }
    }
}
