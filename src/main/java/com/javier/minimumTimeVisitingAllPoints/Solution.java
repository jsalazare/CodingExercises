package com.javier.minimumTimeVisitingAllPoints;

public class Solution {

    public static int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 1; i < points.length; i++) {
            int xAbs = Math.abs(points[i][0] - points[i-1][0]);
            int yAbs = Math.abs(points[i][1] - points[i-1][1]);

            sum += Math.min(xAbs, yAbs);
            sum += Math.abs(xAbs - yAbs);
        }

        return sum;
    }


    public static void main(String[] args) {
        int [][] arr = new int [][] {
                {1,1},
                {3,4},
                {-1,0}
        };


        System.out.println(minTimeToVisitAllPoints(arr));

    }
}
