package com.adam.test;

import java.util.LinkedList;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 14:12
 * version: 1.0.0
 */
public class Offer25 {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.appendTail(3);
        cQueue.appendTail(4);
        cQueue.appendTail(5);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }

    static class CQueue{
        private final LinkedList<Integer> inStack;
        private final LinkedList<Integer> outStack;

        public CQueue() {
            inStack = new LinkedList<>();
            outStack = new LinkedList<>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {
            if(outStack.isEmpty()){
                if(inStack.isEmpty()){
                    return -1;
                }else{
                    while(!inStack.isEmpty()){
                        outStack.push(inStack.pop());
                    }
                    return outStack.pop();
                }
            }else{
                return outStack.pop();
            }
        }
    }
}
