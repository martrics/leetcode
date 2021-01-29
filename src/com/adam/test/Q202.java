package com.adam.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 17:15
 * version: 1.0.0
 */
public class Q202 {
    public static void main(String[] args) {
        int n = 19;
        Solution solution = new Solution();
        System.out.println(solution.isHappy(n));
    }

    static class Solution{
        private static Set<Integer> cycleMembers = new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));

        public boolean isHappy(int n) {
            while(true){
                if(n == 1){
                    return true;
                }
                if(cycleMembers.contains(n)){
                    return false;
                }
                int next = 0;
                while(n != 0){
                    next += (n % 10) * (n % 10);
                    n = n / 10;
                }
                n = next;
            }
        }
    }
}
