package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 11:48
 * version: 1.0.0
 */
public class Q1491 {
    public static void main(String[] args) {

    }

    static class Solution{
        public double average(int[] salary) {
            Arrays.sort(salary);
            double sum = 0;
            int n = salary.length;
            for(int i = 1; i < n - 1; i++){
                sum += salary[i];
            }
            return sum / (n - 2);
        }
    }
}
