package com.javier.graphsShortestDistans;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestDistantTest {

    //
    //
    //           0
    //    3     /  \
    //     \  /      1
    //      4       /
    //    /  \     /
    //  5  ---\- 2
    //         \
    //          6
    @Test
    public void test(){
        Node zero = new Node(0);
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);


        zero.addAdjacents(one, two, four);
        one.addAdjacents(zero,two);
        two.addAdjacents(zero,one,five);
        three.addAdjacents(four);
        four.addAdjacents(zero,three, five, six);
        five.addAdjacents(four, two);
        six.addAdjacents(four);

        assertEquals(2,ShortestDistant.shortestDistant(one, five));
        assertEquals(3,ShortestDistant.shortestDistant(three, one));
        assertEquals(3,ShortestDistant.shortestDistant(six, two));


    }


}
