package com.javier.CountLargestGroup;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    // 1 -> 1
    // 2 -> 2
    // 3 -> 2
    //
    //
    public static int countLargestGroup(int n) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        int sumDigits;
        for(int i = 1; i <= n; i ++){
            sumDigits = sumOfDigits(i);
            if (hashMap.containsKey(sumDigits)){
                int value = hashMap.get(sumDigits);
                hashMap.put(sumDigits, value + 1);
            } else {
                hashMap.put(sumDigits, 1);
            }
        }



        int max = hashMap.entrySet().stream().mapToInt(Map.Entry::getValue).max().getAsInt();
        int groupCounter = (int) hashMap.entrySet().stream().filter(entry -> entry.getValue() == max).count();



        return groupCounter;
    }

    public static int sumOfDigits (int digit){
        int sum = 0;
        int res = 0;
        while (digit > 0){

            res = digit%10;
            digit = digit/10;
            sum = sum + res;

        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(countLargestGroup(102));
    }
}
