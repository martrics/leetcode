package com.adam.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/7 15:34
 * version: 1.0.0
 */
public class Q706 {
    public static void main(String[] args) {

    }

    class MyHashMap {
        private int[] hashBucket;
        /** Initialize your data structure here. */
        public MyHashMap() {
            hashBucket = new int[1000001];
            Arrays.fill(hashBucket, -1);
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            hashBucket[key] = value;
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            return hashBucket[key];
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            hashBucket[key] = -1;
        }
    }
}
