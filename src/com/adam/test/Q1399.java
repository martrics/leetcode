package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/21 15:29
 * version: 1.0.0
 */
public class Q1399 {
    public static void main(String[] args) {
        int n = 1111;
        Solution solution = new Solution();
        System.out.println(solution.countLargestGroup(n));
    }

    static class Solution{
        public int countLargestGroup(int n) {
            int[] arr = new int[37];
            for(int i = 1; i <=n; i++){
                arr[getNumSum(i)]++;
            }
            Arrays.sort(arr);
            int count = 0;
            for(int i = 36; i > 0; i--){
                if(arr[i] != 0){
                    for(int j = i; j > 0; j--){
                        if(arr[j] == arr[i]){
                            count++;
                        }
                    }
                    break;
                }
            }
            return count;
        }

        public int getNumSum(int m){
            if(m == 10000){
                return 1;
            }
            int thousand = m / 1000;
            m = m - thousand * 1000;
            int hundred = m / 100;
            m = m - hundred * 100;
            int ten = m / 10;
            m = m - ten * 10;
            return thousand + hundred + ten + m;
        }
    }
}
