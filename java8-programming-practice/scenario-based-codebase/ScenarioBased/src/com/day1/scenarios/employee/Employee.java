package com.day1.scenarios.employee;

import java.util.Optional;

public class Employee {
	private String name;
	private Manager manager;
	private Double bonus;
	private String middleName;
	private String insuranceNo;

	public Employee(String name, Manager manager, Double bonus, String middleName, String insuranceNo) {
		this.name = name;
		this.manager = manager;
		this.bonus = bonus;
		this.middleName = middleName;
		this.insuranceNo = insuranceNo;
	}

	public Optional<Manager> getManager() {
		return Optional.ofNullable(manager);
	}

	public Optional<Double> getBonus() {
		return Optional.ofNullable(bonus);
	}

	public Optional<String> getMiddleName() {
		return Optional.ofNullable(middleName);
	}

	public Optional<String> getInsuranceNo() {
		return Optional.ofNullable(insuranceNo);
	}

	public String getName() {
		return name;
	}
}