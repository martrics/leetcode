package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 9:13
 * version: 1.0.0
 */
public class Q978 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 4, 2, 10, 7, 8, 8, 1, 9};
        Solution solution = new Solution();
        System.out.println(solution.maxTurbulenceSize(arr));
    }

    static class Solution {
        public int maxTurbulenceSize(int[] arr) {
            int n = arr.length;
            int max = 0;
            int left = 0;
            int right = 0;
            if(n == 1){
                return n;
            }
            while(right < n - 1){
                if(left == right){
                    if(arr[left] == arr[left + 1]){
                        left++;
                    }
                    right++;
                }else{
                    if(arr[right] > arr[right - 1] && arr[right] > arr[right + 1]){
                        right++;
                    }else if(arr[right] < arr[right - 1] && arr[right] < arr[right + 1]){
                        right++;
                    }else{
                        left = right;
                    }
                }
                max = Math.max(max, right - left + 1);
            }
            return max;
        }
    }
}
