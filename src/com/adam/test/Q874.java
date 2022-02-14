package com.adam.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/12 19:08
 * version: 1.0.0
 */
public class Q874 {
    public static void main(String[] args) {
        int[] commands = new int[]{4, -1, 4, -2, 4};
        int[][] obstacles = new int[][]{{2, 4}};
        Solution solution = new Solution();
        System.out.println(solution.robotSim(commands, obstacles));
    }

    static class Solution {
        public int robotSim(int[] commands, int[][] obstacles) {
            Set<Point> set = new HashSet<>();
            for (int[] obstacle : obstacles) {
                set.add(new Point(obstacle[0], obstacle[1]));
            }
            int x = 0;
            int y = 0;
            int orientation = 0;
            int ans = 0;
            for (int val : commands) {
                if (val == -2) {
                    orientation -= 90;
                } else if (val == -1) {
                    orientation += 90;
                } else {
                    while (orientation < 0) {
                        orientation += 360;
                    }
                    while (orientation > 360) {
                        orientation -= 360;
                    }
                    if (orientation == 0) {
                        for (int i = 0; i < val; i++) {
                            if (set.contains(new Point(x, y + 1))) {
                                break;
                            } else {
                                y += 1;
                                ans = Math.max(ans, x * x + y * y);
                            }
                        }
                    } else if (orientation == 90) {
                        for (int i = 0; i < val; i++) {
                            if (set.contains(new Point(x + 1, y))) {
                                break;
                            } else {
                                x += 1;
                                ans = Math.max(ans, x * x + y * y);
                            }
                        }
                    } else if (orientation == 180) {
                        for (int i = 0; i < val; i++) {
                            if (set.contains(new Point(x, y - 1))) {
                                break;
                            } else {
                                y -= 1;
                                ans = Math.max(ans, x * x + y * y);
                            }
                        }
                    } else {
                        for (int i = 0; i < val; i++) {
                            if (set.contains(new Point(x - 1, y))) {
                                break;
                            } else {
                                x -= 1;
                                ans = Math.max(ans, x * x + y * y);
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
