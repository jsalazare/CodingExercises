package com.javier.maximumWidthOfBinaryTree;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Solution {


    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxWidth = Integer.MIN_VALUE;
        LinkedList<TreeNode> q = new LinkedList();
        q.add(root);
        TreeNode current = null;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                current = q.poll();

                if (current != null){
                    q.add(current.left);
                    q.add(current.right);
                } else {
                    q.add(null);
                    q.add(null);
                }
            }




            int width = getWidth(q);
            if (width > maxWidth){
                maxWidth = width;
            }

        }

        return maxWidth;
    }

    public static int getWidth(Queue<TreeNode> queue) {
        int counter = 0;
        Object[] arr = queue.toArray();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null){
                counter++;
            } else {
                break;
            }
        }

        for (int i = arr.length - 1; i >=0; i--) {
            if (arr[i] == null){
                counter++;
            } else {
                break;
            }
        }

        return arr.length - counter;

    }


    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        TreeNode five = new TreeNode(5);
        TreeNode three2 = new TreeNode(3);
        TreeNode nine = new TreeNode(9);


        one.left = three;
        one.right = two;


        three.left = five;
        three.right = three2;

        two.right = nine;

        System.out.println(widthOfBinaryTree(one));
    }
}
