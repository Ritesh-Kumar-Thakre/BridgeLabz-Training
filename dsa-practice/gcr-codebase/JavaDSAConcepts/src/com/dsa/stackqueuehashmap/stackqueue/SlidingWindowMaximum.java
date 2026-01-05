package com.dsa.stackqueuehashmap.stackqueue;

import java.util.*;

public class SlidingWindowMaximum {

    public static List<Integer> maxSliding(int arr[], int k) {

        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            // Remove out-of-window elements
            if(!dq.isEmpty() && dq.peekFirst() <= i-k)
                dq.pollFirst();

            // Maintain decreasing order
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();

            dq.offerLast(i);

            // Add max when first window completes
            if(i >= k-1)
                result.add(arr[dq.peekFirst()]);
        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        System.out.println("Sliding Window Maximum: " + maxSliding(arr, k));
    }
}
