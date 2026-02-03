package com.functionalinterfaces.staticinterfaces.passwordstrengthvalidator;

public interface StrengthValidator {
	static boolean securityUtils(String pass) {
		if (pass.length() < 8) {
			return false;
		}
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean check4 = false;
		boolean check5 = false;
		for (char ch : pass.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				check1 = true;
			}

			if (Character.isDigit(ch)) {
				check2 = true;
			}

			if (!Character.isLetterOrDigit(ch)) {
				check3 = true;
			}

			if (Character.isLowerCase(ch)) {
				check4 = true;
			}

			if (Character.isUpperCase(ch)) {
				check5 = true;
			}
		}
		if (check1 && check2 && check3 && check4 && check5) {
			return true;
		}
		return false;
	}
}
