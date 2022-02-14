package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/13 15:58
 * version: 1.0.0
 */
public class Q1736 {
    public static void main(String[] args) {
        String time = "0?:3?";
        Solution solution = new Solution();
        System.out.println(solution.maximumTime(time));
    }

    static class Solution{
        public String maximumTime(String time) {
            char[] arr = time.toCharArray();
            if(arr[0] == '?'){
                if(arr[1] == '?'){
                    arr[0] = '2';
                }else if(arr[1] > '3'){
                    arr[0] = '1';
                }else{
                    arr[0] = '2';
                }
            }
            if(arr[1] == '?'){
                if(arr[0] != '2'){
                    arr[1] = '9';
                }else{
                    arr[1] = '3';
                }
            }
            if(arr[3] == '?'){
                arr[3] = '5';
            }
            if(arr[4] == '?'){
                arr[4] = '9';
            }
            return new String(arr);
        }
    }
}
