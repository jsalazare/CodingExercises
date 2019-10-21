package com.javier.findMedianSortedArrays;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FindMedianSortedArraysTest {


    @Test
    public void testFirstArrayLonger(){
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        int [] nums1 = new int[] {1,3,4};
        int [] nums2 = new int[] {2,5};

        assertEquals(3, findMedianSortedArrays.findMedianSortedArrays(nums1, nums2),0);

    }

    @Test
    public void testSecondArrayLonger(){
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        int [] nums1 = new int[] {2,5};
        int [] nums2 = new int[] {1,3,4};

        assertEquals(3, findMedianSortedArrays.findMedianSortedArrays(nums1, nums2),0);

    }

    @Test
    public void testArraySameLength(){
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        int [] nums1 = new int[] {2,4,6};
        int [] nums2 = new int[] {1,3,5};

        assertEquals(3.5, findMedianSortedArrays.findMedianSortedArrays(nums1, nums2),0);

    }
}
