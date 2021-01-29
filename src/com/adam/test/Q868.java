package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 15:16
 * version: 1.0.0
 */
public class Q868 {
    public static void main(String[] args) {
        int n = 8;
        Solution solution = new Solution();
        System.out.println(solution.binaryGap(n));
    }

    static class Solution{
        public int binaryGap(int n) {
            int ans = 0;
            while((n & 0x1) == 0){
                n = n >> 1;
            }
            while(n != 0){
                int count = 0;
                int oneCount = 0;
                while(n != 0 && (n & 0x1) == 1){
                    n = n >> 1;
                    oneCount++;
                }
                if(oneCount > 1){
                    ans = Math.max(ans, 1);
                }
                while(n != 0 && (n & 0x1) == 0){
                    count++;
                    n = n >> 1;
                }
                if(n != 0){
                    ans = Math.max(ans, count + 1);
                }
            }
            return ans;
        }
    }
}
