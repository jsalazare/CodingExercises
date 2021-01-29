package com.javier.TimeNeedToInformAllEmployees;

import java.util.LinkedList;
import java.util.Queue;

class Solution {


    // https://leetcode.com/problems/time-needed-to-inform-all-employees
    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        if (n == 1){
            return 0;
        }
        Queue<Integer> queueEmployeesId = new LinkedList<>();
        queueEmployeesId.add(headID);

        int findMaxTimeInLevel = Integer.MIN_VALUE;
        int sizeQueue = 0;
        int current = 0;
        int totalTime = 0;
        while (!queueEmployeesId.isEmpty()) {
            sizeQueue = queueEmployeesId.size();

            for (int i = 0; i < sizeQueue; i++) {
                current = queueEmployeesId.poll();


                //Search for direct employees
                boolean foundAny = false;
                for (int j = 0; j < manager.length; j++) {
                    if (manager[j] == current) {
                        foundAny = true;
                        queueEmployeesId.add(j);
                    }
                }

                if (foundAny && informTime[current] > findMaxTimeInLevel) {
                    findMaxTimeInLevel = informTime[current];
                }

            }

            totalTime = totalTime + findMaxTimeInLevel;
            findMaxTimeInLevel = Integer.MIN_VALUE;
        }

        return totalTime;
    }


    public static void main(String[] args) {
        System.out.println(numOfMinutes(11,4, new int []{5,9,6,10,-1,8,9,1,9,3,4}, new int []{0,213,0,253,686,170,975,0,261,309,337}));
    }
}