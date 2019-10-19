package com.javier.salazar.leetCode;

public class findMedianSortedArrays {

    public static void main(String[] args) {
        int [] nums1 = new int[] {1,2,3};
        int [] nums2 = new int[] {4,5};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c1 = 0;
        int c2 = 0;
        int [] merged = new int[nums1.length + nums2.length];

        for(int i = 0; i < nums1.length + nums2.length; i++) {
            if(c1 < nums1.length && (c2 >= nums2.length || nums1[c1] <= nums2[c2])) {
                merged[i] = nums1[c1];
                c1++;
            } else {
                merged[i] = nums2[c2];
                c2++;
            }
        }

        if(merged.length % 2 == 0){
            double first = merged[merged.length/2];
            double second = (merged[(merged.length/2) - 1]);
            return (first + second )/2;
        } else {
            return merged[merged.length/2];
        }
    }
}
