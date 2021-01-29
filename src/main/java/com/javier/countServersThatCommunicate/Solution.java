package com.javier.countServersThatCommunicate;

class Solution {

    //https://leetcode.com/problems/count-servers-that-communicate/
    public static int countServers(int[][] grid) {

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1 && validateCanCommunicate(i,j,grid)){
                    sum++;
                }
            }
        }

        return sum;
    }

    public static boolean validateCanCommunicate(int i, int j, int[][] grid) {
        for (int k = 0; k < grid[i].length; k++) {
            if (k != j && grid[i][k] == 1){
                return true;
            }
        }

        for (int l = 0; l < grid.length; l++) {
            if (l != i && grid[l][j] == 1){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [][] arr = new int [][] {
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,0},
                {0,0,1,0,0,0,0,0},
                {0,0,1,0,0,1,0,0}
        };

        System.out.println(countServers(arr));
    }
}
