package com.javier.matrixBlockSum;

//https://leetcode.com/problems/matrix-block-sum/
public class Solution {

    public int[][] matrixBlockSum(int[][] mat, int K) {

        int[][] answer = new int [mat.length][mat[0].length];
        int iUpLimit = 0;
        int iDowntLimit = 0;
        int jLeftLimit = 0;
        int jRightLimit = 0;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {


                if (i - K <= 0){
                    iUpLimit = 0;
                } else {
                    iUpLimit = i - K;
                }

                if (i + K >= mat.length - 1 ){
                    iDowntLimit = mat.length - 1;
                } else {
                    iDowntLimit = i + K;
                }


                if (j - K <= 0){
                    jLeftLimit = 0;
                } else {
                    jLeftLimit = j - K;
                }


                if (j + K >= mat[i].length - 1){
                    jRightLimit = mat[i].length - 1;
                } else {
                    jRightLimit = j + K;
                }

                sum = 0;
                for(int r = iUpLimit; r <= iDowntLimit; r++) {
                    for(int c = jLeftLimit; c <= jRightLimit; c++) {
                        sum = sum + mat[r][c];
                    }
                }

                answer[i][j] = sum;


            }
        }

        return answer;
    }

}
