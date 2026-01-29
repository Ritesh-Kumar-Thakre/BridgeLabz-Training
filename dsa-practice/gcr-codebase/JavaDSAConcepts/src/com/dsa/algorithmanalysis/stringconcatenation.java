package com.algorithmanalysis.searchperformance;

public class stringconcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sizes = {1000, 10000, 100000}; 

        for (int size : sizes) {
            System.out.println("Operation Count: " + size);

            // String On^2
            long start = System.nanoTime();

            String str = "";
            for (int i = 0; i < size; i++) {
                str = str + "a";
            }

            long end = System.nanoTime();
            System.out.println("String Time: " + (end - start) + " ns");


            // String Builder O(n)
            start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append("a");
            }
            end = System.nanoTime();
            System.out.println("StringBuilder Time: " + (end - start) + " ns");


            //String Buffer O(N)
            start = System.nanoTime();
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < size; i++) {
                sbf.append("a");
            }
            end = System.nanoTime();
            System.out.println("StringBuffer Time: " + (end - start) + " ns");

            System.out.println("------------------------------------");
        }
	}

}
