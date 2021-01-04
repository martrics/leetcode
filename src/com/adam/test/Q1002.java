package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/31 17:11
 * version: 1.0.0
 */
public class Q1002 {
    public static void main(String[] args) {
        String[] A = new String[]{"cool","lock","cook"};
        Solution solution = new Solution();
        List<String> result = solution.commonChars(A);
        for(String str : result){
            System.out.print(str + "\t");
        }
    }

    static class Solution{
        public List<String> commonChars(String[] A) {
            List<String> result = new ArrayList<>();
            if(A.length == 0){
                return result;
            }
            String str = A[0];
            for(char c : str.toCharArray()){
                boolean flag = true;
                for(String string : A){
                    if(!string.contains(c + "")){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    result.add(c + "");
                }
            }
            return result;
        }
    }
}
