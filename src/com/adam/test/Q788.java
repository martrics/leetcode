package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/1 12:20
 * version: 1.0.0
 */
public class Q788 {
    public static void main(String[] args) {
        int N = 10;
        Solution solution = new Solution();
        System.out.println(solution.rotatedDigits(N));
    }

    static class Solution{
        public int rotatedDigits(int N) {
            int count = 0;
            for(int i = 1; i <= N; i++){
                char[] arr = String.valueOf(i).toCharArray();
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] == '2'){
                        arr[j] = '5';
                        continue;
                    }
                    if(arr[j] == '5'){
                        arr[j] = '2';
                        continue;
                    }
                    if(arr[j] == '6'){
                        arr[j] = '9';
                        continue;
                    }
                    if(arr[j] == '9'){
                        arr[j] = '6';
                        continue;
                    }
                }
                String str = new String(arr);
                str = str.replaceAll("3", "A");
                str = str.replaceAll("4", "B");
                str = str.replaceAll("7", "C");
                if(!String.valueOf(i).equals(str) && !str.contains("A") && !str.contains("B") && !str.contains("C")) {
                    count++;
                }
            }
            return count;
        }
    }
}
