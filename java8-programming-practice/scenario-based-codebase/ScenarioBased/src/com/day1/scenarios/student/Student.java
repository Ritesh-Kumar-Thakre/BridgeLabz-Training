package com.day1.scenarios.student;

import java.util.Optional;

public class Student {
	private String name;
	private String email;
	private String phone;
	private String address;
	private String nickname;

	public Student(String name, String email, String phone, String address, String nickname) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.nickname = nickname;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	public Optional<String> getPhone() {
		return Optional.ofNullable(phone);
	}

	public Optional<String> getAddress() {
		return Optional.ofNullable(address);
	}

	public Optional<String> getNickname() {
		return Optional.ofNullable(nickname);
	}

	public String getName() {
		return name;
	}
}