package com.javier.graphsShortestDistans;

public class Main {

    public static void main(String[] args) {
        Node cero = new Node(0);
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);


        cero.addAdjacents(one, two, four);

        one.addAdjacents(cero,two);

        two.addAdjacents(cero,one,five);

        three.addAdjacents(four);

        four.addAdjacents(cero,three, five, six);

        five.addAdjacents(four, two);

        six.addAdjacents(four);

        System.out.println(ShortestDistant.shortestDistant(one, five));


    }
}

