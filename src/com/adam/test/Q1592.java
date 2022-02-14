package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/6 19:22
 * version: 1.0.0
 */
public class Q1592 {
    public static void main(String[] args) {
        String text = "a";
        Solution solution = new Solution();
        System.out.println(solution.reorderSpaces(text));
    }

    static class Solution{
        public String reorderSpaces(String text) {
            int n = text.length();
            if(n == 1){
                return text;
            }
            StringBuilder builder = new StringBuilder();
            List<String> list = new ArrayList<>();
            int spaceCount = 0;
            for(int i = 0; i < n;){
                if(text.charAt(i) == ' '){
                    spaceCount++;
                    i++;
                }else{
                    int j = i;
                    while(j < n && text.charAt(j) != ' '){
                        j++;
                    }
                    list.add(text.substring(i, j));
                    i = j;
                }
            }
            if(spaceCount == n || spaceCount == 0){
                return text;
            }

            int m = list.size();
            if(m == 1){
                builder.append(list.get(0));
                for(int i = 0; i < spaceCount; i++){
                    builder.append(" ");
                }
                return builder.toString();
            }
            int avgSpace = spaceCount / (m - 1);
            builder.append(list.get(0));
            for(int i = 1;i < m; i++){
                for(int j = 0; j < avgSpace; j++){
                    builder.append(" ");
                }
                builder.append(list.get(i));
            }
            while(builder.length() < n){
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}
