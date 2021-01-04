package com.javier.maximumDepthOfBinaryTree;


import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
class SolutionBFS {
    public static int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }


        TreeNode current = null;
        int sizeOfLevel = 0;
        int maxLevel = 0;
        while (!queue.isEmpty()){
            sizeOfLevel = queue.size();
            maxLevel++;
            for (int i = 0; i < sizeOfLevel; i++) {
                current = queue.poll();

                if (current.left != null){
                    queue.add(current.left);
                }

                if (current.right != null){
                    queue.add(current.right);
                }
            }
        }

        return maxLevel;
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

        System.out.println(maxDepth(null));
    }
}