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
                iUpLimit = Math.max(i - K, 0);
                iDowntLimit = Math.min(i + K, mat.length - 1);
                jLeftLimit = Math.max(j - K, 0);
                jRightLimit = Math.min(j + K, mat[i].length - 1);

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
