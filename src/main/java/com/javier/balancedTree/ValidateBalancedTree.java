package com.javier.balancedTree;

public class ValidateBalancedTree {

    //
    //             1
    //          /      \
    //         /        \
    //       2           3
    //     /   \       /
    //    4     5     6
    //                  \
    //                   7
    //
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);


        one.left = two;
        two.left = four;
        two.right = five;

        one.right = three;
        three.left = six;
        six.right = seven;


        System.out.println(checkBalancedTree(one));

    }

    public static boolean checkBalancedTree(Node root) {
        return isBalancedTree(root) != -1 ;
    }

    public static int isBalancedTree(Node root){
        if (root == null){
            return 0;
        }

        int leftHeight = isBalancedTree(root.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = isBalancedTree(root.right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        return (1 + Math.max(leftHeight, rightHeight));
    }
}
