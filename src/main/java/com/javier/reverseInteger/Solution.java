package com.javier.reverseInteger;

class Solution {
    public int reverse(int x) {
        int number = Math.abs(x);
        long sum = 0;
        while(number > 0){
            sum = sum * 10 + number%10;
            number = number / 10;
        }

        if (sum > Integer.MAX_VALUE){
            return 0;
        }

        return x >= 0? (int)sum: (int)sum * -1;
    }
}