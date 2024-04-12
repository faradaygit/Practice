package com.ufa;

public class LeetCodeMaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] n = {1, 0, 1, 0, 0, 1, 1, 1, 1};
        System.out.println(findMaxMaxConsecutiveOnes(n));
    }

    public static int findMaxMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count,max);

        }
        return max;
    }
}
