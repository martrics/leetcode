package com.adam.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 9:17
 * version: 1.0.0
 */
public class Q341 {
    public static void main(String[] args) {

    }

    static public class NestedIterator implements Iterator<Integer> {
        private final List<Integer> list = new ArrayList<>();
        private int i = 0;
        private int n = 0;

        public NestedIterator(List<NestedInteger> nestedList) {
            add(nestedList);
        }

        @Override
        public Integer next() {
            if(i < n){
                return list.get(i++);
            }else{
                return null;
            }
        }

        @Override
        public boolean hasNext() {
            return i < n;
        }

        private void add(List<NestedInteger> nestedIntegerList){
            for(NestedInteger nestedInteger : nestedIntegerList){
                if(nestedInteger.isInteger()){
                    list.add(nestedInteger.getInteger());
                    n++;
                }else{
                    add(nestedInteger.getList());
                }
            }
        }
    }

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
