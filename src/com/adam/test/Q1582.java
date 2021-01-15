package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 15:40
 * version: 1.0.0
 */
public class Q1582 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        Solution solution = new Solution();
        System.out.println(solution.numSpecial(mat));
    }

    static class Solution {
        public int numSpecial(int[][] mat) {
            int total = 0;
            int n = mat.length;
            int m = mat[0].length;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(mat[i][j] == 1 && checkOK(i, j, mat)){
                        total++;
                        break;
                    }
                }
            }
            return total;
        }

        private boolean checkOK(int x, int y, int[][] mat){
            int n = mat.length;
            int m = mat[0].length;
            for(int i = 0; i < m; i++){
                if(mat[x][i] != 0 && i != y){
                    return false;
                }
            }
            for(int j = 0; j < n; j++){
                if(mat[j][y] != 0 && j != x){
                    return false;
                }
            }
            return true;
        }
    }
}
