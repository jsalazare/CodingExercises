package com.javier.maximumLevelSumOfABinaryTree;

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

class Solution {

       public int maxLevelSum2(TreeNode root) {
         Queue<TreeNode> queue= new LinkedList<TreeNode>();
         int sum = 0;
         int maxlvl = 0;
         int maxSum = 0;
         int level = 1;
         queue.add(root);
         TreeNode current = null;

         while(!queue.isEmpty()) {


             int size = queue.size();
             for(int i = 0; i < size; i++) {
                 current = queue.poll();
                 assert current != null;
                 sum = sum + current.val;
                 if(current.left != null){
                     queue.add(current.left);
                 }

                 if(current.right != null){
                     queue.add(current.right);
                 }

             }

             if(maxSum < sum){
                 maxSum = sum;
                 maxlvl = level;
             }

             level++;
             sum = 0;
         }

             return maxlvl;
     }

    public int maxLevelSum(TreeNode root) {
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] map = new int [10001];
        DFS(root, 1, map);
        int highestValue = 0;
        int highestLevel = 0;

        for(int i = 1; i < map.length; i++) {
            if(highestValue < map[i]){
                highestValue = map[i];
                highestLevel = i;
            }
        }

        return highestLevel;
    }


    private int DFS(TreeNode root, int level, int [] map) {
        if(root != null) {
            DFS(root.left, level + 1, map);
            map[level] = map[level] + root.val;
            DFS(root.right, level + 1, map);
        }
        return 0;
    }
}