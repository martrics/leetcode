package com.adam.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/5 17:29
 * version: 1.0.0
 */
public class Interview0306 {
    public static void main(String[] args) {

    }

    static class AnimalShelf{
        private Queue<int[]> catQueue;
        private Queue<int[]> dogQueue;
        private int seq;

        public AnimalShelf() {
            catQueue = new LinkedList<>();
            dogQueue = new LinkedList<>();
            seq = 0;
        }

        public void enqueue(int[] animal) {
            if(animal[1] == 0){
                catQueue.add(new int[]{animal[0], seq});
            }else{
                dogQueue.add(new int[]{animal[0], seq});
            }
            seq++;
        }

        public int[] dequeueAny() {
            if(dogQueue.isEmpty()){
                if(catQueue.isEmpty()) {
                    return new int[]{-1, -1};
                }else{
                    return dequeueCat();
                }
            }else{
                if(catQueue.isEmpty()){
                    return dequeueDog();
                }else{
                    int dogSeq = dogQueue.peek()[1];
                    int catSeq = catQueue.peek()[1];
                    if(dogSeq < catSeq){
                        return dequeueDog();
                    }else{
                        return dequeueCat();
                    }
                }
            }
        }

        public int[] dequeueDog() {
            if(dogQueue.isEmpty()){
                return new int[]{-1, -1};
            }
            return new int[]{dogQueue.poll()[0], 1};
        }

        public int[] dequeueCat() {
            if(catQueue.isEmpty()){
                return new int[]{-1, -1};
            }
            return new int[]{catQueue.poll()[0], 0};
        }
    }
}
