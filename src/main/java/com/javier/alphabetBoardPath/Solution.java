package com.javier.alphabetBoardPath;

import java.util.HashMap;

public class Solution {

    public String alphabetBoardPath(String target) {
        //0,0 -- 2, 1 -- (V,H) = -2,-1
        //2,1 --

        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer []> hash = new HashMap<>();

        hash.put('a',new Integer[]{0,0});
        hash.put('b',new Integer[]{0,1});
        hash.put('c',new Integer[]{0,2});
        hash.put('d',new Integer[]{0,3});
        hash.put('e',new Integer[]{0,4});
        hash.put('f',new Integer[]{1,0});
        hash.put('g',new Integer[]{1,1});
        hash.put('h',new Integer[]{1,2});
        hash.put('i',new Integer[]{1,3});
        hash.put('j',new Integer[]{1,4});
        hash.put('k',new Integer[]{2,0});
        hash.put('l',new Integer[]{2,1});
        hash.put('m',new Integer[]{2,2});
        hash.put('n',new Integer[]{2,3});
        hash.put('o',new Integer[]{2,4});
        hash.put('p',new Integer[]{3,0});
        hash.put('q',new Integer[]{3,1});
        hash.put('r',new Integer[]{3,2});
        hash.put('s',new Integer[]{3,3});
        hash.put('t',new Integer[]{3,4});
        hash.put('u',new Integer[]{4,0});
        hash.put('v',new Integer[]{4,1});
        hash.put('w',new Integer[]{4,2});
        hash.put('x',new Integer[]{4,3});
        hash.put('y',new Integer[]{4,4});
        hash.put('z',new Integer[]{5,0});


        int currentPositionI = 0;
        int currentPositionJ = 0;

        for (int i = 0; i < target.length(); i++) {
            int indexI = hash.get(target.charAt(i)) [0];
            int indexJ = hash.get(target.charAt(i)) [1];

            int verticalDifference = currentPositionI - indexI;
            int horizontalDifference = currentPositionJ - indexJ;

            if (verticalDifference == 0 && horizontalDifference == 0) {
                sb.append('!');
                currentPositionI = indexI;
                currentPositionJ = indexJ;

                continue;
            }

            char verticalLetter = verticalDifference > 0 ? 'U' : 'D';
            char horizontalLetter = horizontalDifference > 0 ? 'L' : 'R';


            if (target.charAt(i) == 'z'){
                for (int j = 0; j <  Math.abs(horizontalDifference); j++) {
                    sb.append(horizontalLetter);
                }

                for (int j = 0; j < Math.abs(verticalDifference); j++) {
                    sb.append(verticalLetter);
                }


            } else {
                for (int j = 0; j < Math.abs(verticalDifference); j++) {
                    sb.append(verticalLetter);
                }

                for (int j = 0; j <  Math.abs(horizontalDifference); j++) {
                    sb.append(horizontalLetter);
                }
            }



            sb.append('!');

            currentPositionI = indexI;
            currentPositionJ = indexJ;


        }





        return sb.toString();
    }
}
