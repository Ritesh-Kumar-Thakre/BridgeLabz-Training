package com.streamapiproblems.foreachmethod.stockpricelogger;

public class Stock {
	protected String name;
	protected double price;

	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " | Price: " + price;
	}
}
