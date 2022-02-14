package com.adam.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/9 16:20
 * version: 1.0.0
 */
public class Q1346 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean checkIfExist(int[] arr) {
            int n = arr.length;
            if(n < 2){
                return false;
            }
            Set<Integer> set = new HashSet<>();
            for(int val : arr){
                if(set.contains(val * 2)){
                    return true;
                }
                if(val % 2 == 0 && set.contains(val / 2)){
                    return true;
                }
                set.add(val);
            }
            return false;
        }
    }
}
