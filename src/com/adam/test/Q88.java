package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 17:40
 * version: 1.0.0
 */
public class Q88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int m = 1;
        int[] nums2 = new int[]{1};
        int n = 0;
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        for(int val : nums1){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n == 0) {
                return;
            }
            int i = m - 1;
            int j = n - 1 ;
            int k = m + n - 1;
            for(; k >= 0; k--){
                if(i >= 0 && j >= 0){
                    if(nums1[i] > nums2[j]){
                        nums1[k] = nums1[i--];
                    }else{
                        nums1[k] = nums2[j--];
                    }
                }else {
                    if (i < 0) {
                        nums1[k] = nums2[j--];
                    }else {
                        nums1[k] = nums1[i--];
                    }
                }
            }
        }
    }
}
