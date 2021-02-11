package com.javier.PathSumII;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
  //https://leetcode.com/problems/path-sum-ii/
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> lists = new ArrayList<>();
        DFS(root, targetSum, lists, new ArrayList<>());
        return lists;
    }

    public void DFS(TreeNode root, int targetSum, List<List<Integer>> lists, List<Integer> pathList) {
        if (root != null) {
            pathList.add(root.val);
            DFS(root.left, targetSum, lists, new ArrayList<>(pathList));
            if (root.left == null && root.right == null && pathList.stream().reduce(0, Integer::sum) == targetSum) {
                lists.add(pathList);
            }
            DFS(root.right, targetSum, lists, new ArrayList<>(pathList));
        }
    }
}