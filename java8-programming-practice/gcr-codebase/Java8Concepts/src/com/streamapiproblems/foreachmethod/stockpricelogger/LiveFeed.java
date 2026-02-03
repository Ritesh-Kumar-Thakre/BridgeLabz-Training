package com.streamapiproblems.foreachmethod.stockpricelogger;

import java.util.*;

public class LiveFeed {
	public static void main(String[] args) {
		Stock s1 = new Stock("Tata", 200);
		Stock s2 = new Stock("Capgemini", 220);
		Stock s3 = new Stock("Google", 500);
		Stock s4 = new Stock("SpaceX", 490);
		Stock s5 = new Stock("ZOHO", 150);

		List<Stock> stocks = Arrays.asList(s1, s2, s3, s4, s5);
		stocks.stream().forEach(System.out::println);

	}
}
