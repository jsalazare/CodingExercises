package com.javier.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {


    static class Triplet {

        private int number1;
        private int number2;
        private int number3;


        public Triplet(int number1, int number2, int number3) {
            this.number1 = number1;
            this.number2 = number2;
            this.number3 = number3;
        }

        public int getNumber1() {
            return number1;
        }

        public void setNumber1(int number1) {
            this.number1 = number1;
        }

        public int getNumber2() {
            return number2;
        }

        public void setNumber2(int number2) {
            this.number2 = number2;
        }

        public int getNumber3() {
            return number3;
        }

        public void setNumber3(int number3) {
            this.number3 = number3;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Triplet triplet = (Triplet) o;
            return number1 == triplet.number1 && number2 == triplet.number2 && number3 == triplet.number3;
        }

        @Override
        public int hashCode() {
            return Objects.hash(number1, number2, number3);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        //map.
        // -1 -> 0, 4
        // 0 -> 1
        // 2 -> 3

        //O(n^3) -- using a map: O(n^2)

        // -1 + y + z = 0
        // y + z = 1
        // [-1,0,1,2,-1,-4]
        //

        //[-4.0,1,2,3,4,100]

        Map<Integer, List<Integer>> mapList = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (mapList.containsKey(nums[i])){
                mapList.get(nums[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                mapList.put(nums[i], list);
            }
        }

        Set<Triplet> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {

                int missingNumber = nums[i] + nums[j];
                if (mapList.containsKey(-missingNumber)) {
                    List<Integer> listOfIndexes =  mapList.get(-missingNumber);
                    for (int k = 0; k < listOfIndexes.size(); k++) {
                        if ( listOfIndexes.get(k) > i && listOfIndexes.get(k) > j){
                            int [] ordered = new int [] {nums[i], nums[j], nums[listOfIndexes.get(k)]};
                            Arrays.sort(ordered);
                            result.add(new Triplet(ordered[0], ordered[1], ordered[2]));
                            break;
                        }
                    }
                }

            }
        }

        return result.stream().map(triplet -> {
            List<Integer> mappedList = Arrays.asList(
                    triplet.getNumber1(),
                    triplet.getNumber2(),
                    triplet.getNumber3()
            );

             return mappedList;
        }).collect(Collectors.toList());
    }


    public static void main(String[] args) {

        int [] nums = new int[] {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
}