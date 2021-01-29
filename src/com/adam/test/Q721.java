package com.adam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/18 9:08
 * version: 1.0.0
 */
public class Q721 {
    public static void main(String[] args) {
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(Arrays.asList("Mary", "mary@mail.com"));

        Solution solution = new Solution();
        List<List<String>> list = solution.accountsMerge(accounts);
        for(List<String> li : list){
            System.out.println(String.join(",", li));
        }
    }

    static class Solution{
        public List<List<String>> accountsMerge(List<List<String>> accounts) {
            List<List<String>> list = new ArrayList<>();
            return list;
        }
    }
}
