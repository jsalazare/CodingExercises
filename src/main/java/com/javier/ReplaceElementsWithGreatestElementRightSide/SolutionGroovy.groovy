package com.javier.ReplaceElementsWithGreatestElementRightSide

class SolutionGroovy {

    int[] replaceElements(int[] arr) {

        def max = arr[arr.length-1]
        def temp = 0
        for (int i = arr.length-1; i >= 0; i--){
            temp = max

            if (arr [i] > max){
                max = arr[i]
            }

            arr[i] = temp
        }
        arr[arr.length-1] = -1
        arr
    }
}
