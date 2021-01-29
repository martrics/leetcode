package com.adam.test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/25 15:55
 * version: 1.0.0
 */
public class Q884 {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        Solution solution = new Solution();
        String[] arr = solution.uncommonFromSentences(A, B);
        for(String str : arr){
            System.out.print(str + "\t");
        }
    }

    static class Solution{
        public String[] uncommonFromSentences(String A, String B) {
            List<String> list = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();
            for(String str : A.split(" ")){
                map.merge(str, 1, Integer::sum);
            }
            for(String str : B.split(" ")){
                map.merge(str, 1, Integer::sum);
            }
            return map.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList()).toArray(new String[0]);
        }
    }
}
