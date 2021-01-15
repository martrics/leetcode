package com.adam.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/13 16:58
 * version: 1.0.0
 */
public class Q762 {
    public static void main(String[] args) {
        int L = 6;
        int R = 10;
        Solution solution = new Solution();
        System.out.println(solution.countPrimeSetBits(L, R));
    }

    static class Solution{
        public int countPrimeSetBits(int L, int R) {
            int total = 0;
            Set<Integer> set = new HashSet(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31));
            for(int i = L; i <= R; i++){
                int num = numberOfOne(i);
                if(set.contains(num)){
                    total++;
                }
            }
            return total;
        }

        private int numberOfOne(int num){
            int count = 0;
            while(num != 0){
                num = num & (num - 1);
                count++;
            }
            return count;
        }
    }
}
