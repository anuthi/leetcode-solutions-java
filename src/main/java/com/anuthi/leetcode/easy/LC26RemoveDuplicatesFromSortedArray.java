package com.anuthi.leetcode.easy;

/*
-----------------------------------------------------------------------------------------------------------------------------
Leetcode #26 (EASY) - Remove Duplicates from Sorted Array
-----------------------------------------------------------------------------------------------------------------------------
Problem Statement:
    Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same.
    Then return the number of unique elements in nums.

Example:
    Input:
        nums = [0,0,1,1,1,2,2,3,3,4]
    Output:
        5, nums = [0,1,2,3,4,_,_,_,_,_,_]
    Explanation:
        The number of unique elements in the array is 5 (The elements 0,1,2,3 and 4)
*****************************************************************************************************************************
Solution:
    Since the array is sorted in non-decreasing order,
    all the unique elements are one after the other.
    Solving the problem will need a two index approach
        1. i -> Index to traverse the array
        2. index -> Index to update the array with unique elements while reading data from the first index
Time Complexity:
    O(n) - n is the length of the array nums
-----------------------------------------------------------------------------------------------------------------------------
 */
public class LC26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }
}
