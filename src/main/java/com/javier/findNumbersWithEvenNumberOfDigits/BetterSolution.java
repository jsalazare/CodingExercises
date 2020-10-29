package com.javier.findNumbersWithEvenNumberOfDigits;

public class BetterSolution {

    public int findNumbers(int[] nums) {

        int length;
        int numEvens = 0;
        for(int i = 0; i < nums.length; i++){

            length = String.valueOf(nums[i]).length();
            if (length % 2 == 0) {

                numEvens++;
            }

        }
        return numEvens;
    }

}
