package com.javier.checkCompletenessOfABinaryTree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/check-completeness-of-a-binary-tree/
public class Solution {



    static class TreeNode {
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


    public static boolean isCompleteTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList();
        boolean seeNull = false;
        queue.toArray();
        queue.add(root);
        TreeNode current;

        while(!queue.isEmpty()) {

            current = queue.poll();

            if (current == null) {
                seeNull = true;
            } else if (seeNull){
                return false;
            }

            if (current != null){
                queue.add(current.left);
                queue.add(current.right);
            }
        }

        return true;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        three.left = six;


        System.out.println(isCompleteTree(root));
    }
}
