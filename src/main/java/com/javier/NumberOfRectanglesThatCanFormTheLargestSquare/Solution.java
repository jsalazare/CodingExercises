package com.javier.NumberOfRectanglesThatCanFormTheLargestSquare;

//https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
class Solution {
    public int countGoodRectangles(int[][] rectangles) {

        int maxLen = Integer.MIN_VALUE;
        int maxLenCounter = 0;
        int rectangleMinSide = 0;
        for (int i = 0; i < rectangles.length; i++) {
            rectangleMinSide = Math.min(rectangles[i][0], rectangles[i][1]);

            if (rectangleMinSide > maxLen){
                maxLen = rectangleMinSide;
                maxLenCounter = 1;
            } else if (maxLen == rectangleMinSide){
                maxLenCounter++;
            }
        }

        return maxLenCounter;
    }
}