package com.javier.CountGoodNodesinBinaryTree;

import java.util.ArrayList;

public class solution {

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

    public static int goodNodes(TreeNode root) {
        int [] counter = new int [1];
        DFS (root, Integer.MIN_VALUE, counter);
        return counter[0];
    }


    public static void DFS (TreeNode node, int maxInPath, int [] counter){
        if (node != null){
            if (node.val >= maxInPath) {
                counter[0] = counter[0] + 1;
                maxInPath = node.val;
            }

            DFS(node.left, maxInPath, counter);
            DFS(node.right, maxInPath, counter);
        }
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(3);
        TreeNode two = new TreeNode(1);
        TreeNode three = new TreeNode(6);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(1);


        one.left = two;
        one.right = four;

        two.left = three;

        four.left = six;
        four.right = five;


        System.out.println(goodNodes(one));
    }
}
