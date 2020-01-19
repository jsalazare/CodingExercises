package com.javier.graphsShortestDistans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistant {



    public static int shortestDistant(Node fromNode, Node toNode){
        HashMap<Node, Integer> hashCounter = new HashMap<>();
        HashSet<Node> hash = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(fromNode);
        hashCounter.put(fromNode, 0);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            hash.add(current);
            for (Node adjacent : current.getAdjacents()){
                if(!hash.contains(adjacent)){
                    hash.add(adjacent);
                    queue.add(adjacent);
                    hashCounter.put(adjacent, hashCounter.get(current) + 1);
                }
            }
        }
        return hashCounter.get(toNode);
    }
}
