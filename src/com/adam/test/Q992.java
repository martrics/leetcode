package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 9:16
 * version: 1.0.0
 */
public class Q992 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 1, 3, 4};
        int K = 3;
        Solution solution = new Solution();
        System.out.println(solution.subArrayWithMostKDistinct(A, K));
        System.out.println(solution.subarraysWithKDistinct(A, K));
    }

    static class Solution {
        public int subarraysWithKDistinct(int[] A, int K) {
            if(A.length < K){
                return 0;
            }
            return subArrayWithMostKDistinct(A, K) - subArrayWithMostKDistinct(A, K - 1);
        }

        private int subArrayWithMostKDistinct(int[] A, int K){
            int n = A.length;
            int[] freq = new int[n + 1];
            int left = 0;
            int right = 0;
            int count = 0;
            int ans = 0;
            while(right < n){
                if(freq[A[right]] == 0){
                    count++;
                }
                freq[A[right]]++;
                right++;

                while(count > K){
                    freq[A[left]]--;
                    if(freq[A[left]] == 0){
                        count--;
                    }
                    left++;
                }
                ans += right - left;
            }
            return ans;
        }
    }
}
