package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/19 16:17
 * version: 1.0.0
 */
public class Q914 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean hasGroupsSizeX(int[] deck) {
            int n = deck.length;
            if(n < 2){
                return false;
            }
            int x = 0;
            int[] count = new int[10000];
            for(int val : deck){
                count[val]++;
            }
            for(int i = 0; i < 10000; i++){
                if(count[i] != 0){
                    x = gcd(x, count[i]);
                    if(x == 1){
                        return false;
                    }
                }
            }
            return x >= 2;
        }

        private int gcd(int a, int b) {
            return b == 0? a : gcd(b, a % b);
        }
    }
}
