package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/7 15:08
 * version: 1.0.0
 */
public class Q547 {
    public static void main(String[] args) {
        int[][] isConnected = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Solution solution = new Solution();
        System.out.println(solution.findCircleNum(isConnected));
    }

    static class Solution {
        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length;
            boolean[] isVisited = new boolean[n];
            int count = 0;
            for(int i = 0; i < n; i++){
                if(visit(i, n, isConnected, isVisited)){
                    count++;
                }
            }
            return count;
        }

        private boolean visit(int m, int n, int[][] isConnected, boolean[] isVisited){
            boolean flag = false;
            for(int i = 0; i < n; i++){
                if(!isVisited[i] && isConnected[m][i] == 1){
                    isVisited[i] = true;
                    flag = true;
                    visit(i, n, isConnected, isVisited);
                }
            }
            return flag;
        }
    }
}
