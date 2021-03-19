package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/23 18:02
 * version: 1.0.0
 */
public class Q1275 {
    public static void main(String[] args) {

    }

    static class Solution{
        public String tictactoe(int[][] moves) {
            char arr[][] = new char[3][3];
            for(int i = 0; i < moves.length; i++){
                if((i & 0x1) == 0){
                    arr[moves[i][0]][moves[i][1]] = 'X';
                    if (checkWin(arr, 'X')){
                        return "A";
                    }
                }
                else{
                    arr[moves[i][0]][moves[i][1]] = 'O';
                    if (checkWin(arr, 'O')){
                        return "B";
                    }
                }
            }

            if(moves.length == 9){
                return "Draw";
            }

            return "Pending";
        }

        private boolean checkWin(char[][] arr, char c){
            return arr[0][0] == c && arr[1][1] == c && arr[2][2] == c ||
                    arr[2][0] == c && arr[1][1] == c && arr[0][2] == c ||
                    arr[0][0] == c && arr[1][0] == c && arr[2][0] == c ||
                    arr[0][1] == c && arr[1][1] == c && arr[2][1] == c ||
                    arr[0][2] == c && arr[1][2] == c && arr[2][2] == c ||
                    arr[0][0] == c && arr[0][1] == c && arr[0][2] == c ||
                    arr[1][0] == c && arr[1][1] == c && arr[1][2] == c ||
                    arr[2][0] == c && arr[2][1] == c && arr[2][2] == c;
        }
    }
}
