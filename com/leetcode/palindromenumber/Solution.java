package com.leetcode.palindromenumber;

//  Given an integer x, return true if x is a palindrome and false otherwise.
//  121 -> 121
public class Solution {
    public boolean isPalindrome(int x) {
        /* convert x to String -> strX */
        String strX = String.valueOf(x);
        /* create object sb */
        StringBuilder sb = new StringBuilder();

        /* append all number inside strX into sb */
        for (char c : strX.toCharArray()) {
            sb.append(c);
        }

        /* reversing all number inside sb */
        sb.reverse();

        /* check and return if sb after reversing is equal to strX or Not */
        return sb.toString().equals(strX);
    }
}
