package com.javier.findNumbersWithEvenNumberOfDigits;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class Solution {
    public int findNumbers(int[] nums) {

        int numEvens = 0;
        for(int i = 0; i < nums.length; i++){

            for (int numCeros = 10; numCeros >= 0; numCeros--){

                if (nums[i] % Math.pow(10, numCeros) < nums[i]){
                    if ((numCeros + 1) % 2 == 0) {

                        numEvens++;
                    }
                    break;
                }

            }
        }
        return numEvens;
    }
}