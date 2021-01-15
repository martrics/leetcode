package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/12 18:31
 * version: 1.0.0
 */
public class Q999 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}};
        Solution solution = new Solution();
        System.out.println(solution.numRookCaptures(board));
    }

    static class Solution{
        public int numRookCaptures(char[][] board) {
            int count = 0;
            int m = 0;
            int n = 0;
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if(board[i][j] == 'R'){
                        m = i;
                        n = j;
                        break;
                    }
                }
            }
            for(int i = m - 1; i >= 0; i--){
                if(board[i][n] == 'B'){
                    break;
                }
                if(board[i][n] == 'p'){
                    count++;
                    break;
                }
            }
            for(int i = m + 1; i < 8; i++){
                if(board[i][n] == 'B'){
                    break;
                }
                if(board[i][n] == 'p'){
                    count++;
                    break;
                }
            }
            for(int j = n - 1; j >= 0; j--){
                if(board[m][j] == 'B'){
                    break;
                }
                if(board[m][j] == 'p'){
                    count++;
                    break;
                }
            }
            for(int j = n + 1; j < 8; j++){
                if(board[m][j] == 'B'){
                    break;
                }
                if(board[m][j] == 'p'){
                    count++;
                    break;
                }
            }
            return count;
        }
    }
}
