package com.adam.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/7 14:06
 * version: 1.0.0
 */
public class Q937 {
    public static void main(String[] args) {
        String[] logs = new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        Solution solution = new Solution();
        String[] ordered = solution.reorderLogFiles(logs);
        for(String str : ordered){
            System.out.println(str);
        }
    }

    static class Solution {
        public String[] reorderLogFiles(String[] logs) {
            int n = logs.length;
            String[] ordered = new String[n];
            int j = n - 1;
            int k = 0;
            for(int i = n - 1; i >= 0; i--){
                String str = logs[i];
                str = str.substring(str.indexOf(" ") + 1);
                if(str.charAt(0) >= '0' && str.charAt(0) <= '9'){
                    ordered[j] = logs[i];
                    j--;
                }else{
                    ordered[k] = logs[i];
                    k++;
                }
            }
            Arrays.sort(ordered, 0, k, (o1, o2) -> {
                String id1 = o1.substring(0, o1.indexOf(" "));
                String id2 = o2.substring(0, o2.indexOf(" "));
                o1 = o1.substring(o1.indexOf(" ") + 1);
                o2 = o2.substring(o2.indexOf(" ") + 1);
                if(o1.equals(o2)){
                    return id1.compareTo(id2);
                }else{
                    return o1.compareTo(o2);
                }
            });
            return ordered;
        }
    }
}
