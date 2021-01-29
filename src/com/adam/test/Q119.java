package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/28 14:33
 * version: 1.0.0
 */
public class Q119 {
    public static void main(String[] args) {
        int rowIndex = 0;
        Solution solution = new Solution();
        List<Integer> list = solution.getRow(rowIndex);
        for(int val : list){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public List<Integer> getRow(int rowIndex) {
            rowIndex = rowIndex + 1;
            int[] arr = new int[rowIndex];
            for(int i = 0; i < rowIndex; i++){
                arr[i] = 1;
                for(int j = i - 1; j > 0; j--){
                    arr[j] = arr[j - 1] + arr[j];
                }
            }
            List<Integer> list = new ArrayList<>();
            for(int val : arr){
                list.add(val);
            }
            return list;
        }
    }
}
