package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/14 11:34
 * version: 1.0.0
 */
public class Q208 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }

    static class Trie {
        private Node root;

        /** Initialize your data structure here. */
        public Trie() {
            root = new Node();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Node node = root;
            for(char c : word.toCharArray()){
                if(node.children[c - 'a'] == null){
                    node.children[c - 'a'] = new Node();
                }
                node = node.children[c - 'a'];
            }
            node.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Node node = root;
            for(char c : word.toCharArray()){
                node = node.children[c - 'a'];
                if(node == null){
                    return false;
                }
            }
            return node.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Node node = root;
            for(char c : prefix.toCharArray()){
                node = node.children[c - 'a'];
                if(node == null){
                    return false;
                }
            }
            return true;
        }

        static class Node{
            private Node[] children;
            private boolean isWord;

            public Node(){
                children = new Node[26];
            }
        }
    }

}
