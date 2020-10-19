package com.javier.shuffleTheArray;

public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int [] shuffled  = new int [n*2];

        int j = n;
        int xs = 0;
        for (int i = 0; i < n; i++) {

            shuffled[xs] = nums[i];
            shuffled[xs+1] = nums[j];

            j++;
            xs += 2;
        }

        return shuffled;
    }

}
