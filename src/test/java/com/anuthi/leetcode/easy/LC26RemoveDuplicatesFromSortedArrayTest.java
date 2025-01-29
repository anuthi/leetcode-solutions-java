package com.anuthi.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC26RemoveDuplicatesFromSortedArrayTest {
    @Test
    void removeDuplicatesFromSortedArrayTest() {
        LC26RemoveDuplicatesFromSortedArray lc26Test = new LC26RemoveDuplicatesFromSortedArray();
        Assertions.assertEquals(5, lc26Test.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        Assertions.assertEquals(2, lc26Test.removeDuplicates(new int[]{1,1,2}));
        Assertions.assertEquals(5, lc26Test.removeDuplicates(new int[]{1,2,3,4,5}));
        Assertions.assertEquals(6, lc26Test.removeDuplicates(new int[]{-5,-1,-1,0,0,3,3,4,5}));
    }
}
