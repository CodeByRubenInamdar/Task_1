package com.Q3.Neon;

import java.util.Scanner;

public class neonNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int Number = scanner.nextInt(); 	// input from user

		int square = Number * Number;
		int a = 0; 						// sum of digit

		while (square != 0) {
			int b = square % 10; 	// last digit of square
			a += b;               	// add digit to the sum
			square /= 10; 			// remove the last digit from square
		}
		System.out.println(Number == a ? "Neon Number" : "Not Neon Number");
		scanner.close();
	}
}
     