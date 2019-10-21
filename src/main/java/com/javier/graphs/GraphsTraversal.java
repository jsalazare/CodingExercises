package com.javier.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GraphsTraversal {

    public static void BFS (Node root){
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> set = new HashSet<>();

        Node node;
        queue.add(root);
        set.add(root);

        while(!queue.isEmpty()){
            node = queue.poll();
            System.out.println(node.getValue());

            if (node.getUp() != null && !set.contains(node.getUp())) {
                queue.add(node.getUp());
                set.add(node.getUp());
            }

            if (node.getRight() != null  && !set.contains(node.getRight())) {
                queue.add(node.getRight());
                set.add(node.getRight());
            }

            if (node.getDown() != null && !set.contains(node.getDown())) {
                queue.add(node.getDown());
                set.add(node.getDown());
            }

            if (node.getLeft() != null && !set.contains(node.getLeft())) {
                queue.add(node.getLeft());
                set.add(node.getLeft());
            }
        }
    }

    public static void DFS (Node node, HashSet<Node> set) {
        System.out.println(node.getValue());
        if(node.getUp() != null && !set.contains(node.getUp())){
            set.add(node.getUp());
            DFS(node.getUp(), set);
        }

        if(node.getRight() != null && !set.contains(node.getRight())){
            set.add(node.getRight());
            DFS(node.getRight(), set);
        }

        if(node.getDown() != null && !set.contains(node.getDown())){
            set.add(node.getDown());
            DFS(node.getDown(), set);
        }

        if(node.getLeft() != null && !set.contains(node.getLeft())){
            set.add(node.getLeft());
            DFS(node.getLeft(), set);
        }

    }


}
