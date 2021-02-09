package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/1 12:07
 * version: 1.0.0
 */
public class Q824 {
    public static void main(String[] args) {
        String S = "I speak Goat Latin";
        Solution solution = new Solution();
        System.out.println(solution.toGoatLatin(S));
    }

    static class Solution{
        public String toGoatLatin(String S) {
            List<String> list = new ArrayList<>();
            String[] arr = S.split(" ");
            for(int i = 0; i < arr.length; i++){
                String str = arr[i];
                char c = str.charAt(0);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    str = str + "ma";
                }else{
                    str = str.substring(1) + c + "ma";
                }
                for(int j = 0; j < i + 1; j++){
                    str = str + "a";
                }
                list.add(str);
            }
            return String.join(" ", list);
        }
    }
}
