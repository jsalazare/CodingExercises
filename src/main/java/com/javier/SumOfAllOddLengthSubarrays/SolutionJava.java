package com.javier.SumOfAllOddLengthSubarrays;

public class SolutionJava {

    public static int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        for (int i= 1; i <= arr.length; i = i + 2) {
            for (int j= 0; j <= arr.length - i; j++){
                for (int k = j; k < j + i; k++) {
                    sum = sum + arr[k];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int [] arr = new int [] {1,2};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
