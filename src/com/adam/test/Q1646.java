package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/9 18:52
 * version: 1.0.0
 */
public class Q1646 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int getMaximumGenerated(int n) {
            if(n < 2){
                return n;
            }
            int[] arr = new int[n + 1];
            int ans = 0;
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i <= n; i++){
                if(i % 2 == 0){
                    arr[i] = arr[i / 2];
                }else{
                    arr[i] = arr[(i - 1) / 2] + arr[(i - 1) / 2 + 1];
                }
                ans = Math.max(ans, arr[i]);
            }
            return ans;
        }
    }
}
