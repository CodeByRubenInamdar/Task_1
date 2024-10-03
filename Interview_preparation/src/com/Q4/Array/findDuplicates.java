package com.Q4.Array;

import java.util.Scanner;

public class findDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements: ");
		int n = sc.nextInt();        // Inputs array elements

		System.out.println("Enter " + n + " Numbers: ");

		int Numbers[] = new int[n];  // Declare an array to store element

		for (int i = 0; i < n; i++) {
			Numbers[i] = sc.nextInt();
		}

		System.out.println("Duplicates Elements are: ");

		for (int i = 0; i < n; i++) {               // for loop for find duplicate elements
			for (int j = i + 1; j < n; j++) {
				if (Numbers[i] == Numbers[j]) {
					System.out.println(Numbers[i]); // to print duplicate
				}
			}
		}
		sc.close(); // close the scanner
	}

}
