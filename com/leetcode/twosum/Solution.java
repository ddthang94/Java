package com.leetcode.twosum;

//Given an array of integers nums and an integer target,
//      return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution,
//      and you may not use the same element twice.
//You can return the answer in any order.

//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

    /* Hashmap */
//    K -> V
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i,complementIndex};
            }
            complements.put(target-nums[i], i);
        }
        return nums;
    }
}
