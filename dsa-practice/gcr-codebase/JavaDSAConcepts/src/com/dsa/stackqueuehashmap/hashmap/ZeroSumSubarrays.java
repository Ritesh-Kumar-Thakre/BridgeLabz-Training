package com.dsa.stackqueuehashmap.hashmap;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int arr[]) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Add base condition (sum = 0 at index -1)
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if(map.containsKey(sum)) {

                for(int startIndex : map.get(sum)) {
                    System.out.println("Zero sum subarray found: "
                            + (startIndex+1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 4, -7, 1, 2, -6, 3, 1};

        findZeroSumSubarrays(arr);
    }
}
