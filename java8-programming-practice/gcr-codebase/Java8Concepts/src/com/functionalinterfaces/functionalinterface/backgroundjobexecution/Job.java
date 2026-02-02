package com.functionalinterfaces.functionalinterface.backgroundjobexecution;

public class Job {
	public static void main(String[] args) {
		int limit = 20;
		String str = "Useing Runnable Functional Interface";
		if (str.length() > limit) {
			System.out.println("Limit exceeds");
		} else {
			System.out.println("Still have space");
		}
		Runnable run = () -> System.out.println("Runing Runnable");
		Thread thread = new Thread(run);
		thread.start();
	}
}
