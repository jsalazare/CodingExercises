package com.javier.MergeTwoSortedLists;

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //https://leetcode.com/problems/merge-two-sorted-lists
public class Solution {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode newHead = new ListNode(0);
        ListNode returnHead = newHead;

        while (l1 != null || l2 != null) {


            if (l1 == null){
                newHead.next = l2;
                l2 = l2.next;
            } else if (l2 == null){
                newHead.next = l1;
                l1 = l1.next;
            } else if (l1.val <= l2.val){
                newHead.next = l1;
                l1 = l1.next;
            } else {
                newHead.next = l2;
                l2 = l2.next;
            }

            newHead = newHead.next;
        }

        return returnHead.next;

    }


    public static void main(String[] args) {


        ListNode l1 = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode four = new ListNode(4);

        l1.next = two;
        two.next = four;



        ListNode l2 = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode newFour = new ListNode(4);

        l2.next = three;
        three.next = newFour;


        mergeTwoLists(l1, l2);
    }
}
