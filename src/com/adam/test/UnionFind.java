package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/25 11:34
 * version: 1.0.0
 */
public class UnionFind {
    private final int[] parent;
    private final int[] rank;
    private int count;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int getCount(){
        return count;
    }

    public boolean union(int index1, int index2) {
        int x = find(index1);
        int y = find(index2);
        if(x == y){
            return false;
        }
        if (rank[x] <= rank[y]) {
            parent[x] = y;
        } else {
            parent[y] = x;
        }
        if (rank[x] == rank[y] && x != y) {
            rank[y]++;
        }
        count--;
        return true;
    }

    public int find(int index) {
        if (parent[index] != index) {
            parent[index] = find(parent[index]);
        }
        return parent[index];
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}
