package com.dsa.stackqueuehashmap.hashmap;

import java.util.*;

public class PairSumCheck {

    public static boolean checkPair(int arr[], int target) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {

            int required = target - num;

            if(set.contains(required)) {
                System.out.println("Pair found: " + num + " & " + required);
                return true;
            }

            set.add(num);
        }

        System.out.println("No pair found");
        return false;
    }

    public static void main(String[] args) {

        int arr[] = {5, 7, 1, 2, 8, 3};
        int target = 10;

        checkPair(arr, target);
    }
}
