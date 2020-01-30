package com.javier.EncryptionProblem;

public class HackerRankEncryption {

    //https://www.hackerrank.com/challenges/encryption/problem

    static String encryption(String s) {
        double sqrt = Math.sqrt(s.length());
        int columns = (int) Math.ceil(sqrt);
        int rows = (int) Math.floor(sqrt);
        if (columns * rows < s.length()){
            rows++;
        }
        char[][] encriptedMatrix =  new char[rows][columns];


        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < s.length(); i++) {
            encriptedMatrix[indexRow][indexColumn] = s.charAt(i);
            indexColumn++;
            if (indexColumn == columns){
                indexColumn = 0;
                indexRow++;
            }
        }
        String res = "";
        StringBuilder builder = new StringBuilder();

        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                if (encriptedMatrix[row][column] != 0){
                    builder.append(encriptedMatrix[row][column]);
                }

            }
            builder.append(" ");
        }

        return builder.toString().trim();
    }


}
