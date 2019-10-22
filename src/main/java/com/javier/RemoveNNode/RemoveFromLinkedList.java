package com.javier.RemoveNNode;

public class RemoveFromLinkedList {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode previous;
        int counter = 0;
        while(head.next != null){
            previous = head;
            head = head.next;

            if(n == 0 && counter == 0){
                previous.next = null;
            }

            counter++;

            if(counter == n){
                if(head.next == null){
                    previous.next = null;
                    return previous;
                }
                previous.next = head.next;
            }
        }
        return head;
    }

    public static void printLinkedList(ListNode node){
        System.out.print(node.val + ", ");
        while(node.next != null){
            node = node.next;
            System.out.print(node.val + ", ");

        }
    }

    public static void main (String args [] ){
        ListNode node = new ListNode(1);
        node.next =  new ListNode(2);
        node.next.next =  new ListNode(3);
        node.next.next.next =  new ListNode(4);
        node.next.next.next.next =  new ListNode(5);

        System.out.println(removeNthFromEnd(node,0).val);
        printLinkedList(node);

    }

}
