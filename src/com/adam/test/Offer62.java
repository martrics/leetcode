package com.adam.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 17:02
 * version: 1.0.0
 */
public class Offer62 {
    public static void main(String[] args) {
        int n = 10;
        int m = 17;
        Solution solution = new Solution();
        System.out.println(solution.lastRemaining(n, m));
    }

    static class Solution{
        public int lastRemaining(int n, int m) {
            int last = 0;
            for(int i = 2; i <= n; i++){
                last = (last + m) % i;
            }
            return last;
        }
    }
}
