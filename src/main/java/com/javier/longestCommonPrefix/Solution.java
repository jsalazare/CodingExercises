package com.javier.longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){
            return strs[0];
        }

        StringBuilder sb = new StringBuilder(strs[0]);





        String current = "";
        int shortestStringLength = 0;
        for (int i = 1; i < strs.length; i++) {
            current = sb.toString();
            sb.setLength(0);

            shortestStringLength = current.length() >= strs[i].length()  ? strs[i].length() : current.length();

            for (int j = 0; j < shortestStringLength; j++) {
                if ( current.charAt(j) == strs[i].charAt(j)) {
                    sb.append(current.charAt(j));
                } else {
                    break;
                }
            }

        }

        return sb.toString();

    }
}