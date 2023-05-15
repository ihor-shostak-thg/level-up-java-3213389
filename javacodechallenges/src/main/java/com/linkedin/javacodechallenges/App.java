package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        if (password.length() < 6) return false;
        
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (c >= 48 && c <= 57) hasNumber = true;
            if (c >= 97 && c <= 122) hasLower = true;
            if (c >= 65 && c <= 90) hasUpper = true;
        }
         
        return hasUpper && hasLower && hasNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
