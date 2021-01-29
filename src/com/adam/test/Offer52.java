package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/27 18:39
 * version: 1.0.0
 */
public class Offer52 {
    public static void main(String[] args) {

    }

    static class Solution{
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null){
                return null;
            }
            ListNode nodeA = headA;
            ListNode nodeB = headB;
            while(nodeA != nodeB){
                nodeA = nodeA == null? headB : nodeA.next;
                nodeB = nodeB == null? headA : nodeB.next;
            }
            return nodeA;
        }
    }
}
