package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/27 21:47
 * version: 1.0.0
 */
public class Q1175 {
    public static void main(String[] args) {
        int n = 2;
        Solution solution = new Solution();
        System.out.print(solution.numPrimeArrangements(n));
    }

    static class Solution{
        private final int mod = 1000000007;

        public int numPrimeArrangements(int n) {
            if(n == 1){
                return 1;
            }
            int nPrime = 0;
            for(int i = 1; i <= n; i++){
                if(isPrime(i)){
                    nPrime++;
                }
            }
            long ans = 1;
            for(int i = 2; i <= nPrime; i++){
                ans = (ans % mod) * i;
            }
            for(int i = 2; i <= n - nPrime; i++){
                ans = (ans % mod) * i;
            }
            ans = ans % mod;
            return (int)ans;
        }

        private boolean isPrime(int n){
            if(n == 1){
                return false;
            }
            if(n == 2){
                return true;
            }
            int i = 2;
            while(i * i <= n){
                if(n % i == 0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}
