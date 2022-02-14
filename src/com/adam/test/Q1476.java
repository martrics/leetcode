package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/25 9:39
 * version: 1.0.0
 */
public class Q1476 {
    public static void main(String[] args) {
        int[][] rectangles = new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        SubrectangleQueries queries = new SubrectangleQueries(rectangles);
        System.out.println(queries.getValue(0, 0));
    }

    static class SubrectangleQueries {
        private int[] rowStart = new int[501];
        private int[] rowEnd = new int[501];
        private int[] colStart = new int[501];
        private int[] colEnd = new int[501];
        private int[][] rectangle;
        private int[] updValue = new int[501];
        private int i = 0;

        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            rowStart[i] = row1;
            rowEnd[i] = row2;
            colStart[i] = col1;
            colEnd[i] = col2;
            updValue[i] = newValue;
            i++;
        }

        public int getValue(int row, int col) {
            for(int j = i - 1; j >= 0; j--) {
                if (row >= rowStart[j] && row <= rowEnd[j] && col >= colStart[j] && col <= colEnd[j]) {
                    return updValue[j];
                }
            }
            return rectangle[row][col];
        }
    }
}
