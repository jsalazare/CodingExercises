package com.javier.BinaryTreeInorderTraversal;

import java.util.LinkedList;
import java.util.List;
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);


        TreeNode current = null;

        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new LinkedList();

            for (int i = 0; i < size; i++) {
                current = q.poll();
                level.add(current.val);


                if (current.left != null){
                    q.add(current.left);
                }

                if (current.right != null){
                    q.add(current.right);
                }

            }

            result.add(level);
        }

        return result;
    }
}
