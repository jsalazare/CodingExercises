package com.javier.maximumDepthOfBinaryTree;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/
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
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int [] maxLevel = {Integer.MIN_VALUE};
        maxDepthDFS(root, 1, maxLevel);
        return maxLevel[0];
    }

    public static void maxDepthDFS(TreeNode root, int levelCounter, int [] maxLevel){
        if (root != null) {
            maxDepthDFS(root.left, levelCounter + 1, maxLevel);
            if (levelCounter > maxLevel[0]) {
                maxLevel[0] = levelCounter;
            }
            maxDepthDFS(root.right, levelCounter + 1, maxLevel);
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode two = new TreeNode(9);
        TreeNode three = new TreeNode(20);
        TreeNode four = new TreeNode(15);
        TreeNode five = new TreeNode(7);

        root.left = two;
        root.right = three;
        two.right = four;
        three.left = five;

        System.out.println(maxDepth(root));
    }
}
