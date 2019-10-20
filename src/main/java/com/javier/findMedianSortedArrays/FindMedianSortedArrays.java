package com.javier.findMedianSortedArrays;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
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
