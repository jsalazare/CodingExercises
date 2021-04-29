package com.javier.MiddleOfTheLinkedList;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {

    public ListNode middleNode(ListNode head) {

        int counter = 0;
        ListNode n = head;
        while (head != null){
            counter++;
            head = head.next;
        }

        int middle = (counter/2) + 1;
        int secondCounter = 0;
        ListNode res = null;
        while (n != null){
            secondCounter++;
            if (secondCounter == middle){
                res = n;
            }

            n = n.next;
        }

        return res;
    }

}
