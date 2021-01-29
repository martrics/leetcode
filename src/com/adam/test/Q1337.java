package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/22 11:34
 * version: 1.0.0
 */
public class Q1337 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int[] kWeakestRows(int[][] mat, int k) {
            int n = mat.length;
            int m = mat[0].length;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                int soldier = 0;
                for(int j = 0; j < m; j++){
                    if(mat[i][j] == 0){
                        break;
                    }
                    soldier++;
                }
                arr[i] = soldier * 100 + i;
            }
            Arrays.sort(arr);
            int[] result = new int[k];
            for(int i = 0; i < k; i++){
                result[i] = arr[i] % 100;
            }
            return result;
        }
    }
}
