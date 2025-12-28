package com.bridgelabz.oops.constructor.levelone;

public class Book {
	public static void main(String [] args) {
		// default constructor
		BookDetails detail= new BookDetails();
		System.out.println("default constructor details");
		detail.printDetails();
		// parameterized constructor
		System.out.println("\nparameterized constructor details");
		BookDetails details2=new BookDetails("Java","jafry",400.34);
		details2.printDetails();
	}
}