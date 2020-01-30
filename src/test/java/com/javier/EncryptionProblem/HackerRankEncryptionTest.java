package com.javier.EncryptionProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javier.findMedianSortedArrays.FindMedianSortedArrays;

public class HackerRankEncryptionTest {

    @Test
    public void testCaseOne(){
        String input = "haveaniceday";
        String expected = "hae and via ecy";

        String actual = HackerRankEncryption.encryption(input);
        assertEquals(expected, actual);

    }

    @Test
    public void testCaseTwo(){
        String input = "feedthedog";
        String expected = "fto ehg ee dd";

        String actual = HackerRankEncryption.encryption(input);
        assertEquals(expected, actual);

    }

    @Test
    public void testCaseOneWord(){
        String input = "chillout";
        String expected = "clu hlt io";

        String actual = HackerRankEncryption.encryption(input);
        assertEquals(expected, actual);

    }


}
