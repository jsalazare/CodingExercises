package com.javier.FindCommondCharacter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//https://leetcode.com/problems/find-common-characters/submissions/
public class Solution {

    public static List<String> commonChars(String[] A) {
        Map<Character, Integer> map = new HashMap();
        Map<Character, Integer> secondMap = new HashMap();


        String firstWord = A[0];
        for (int i = 0; i < firstWord.length(); i++){
            if (map.containsKey(firstWord.charAt(i))) {

                Integer value = map.get(firstWord.charAt(i));
                map.put(firstWord.charAt(i), value + 1);
            } else {
                map.put(firstWord.charAt(i), 1);
            }
        }


        for (int i = 1; i < A.length; i++){
            for (int j = 0; j < A[i].length(); j++){

                if (secondMap.containsKey(A[i].charAt(j))) {
                    Integer value = secondMap.get(A[i].charAt(j));
                    secondMap.put(A[i].charAt(j), value + 1);
                } else {
                    secondMap.put(A[i].charAt(j), 1);
                }
            }


            for (Map.Entry<Character, Integer> entry : map.entrySet()){

                if (secondMap.containsKey(entry.getKey())){

                    if (secondMap.get(entry.getKey()) < entry.getValue()){
                        map.put(entry.getKey(), secondMap.get(entry.getKey()));
                    }
                } else {
                    map.put(entry.getKey(), 0);
                }

            }

            secondMap = new HashMap();
        }


        List<String> toReturn = new ArrayList<String>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            for (int i = 0; i < entry.getValue(); i++){
                toReturn.add(entry.getKey() + "");
            }
        }
        return toReturn;
    }


    public static void main(String[] args) {

        List<String> result = commonChars(new String []{"bella","label","roller"});
    }
}
