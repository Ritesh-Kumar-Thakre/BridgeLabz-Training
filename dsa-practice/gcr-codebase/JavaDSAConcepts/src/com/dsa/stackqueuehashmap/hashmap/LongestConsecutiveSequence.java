package com.dsa.stackqueuehashmap.hashmap;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestStreak(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        for(int x : arr) set.add(x);

        int longest = 0;

        for(int num : set) {

            // Only start from beginning of seq
            if(!set.contains(num - 1)) {

                int current = num;
                int streak = 1;

                while(set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int arr[] = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest consecutive length = " +
                longestStreak(arr));
    }
}