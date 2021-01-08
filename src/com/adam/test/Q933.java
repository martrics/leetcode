package com.adam.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/6 17:25
 * version: 1.0.0
 */
public class Q933 {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }

    static class RecentCounter{
        private Queue<Integer> queue;
        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            while(queue.peek() < t - 3000){
                queue.remove();
            }
            return queue.size();
        }
    }
}
