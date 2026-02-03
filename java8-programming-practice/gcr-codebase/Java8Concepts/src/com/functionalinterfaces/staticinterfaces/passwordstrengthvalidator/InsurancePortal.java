package com.functionalinterfaces.staticinterfaces.passwordstrengthvalidator;

public class InsurancePortal {
	public static void main(String[] args) {
		String pass = "Pass@123";
		boolean check = StrengthValidator.securityUtils(pass);
		if (check) {
			System.out.println("Strong pass");
		} else {
			System.out.println("Weak pass");
		}
	}
}
