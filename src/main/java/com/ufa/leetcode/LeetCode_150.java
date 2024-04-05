package com.ufa.leetcode;

public class LeetCode_150 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String lowercase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(lowercase).reverse().toString();
        return reversed.equals(lowercase);
    }
}
