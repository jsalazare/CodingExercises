package com.javier.ReplaceElementsWithGreatestElementRightSide;

class Solution {
    public int[] replaceElements(int[] arr) {

        int max = arr[arr.length-1];
        int temp = 0;
        for (int i = arr.length-1; i >= 0; i--){
            temp = max;

            if (arr [i] > max){
                max = arr[i];
            }

            arr[i] = temp;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
