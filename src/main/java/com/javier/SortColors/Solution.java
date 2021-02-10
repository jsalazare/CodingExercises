package com.javier.SortColors;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void sortColors(int[] nums) {
        int ceroCounter = 0;
        int oneCounter = 0;
        int twoCounter = 0;
        List<List<Integer>> lists = new ArrayList<>();
        for(int i= 0; i < nums.length; i++){
            if (nums[i] == 0){
                ceroCounter++;
            } else if (nums[i] == 1){
                oneCounter++;
            } else if (nums[i] == 2){
                twoCounter++;
            }
        }

        for(int i= 0; i < nums.length; i++) {
            if (ceroCounter > 0){
                nums[i] = 0;
                ceroCounter--;
            } else if (oneCounter > 0){
                nums[i] = 1;
                oneCounter--;
            } else if (twoCounter > 0){
                nums[i] = 2;
                twoCounter--;
            }
        }
    }
}
