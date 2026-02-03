package com.streamapiproblems.streamapi.hospitaldoctoravailability;

public class Doctor {
	protected String name;
	protected boolean availableWeekends;
	protected int specialty;

	public Doctor(String name, boolean availableWeekends, int specialty) {
		this.name = name;
		this.availableWeekends = availableWeekends;
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "Doctor: " + name + " | Specialty rating: " + specialty + " | Available on Weekends: "
				+ availableWeekends;
	}

}
