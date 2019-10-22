package com.javier.balancedTree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidateBalancedTreeTest {


    @Test
    public void isBalancedTree(){
        Node root = createBalancedTree();
        assertTrue(ValidateBalancedTree.checkBalancedTree(root));
    }

    @Test
    public void isNotBalancedTree(){
        Node root = createNotBalancedTree();
        assertFalse(ValidateBalancedTree.checkBalancedTree(root));
    }


    //
    //             1
    //          /      \
    //         /        \
    //       2           3
    //     /   \       /   \
    //    4     5     6     8
    //                  \
    //                   7
    //

    public Node createBalancedTree(){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);


        one.left = two;
        two.left = four;
        two.right = five;

        one.right = three;
        three.left = six;
        six.right = seven;

        three.right = eight;

        return one;
    }

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

    public Node createNotBalancedTree(){
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

        return one;
    }


}
