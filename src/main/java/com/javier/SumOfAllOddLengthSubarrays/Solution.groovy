package com.javier.SumOfAllOddLengthSubarrays

class Solution {
    static int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        for (int i= 1; i <= arr.length; i = i + 2) {
            for (int j= 0; j <= arr.length - i; j++){
                for (int k = j; k < j + i; k++) {
                    sum = sum + arr[k]
                }
            }
        }

        sum
    }

    static void main(String[] args) {
        int [] arr = [1,2]

        println sumOddLengthSubarrays(arr)
    }
}
