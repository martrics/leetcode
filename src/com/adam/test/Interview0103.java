package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/7 15:16
 * version: 1.0.0
 */
public class Interview0103 {
    public static void main(String[] args) {
        String S = "ds sdfs afs sdfa dfssf asdf             ";
        int length = 27;
        Solution solution = new Solution();
        System.out.println(solution.replaceSpaces(S, length));
    }

    static class Solution{
        public String replaceSpaces(String S, int length) {
            char[] arr = S.toCharArray();
            int i = arr.length - 1;
            for(int j = length - 1; j >= 0; j--){
                if(arr[j] == ' '){
                    arr[i--] = '0';
                    arr[i--] = '2';
                    arr[i--] = '%';
                }else{
                    arr[i--] = arr[j];
                }
            }
            return new String(arr, i + 1, arr.length - 1 - i);
        }
    }
}
