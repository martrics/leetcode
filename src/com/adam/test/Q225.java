package com.adam.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/19 16:11
 * version: 1.0.0
 */
public class Q225 {
    public static void main(String[] args) {

    }

    static class MyStack {
        private Queue<Integer> queue;

        /** Initialize your data structure here. */
        public MyStack() {
            queue = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(x);
            int n = queue.size();
            for(int i = 1; i < n; i++){
                Integer val = queue.poll();
                queue.add(val);
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            Integer val = queue.poll();
            return val;
        }

        /** Get the top element. */
        public int top() {
            return queue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
