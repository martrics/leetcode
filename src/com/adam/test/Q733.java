package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 15:40
 * version: 1.0.0
 */
public class Q733 {
    public static void main(String[] args) {
        int[][] image = new int[][]{{0, 0, 0}, {0, 1, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;
    }

    static class Solution{
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int m = image.length;
            int n = image[0].length;
            int color = image[sr][sc];
            image[sr][sc] = newColor;
            if(color == newColor){
                return image;
            }
            if(sr != 0 && image[sr - 1][sc] == color){
                floodFill(image, sr - 1, sc, newColor);
            }
            if(sr != m - 1 && image[sr + 1][sc] == color){
                floodFill(image, sr + 1, sc, newColor);
            }
            if(sc != 0 && image[sr][sc - 1] == color){
                floodFill(image, sr, sc - 1, newColor);
            }
            if(sc != n - 1 && image[sr][sc + 1] == color){
                floodFill(image, sr, sc + 1, newColor);
            }
            return image;
        }
    }
}
