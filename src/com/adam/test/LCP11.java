package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/21 16:30
 * version: 1.0.0
 */
public class LCP11 {
    public static void main(String[] args) {
        int[] scores = new int[]{1, 1, 2};

    }

    static class Solution {
        public int expectNumber(int[] scores) {
            return (int)Arrays.stream(scores).distinct().count();
        }
    }
}
