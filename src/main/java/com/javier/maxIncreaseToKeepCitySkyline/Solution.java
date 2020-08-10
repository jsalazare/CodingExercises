package com.javier.maxIncreaseToKeepCitySkyline;

public class Solution {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int [] leftRightMaximuns = new int [grid.length];
        int [] topBottonMaximuns = new int [grid.length];
        int sumLeftRight = 0;
        int sumTopBotton = 0;
        int totalSum = 0;

        for(int i=0; i< grid.length; i++) {
            for(int j=0; j< grid[i].length; j++){
                if(grid[i][j] > sumLeftRight){
                    sumLeftRight = grid[i][j];
                }

                if(grid[j][i] > sumTopBotton){
                    sumTopBotton = grid[j][i];
                }
            }


            leftRightMaximuns[i] = sumLeftRight;
            topBottonMaximuns[i] = sumTopBotton;
            sumLeftRight = 0;
            sumTopBotton = 0;
        }

        for(int i=0; i< grid.length; i++) {
            for(int j=0; j< grid[i].length; j++){
                if(leftRightMaximuns[i] <= topBottonMaximuns[j]) {
                    totalSum = totalSum + leftRightMaximuns[i] - grid[i][j];
                } else {
                    totalSum = totalSum + topBottonMaximuns[j] - grid[i][j];
                }
            }
        }


        return totalSum;

    }

    public static void main(String[] args) {
        int [][]arr = new int [][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(arr));
    }
}
