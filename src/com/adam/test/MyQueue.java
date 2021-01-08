package com.adam.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/7 10:29
 * version: 1.0.0
 */
public class MyQueue {
    private final Stack<Integer> inStack;
    private final Stack<Integer> outStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return outStack.isEmpty() && inStack.isEmpty();
    }

    public static void main(String[] args){
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.peek());
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
    }
}
