package com.algorithmanalysis.searchperformance;

import java.io.*;

public class LargeFileReading {

	private static final String FILE_PATH = "largefile.txt";
	
	private static long readUsingFileReader(String path) {
        long startTime = System.nanoTime();

        try (FileReader fr = new FileReader(path)) {
            while (fr.read() != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
	
	private static long readUsingInputStreamReader(String path) {
        long startTime = System.nanoTime();

        try (InputStreamReader isr =
                     new InputStreamReader(new FileInputStream(path))) {

            char[] buffer = new char[8192]; // buffer improves speed
            while (isr.read(buffer) != -1) {
                // Reading in chunks
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Reading file using FileReader.......");
		 long fileReaderTime = readUsingFileReader(FILE_PATH);
		 System.out.println("FileReader Time: " + fileReaderTime + " ns");
		 System.out.println();

		 System.out.println("Reading file using InputStreamReader......");
		 long inputStreamReaderTime = readUsingInputStreamReader(FILE_PATH);
		 System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ns");
	}

}
