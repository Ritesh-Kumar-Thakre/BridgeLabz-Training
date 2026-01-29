package com.algorithmanalysis.searchperformance;

public class Searching {

	public static int linearSearch(int[] arr, int target) {
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] == target)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int target) {
		
		int n = arr.length;
		int low = 0, high = n-1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] < target)
				low = mid+1;
			else
				high = mid;	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] dataSizes = {1000, 10000, 1000000};
		 int target = -1;
		 
		 for (int size : dataSizes) {

			 int[] data = new int[size];
			 for (int i = 0; i < size; i++) {
				 data[i] = i;
			 }

			 // linear search timing
			 long strtLinear = System.nanoTime();
			 linearSearch(data, target);
			 long endLinear = System.nanoTime();
			 long linearTime = endLinear - strtLinear;

			 // binary search timing
			 long strtBinary = System.nanoTime();
			 binarySearch(data, target);
			 long endBinary = System.nanoTime();
			 long binaryTime = endBinary - strtBinary;

			 System.out.println("---------------------------------------------------------------");
			 System.out.println("Dataset Size: " + size);
			 System.out.println("Linear Search Time: " + linearTime + " ns");
			 System.out.println("Binary Search Time: " + binaryTime + " ns");
		 }
		 
	}

}
