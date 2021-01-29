package com.javier.TimeNeedToInformAllEmployees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//https://leetcode.com/problems/time-needed-to-inform-all-employees/submissions/
public class SolutionDFS {
    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int [] maxTime = new int []{Integer.MIN_VALUE};
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < manager.length; i++) {
            if (map.containsKey(manager[i])) {
                map.get(manager[i]).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(manager[i], list);
            }
        }

        numOfMinutes(headID,manager,informTime,0,maxTime, map);
        return maxTime[0];
    }

    public static void numOfMinutes (int headID, int[] manager, int[] informTime, int timePath, int [] maxTime, HashMap<Integer, ArrayList<Integer>> map ) {
        if (timePath > maxTime[0]) {
            maxTime[0] = timePath;
        }

        if (map.containsKey(headID)){
            for (Integer i: map.get(headID)){
                numOfMinutes ( i,  manager,  informTime,  timePath + informTime[headID], maxTime, map);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(numOfMinutes(11,4, new int []{5,9,6,10,-1,8,9,1,9,3,4}, new int []{0,213,0,253,686,170,975,0,261,309,337}));
    }
}
