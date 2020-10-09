package com.javier.ConvertBinaryNumberInLinkedListtoInteger;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class Solution {

    public int getDecimalValue(ListNode head) {

        int counter = -1;
        int sum = 0;
        ListNode n = head;
        while(n != null) {
            counter++;
            n = n.next;
        }

        while(head != null) {

            if (head.val == 1) {
                sum =+ (int)Math.pow(2,counter);
            }
            counter--;

            head = head.next;
        }

        return sum;
    }
}


