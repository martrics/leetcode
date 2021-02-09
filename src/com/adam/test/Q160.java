package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 17:43
 * version: 1.0.0
 */
public class Q160 {
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
