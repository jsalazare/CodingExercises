package com.javier.graphsShortestDistans;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private int value;
    private List<Node> adjacents ;

    public Node(int value) {
        this.value = value;
        this.adjacents = new ArrayList<>();
    }

    public void addAdjacents(Node ...adjacents){
        for (Node node : adjacents){
            this.adjacents.add(node);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Node> getAdjacents() {
        return adjacents;
    }

    public void setAdjacents(List<Node> adjacents) {
        this.adjacents = adjacents;
    }


}
