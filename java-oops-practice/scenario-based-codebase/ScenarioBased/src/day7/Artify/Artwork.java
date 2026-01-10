package day7.Artify;

import java.util.Scanner;

public class Artwork implements IPurchasable {
	protected String title;
	protected String artist;
	protected double price;
	protected String licenseType;
	
	public Artwork(String title,String artist,double price,String licenseType) {
		this.title=title;
		this.artist=artist;
		this.price=price;
		this.licenseType=licenseType;
	}
	
	@Override
	public void purchase(double price,double walletBalance) {
		System.out.println("Money dudected");
		double p = walletBalance-=price;
		System.out.println("Updated Balance: "+p);
		System.out.println();
	}

	@Override
	public void license() {
		Scanner sc = new Scanner(System.in);
		System.out.println("License Type "+licenseType);
		System.out.println("Click here for terms and conditions: 🖇️");
		System.out.println("If ok with terms then type yes or no: ");
		String choise = sc.next();
		if(choise.equalsIgnoreCase("yes")) {
			System.out.println("License transfered");
		}else {
			System.out.println("License not transfered");
		}
	}
	
	public void display() {
		System.out.println("Title: "+title);
		System.out.println("Artist: "+artist);
		System.out.println("Price: "+price);
		System.out.println("License Type: "+licenseType);
	}

}
