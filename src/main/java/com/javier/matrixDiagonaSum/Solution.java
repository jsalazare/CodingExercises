package com.javier.matrixDiagonaSum;
class Solution {

    //https://leetcode.com/problems/matrix-diagonal-sum/
    public int diagonalSum(int[][] mat) {
        int left = 0;
        int right = mat.length - 1;
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {

            if (left == right){
                sum += mat[i][left];
            } else {
                sum += mat[i][left] + mat[i][right];
            }


            left++;
            right--;
        }

        return sum;
    }
}
