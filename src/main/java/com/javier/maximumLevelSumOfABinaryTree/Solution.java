package com.javier.maximumLevelSumOfABinaryTree;

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