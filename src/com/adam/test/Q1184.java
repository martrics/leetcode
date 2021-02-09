package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 15:21
 * version: 1.0.0
 */
public class Q1184 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            if(start > destination){
                return distanceBetweenBusStops(distance, destination, start);
            }
            int total = 0;
            for(int i = 0; i < distance.length; i++){
                total += distance[i];
            }
            int dis = 0;
            for(int i = start; i < destination; i++){
                dis += distance[i];
            }
            if(dis <= total >> 1){
                return dis;
            }else{
                return total - dis;
            }
        }
    }
}
