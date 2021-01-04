package com.adam.test;

import java.util.ArrayList;
import java.util.List;

public class Q1656 {
    public static void main(String[] args) {
        OrderedStream orderedStream = new OrderedStream(5);
        List<String> list = orderedStream.insert(3, "ccccc");
        printList(list);
        list = orderedStream.insert(1, "aaaaa");
        printList(list);
        list = orderedStream.insert(2, "bbbbb");
        printList(list);
        list = orderedStream.insert(5, "eeeee");
        printList(list);
        list = orderedStream.insert(4, "ddddd");
        printList(list);
    }

    private static void printList(List<String> list){
        for(String str : list){
            System.out.print(str + "\t");
        }
        System.out.println();
    }

    static class OrderedStream {
        private int ptr;
        private String[] values;

        public OrderedStream(int n) {
            ptr = 0;
            values = new String[n];
        }

        public List<String> insert(int id, String value) {
            id = id - 1;
            List<String> result = new ArrayList<>();
            if(id != ptr){
                values[id] = value;
                return result;
            }else{
                values[id] = value;
                int i = id;
                for(; i < values.length; i++){
                    if(values[i] != null){
                        result.add(values[i]);
                    }else{
                        break;
                    }
                }
                ptr = i;
            }
            return result;
        }
    }

}
