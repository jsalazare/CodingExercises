package com.javier.ImplementStrStr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/problems/implement-strstr/solution/
public class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }
        int allOcurrences = 0;
        int needleIndex = 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = i; j < needle.length() + i; j++) {
                if (haystack.charAt(j) == needle.charAt(needleIndex)) {
                    allOcurrences++;
                } else {
                    break;
                }
                needleIndex++;
            }

            if (allOcurrences == needle.length()){
                return i;
            }
            allOcurrences = 0;
            needleIndex = 0;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aa","a"));


        List<String> list = Arrays.asList("bill","zaray","tommy", "maria");

        List<String> filteredList = list.stream()
                .sorted((s1,s2) -> s1.compareTo(s2))
                .filter(s -> s.length() >= 5)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());


        System.out.println(String.join(",",filteredList));
    }
}
