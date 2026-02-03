package com.streamapiproblems.streamapi.insuranceclaimanalysis;

import java.time.LocalDate;

public class Claim {
	protected String claimHolder;
	protected double claimAmount;
	protected LocalDate claimDate;
	protected String claimType;

	public Claim(String claimHolder, double claimAmount, LocalDate claimDate, String claimType) {
		this.claimHolder = claimHolder;
		this.claimAmount = claimAmount;
		this.claimDate = claimDate;
		this.claimType = claimType;
	}

	public String getClaimType() {
		return claimType;
	}

	public double getClaimAmount() {
		return claimAmount;
	}
}
