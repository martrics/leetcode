package com.adam.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/22 10:06
 * version: 1.0.0
 */
public class Q1496 {
    public static void main(String[] args) {
        String s = "NNSWWEWSSESSWENNW";
        Solution solution = new Solution();
        System.out.println(solution.isPathCrossing(s));
    }

    static class Solution{
        public boolean isPathCrossing(String path) {
            int x = 0;
            int y = 0;
            Map<String, Boolean> map = new HashMap<>();
            map.put("0-0", true);
            for(char c : path.toCharArray()){
                if(c == 'N'){
                    x++;
                }else if(c == 'S'){
                    x--;
                }else if(c == 'E'){
                    y++;
                }else{
                    y--;
                }
                Boolean visited = map.get(x + "-" + y);
                if(visited == null){
                    map.put(x + "-" + y, true);
                }else{
                    return true;
                }
            }
            return false;
        }
    }
}
