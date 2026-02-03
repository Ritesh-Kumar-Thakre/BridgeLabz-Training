package com.streamapiproblems.streamapi.filteringexpiringmemberships;

import java.time.LocalDate;

public class Membership {
	protected String name;
	protected String type;
	protected double amount;
	protected LocalDate startDate;

	public Membership(String name, String type, double amount, LocalDate startDate) {
		this.name = name;
		this.type = type;
		this.amount = amount;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return name + " | Membership type: " + type + " | Amount: " + amount + " | Starting date: " + startDate;
	}

}
