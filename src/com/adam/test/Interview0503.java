package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/18 17:36
 * version: 1.0.0
 */
public class Interview0503 {
    public static void main(String[] args) {
        int num = -1;
        Solution solution = new Solution();
        System.out.println(solution.reverseBits(num));
    }

    static class Solution {
        public int reverseBits(int num) {
            int mask = 0;
            int ans = 0;
            if(num == -1){
                return 32;
            }
            for(int i = 0; i < 32; i++){
                mask = 1 << i;
                if((num & mask) == 0){
                    int val = 1;
                    int pre = mask << 1;
                    int after = mask >>> 1;
                    while(after > 0 && ((num & after) != 0)){
                        val++;
                        after = after >>> 1;
                    }
                    while(pre != 0 && ((pre & num) != 0)){
                        val++;
                        pre = pre << 1;
                    }
                    ans = Math.max(ans, val);
                }
            }
            return ans;
        }
    }
}
