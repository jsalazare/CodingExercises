package com.javier.numberOfStudentsDoingHomeworkAtGivenTime;

public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int counter = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]){
                counter++;
            }
        }

        return counter;
    }
}
