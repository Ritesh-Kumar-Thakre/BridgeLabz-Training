package com.algorithmanalysis.searchperformance;

public class RecursiveFibonacci {

	public static int recFibonacci(int n) {
		if(n <= 1)
			return n;
		return recFibonacci(n-1) + recFibonacci(n-2);
	}
	
	public static int iterativeFib(int n) {
		if(n <= 1)
			return n;
		int a = 0, b = 1, sum = 0;
		
		for(int i=2; i<=n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] testValues = {10, 30, 40};
		
		for (int n : testValues) {

            System.out.println("\nFibonacci Number: " + n);

            // recursive timing
            long startRec = System.nanoTime();
            int recResult = recFibonacci(n);
            long endRec = System.nanoTime();

            long recursiveTime = endRec - startRec;
            System.out.println("Recursive Result: " + recResult);
            System.out.println("Recursive Time: " + recursiveTime + " ns");

            // Iterative Timing
            long startIter = System.nanoTime();
            int iterResult = iterativeFib(n);
            long endIter = System.nanoTime();

            long iterativeTime = endIter - startIter;
            System.out.println("Iterative Result: " + iterResult);
            System.out.println("Iterative Time: " + iterativeTime + " ns");

            System.out.println("------------------------------------");
        }

        int largeN = 50;
        long start = System.nanoTime();
        int result = iterativeFib(largeN);
        long end = System.nanoTime();

        System.out.println();
        System.out.println("Fibonacci(" + largeN + ") using Iterative:");
        System.out.println("Result: " + result);
        System.out.println("Time: " + (end - start) + " ns");
	}

}
