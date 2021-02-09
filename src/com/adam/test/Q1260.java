package com.adam.test;

import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/2 14:24
 * version: 1.0.0
 */
public class Q1260 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        Solution solution = new Solution();
        List<List<Integer>> list = solution.shiftGrid(grid, k);
        for(List<Integer> li : list){
            for(int val : li){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    static class Solution{
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            Queue<Integer> queue = new LinkedList<>();
            int m = grid.length;
            int n = grid[0].length;
            for(int i = m - 1; i >= 0; i--){
                for(int j = n - 1; j >= 0; j--){
                    queue.add(grid[i][j]);
                }
            }
            for(int i = 0; i < k; i++){
                queue.add(queue.poll());
            }
            for(int i = m - 1; i >= 0; i--){
                for(int j = n - 1; j >= 0; j--){
                    grid[i][j] = queue.poll();
                }
            }
            List<List<Integer>> list = new ArrayList<>();
            for(int i = 0; i < m; i++){
                List<Integer> li = new ArrayList<>();
                for(int j = 0; j < n; j++){
                    li.add(grid[i][j]);
                }
                list.add(li);
            }
            return list;
        }
    }
}
