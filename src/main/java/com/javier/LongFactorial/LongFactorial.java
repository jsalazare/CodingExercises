package com.javier.LongFactorial;

import java.math.BigInteger;

public class LongFactorial {

    //https://www.hackerrank.com/challenges/extra-long-factorials/problem

    static void extraLongFactorials(int n) {
        BigInteger longFactorial = BigInteger.valueOf(1);
        for(int i = 1; i <= n; i++){
            longFactorial = longFactorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(longFactorial.toString());
    }
}
