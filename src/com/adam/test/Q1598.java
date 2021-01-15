package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 11:55
 * version: 1.0.0
 */
public class Q1598 {
    public static void main(String[] args) {
        String[] logs = new String[]{"d1/", "d2/", "../", "d21/", "./"};
        Solution solution = new Solution();
        System.out.println(solution.minOperations(logs));
    }

    static class Solution {
        public int minOperations(String[] logs) {
            int count = 0;
            for(String log : logs){
                if("../".equals(log)){
                    if(count > 0) {
                        count--;
                    }
                }else if("./".equals(log)){

                }else{
                    count++;
                }
            }
            return count;
        }
    }
}
