package com.javier.deepestLeavesSum;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public class TreeNode {
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

    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        int size = 0;
        TreeNode current;
        int sum = 0;

        while(!queue.isEmpty()){

            size = queue.size();
            sum = 0;
            for (int i = 0; i < size; i++){
                current = queue.poll();
                sum = sum + current.val;
                if (current.left != null){
                    queue.add(current.left);
                }

                if (current.right != null){
                    queue.add(current.right);
                }
            }


        }
        return sum;
    }
}