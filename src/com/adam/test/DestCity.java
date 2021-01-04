package com.adam.test;

import java.util.*;

public class DestCity {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("B", "C");
        List<String> list2 = Arrays.asList("D", "B");
        List<String> list3 = Arrays.asList("C", "A");
        List<List<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        Solution solution = new Solution();
        System.out.println(solution.destCity(list));
    }

    static class Solution {
        public String destCity(List<List<String>> paths) {
            Set<String> set = new HashSet<>();
            for(List<String> path : paths){
                set.add(path.get(0));
            }
            for(List<String> path: paths){
                if(!set.contains(path.get(1))){
                    return path.get(1);
                }
            }
            return "";
        }
    }
}
