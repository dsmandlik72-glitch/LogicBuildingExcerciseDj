package com.question1;

public class StrongPasswordValidator {

	public static void main(String[] args) {
		String password = "Password@123";

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialChar = false;

        if (password.length() >= 8) {

            for (char chValue : password.toCharArray()) {

                if (Character.isDigit(chValue)) {
                    isDigit = true;
                }
                else if (Character.isUpperCase(chValue)) {
                    isUpperCase = true;
                }
                else if (Character.isLowerCase(chValue)) {
                    isLowerCase = true;
                }
                else if (!Character.isLetterOrDigit(chValue)) {
                    isSpecialChar = true;
                }
            }

            if (isDigit && isLowerCase && isUpperCase && isSpecialChar) {
                System.out.println("Given Password is Strong");
            }
            else {
                System.out.println("Invalid Password");
            }

        }
        else {
            System.out.println("Password length should be at least 8 characters.");
        }
    }
}