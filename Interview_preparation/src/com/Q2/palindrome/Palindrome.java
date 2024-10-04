package com.Q2.palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
		System.out.println("Enter The Number: ");
		int Number = scanner.nextInt(); // Take the input from user

		int b = 0, c = Number;
		while (Number != 0) { // Loop until Number becomes 0
			int d = Number % 10; // Get the last digit of the Number
			b = b * 10 + d; // Build the reversed number
			Number /= 10; // Remove the last digit from Number
		}

		System.out.println(c == b ? "Palindrome" : "Not Palindrome"); // Output the result
		scanner.close(); // Close the scanner
	}
}
