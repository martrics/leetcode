package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 14:16
 * version: 1.0.0
 */
public class Q705 {
    public static void main(String[] args) {

    }

    static class MyHashSet {
        private int[] bucket;

        /** Initialize your data structure here. */
        public MyHashSet() {
            bucket = new int[31251];
        }

        public void add(int key) {
            int[] index = getIndex(key);
            bucket[index[0]] |= 1 << index[1];
        }

        public void remove(int key) {
            int[] index = getIndex(key);
            bucket[index[0]] &= ~(1 << index[1]);
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            int[] index = getIndex(key);
            return (bucket[index[0]] & (1 << index[1])) != 0;
        }

        private int[] getIndex(int key){
            int[] index = new int[2];
            index[0] = key / 32;
            index[1] = key % 32;
            return index;
        }
    }
}
