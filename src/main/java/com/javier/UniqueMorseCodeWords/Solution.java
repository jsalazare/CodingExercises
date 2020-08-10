package com.javier.UniqueMorseCodeWords;

import java.util.HashSet;

public class Solution {

    static String[] morseAlphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static int uniqueMorseRepresentations(String[] words) {
        StringBuilder myString = new StringBuilder();
        HashSet<String> hash = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                myString.append(morseAlphabet[words[i].charAt(j) - 97]);
            }


            if(!hash.contains(myString.toString())){
                hash.add(myString.toString());
                counter++;
            }
            myString.setLength(0);
        }

        return counter;
    }

    public static void main(String[] args) {
        String [] arr = new String [] {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(arr));
    }

}
