package com.javier.MaximumNumberOfCoinsYouCanGet;

import java.util.Arrays;

public class Solution {

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int index = piles.length - 2;
        int total = 0;
        for (int i = 0; i < piles.length/3; i++) {
            total += piles[index];
            index -= 2;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(maxCoins(new int[] {1,2,3,4,5,6,7,8,9}));
    }
}
