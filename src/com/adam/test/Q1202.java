package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/11 9:31
 * version: 1.0.0
 */
public class Q1202 {
    public static void main(String[] args) {
        String s = "yhiihxbordwyjybyt";
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(Arrays.asList(9, 1));
        pairs.add(Arrays.asList(5, 11));
        pairs.add(Arrays.asList(9, 7));
        pairs.add(Arrays.asList(2, 7));
        pairs.add(Arrays.asList(14, 16));
        pairs.add(Arrays.asList(6, 16));
        pairs.add(Arrays.asList(0, 5));
        pairs.add(Arrays.asList(12, 9));
        pairs.add(Arrays.asList(6, 5));
        pairs.add(Arrays.asList(9, 10));
        pairs.add(Arrays.asList(4, 7));
        pairs.add(Arrays.asList(3, 2));
        pairs.add(Arrays.asList(10, 1));
        pairs.add(Arrays.asList(3, 15));
        pairs.add(Arrays.asList(12, 4));
        pairs.add(Arrays.asList(10, 10));
        pairs.add(Arrays.asList(15, 12));
        Solution solution = new Solution();
        System.out.println(solution.smallestStringWithSwaps(s, pairs));
    }

    static class Solution{
        private int[] fa;
        private int[] rank;

        public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
            char[] chars = s.toCharArray();
            int n = s.length();
            fa = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++){
                fa[i] = i;
                rank[i] = 1;
            }
            for(List<Integer> pair : pairs){
                merge(pair.get(0), pair.get(1));
            }
            int[] group = new int[n];
            for(int i = 0; i < n; i++){
                group[i] = find(i);
            }
            boolean[] visited = new boolean[n];
            int tmp;
            for(int i = 0; i < n; i++){
                if(!visited[i]){
                    List<Integer> list = new ArrayList<>();
                    int j = i;
                    while (j < n) {
                        if (visited[j]) {
                            j++;
                            continue;
                        }else{
                            break;
                        }
                    }
                    if (j < n) {
                        tmp = group[j];
                        while (j < n) {
                            if (group[j] == tmp) {
                                list.add(j);
                                visited[j] = true;
                            }
                            j++;
                        }
                    }
                    list.sort(Comparator.comparingInt(o -> o));
                    List<Integer> sorted = new ArrayList<>(list);
                    sorted.sort(Comparator.comparingInt(o -> chars[o]));
                    for(int k = 0; k < list.size(); k++){
                        chars[list.get(k)] = s.charAt(sorted.get(k));
                    }
                }
            }
            return String.valueOf(chars);
        }

        private void merge(int i, int j){
            int x = find(i);
            int y = find(j);
            if(rank[x] <= rank[y]){
                fa[x] = y;
            }else{
                fa[y] = x;
            }
            if(rank[x] == rank[y] && x != y){
                rank[y]++;
            }
        }

        private int find(int x){
            if(fa[x] == x){
                return x;
            }else{
                fa[x] = find(fa[x]);
                return fa[x];
            }
        }
    }
}
