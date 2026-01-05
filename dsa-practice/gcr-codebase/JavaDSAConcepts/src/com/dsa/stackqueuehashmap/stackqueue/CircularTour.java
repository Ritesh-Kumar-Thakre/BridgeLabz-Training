package com.dsa.stackqueuehashmap.stackqueue;

public class CircularTour {

    static class Pump {
        int petrol, distance;
        Pump(int p, int d){
            petrol = p;
            distance = d;
        }
    }

    public static int findStart(Pump arr[], int n) {

        int start = 0, balance = 0, deficit = 0;

        for(int i = 0; i < n; i++) {

            balance += arr[i].petrol - arr[i].distance;

            if(balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {

        Pump arr[] = {
            new Pump(6,4),
            new Pump(3,6),
            new Pump(7,3)
        };

        int start = findStart(arr, arr.length);

        if(start == -1)
            System.out.println("No circular tour possible");
        else
            System.out.println("Start from pump index: " + start);
    }
}
