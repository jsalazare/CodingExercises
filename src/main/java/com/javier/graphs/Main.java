package com.javier.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    //   1  -  2
    //   |     |
    //   3  -  4  - 5
    //         |
    //         6
    public static void main (String args []){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        one.setRight(two);
        one.setDown(three);

        two.setDown(four);

        four.setRight(five);
        four.setDown(six);

//        BFS(one);
        GraphsTraversal.DFS(one, new HashSet<Node>());

    }
}
