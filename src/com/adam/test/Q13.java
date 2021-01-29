package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 11:14
 * version: 1.0.0
 */
public class Q13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        Solution solution = new Solution();
        System.out.println(solution.romanToInt(s));
    }

    static class Solution{
        public int romanToInt(String s) {
            int ans = 0;
            if(s == null || s.length() == 0){
                return ans;
            }
            char[] arr = s.toCharArray();
            int n = arr.length;
            for(int i = 0; i < n; i++){
                if(arr[i] == 'M'){
                    ans += 1000;
                    continue;
                }
                if(arr[i] == 'C' && i != n -1  && arr[i + 1] == 'M'){
                    ans += 900;
                    i++;
                    continue;
                }
                if(arr[i] == 'D'){
                    ans += 500;
                    continue;
                }
                if(arr[i] == 'C' && i != n -1 && arr[i + 1] == 'D'){
                    ans += 400;
                    i++;
                    continue;
                }
                if(arr[i] == 'C'){
                    ans += 100;
                    continue;
                }
                if(arr[i] == 'X' && i != n - 1 && arr[i + 1] == 'C'){
                    ans += 90;
                    i++;
                    continue;
                }
                if(arr[i] == 'L'){
                    ans += 50;
                    continue;
                }
                if(arr[i] == 'X' && i != n - 1 && arr[i + 1] == 'L'){
                    ans += 40;
                    i++;
                    continue;
                }
                if(arr[i] == 'X'){
                    ans += 10;
                    continue;
                }
                if(arr[i] == 'I' && i != n -1 && arr[i + 1] == 'X'){
                    ans += 9;
                    i++;
                    continue;
                }
                if(arr[i] == 'V'){
                    ans += 5;
                    continue;
                }
                if(arr[i] == 'I' && i != n -1 && arr[i + 1] == 'V'){
                    ans += 4;
                    i++;
                    continue;
                }
                if(arr[i] == 'I'){
                    ans += 1;
                    continue;
                }
            }
            return ans;
        }
    }
}
