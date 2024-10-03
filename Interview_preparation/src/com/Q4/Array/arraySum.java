package com.Q4.Array;

import java.util.Scanner;

public class arraySum {
	public static void main(String[] args) {
		// int[] numbers = { 10, 20, 30, 40, 50, 50, 70 }; // Define The Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Elements of array: ");
		int n = sc.nextInt();                      //taking from user
		
		System.out.println("Enter " + n + " Number: ");
		int numbers[] = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();           //list of array
		}
		
		int sum = 0;
		for (int number : numbers) {
			sum += number; // add current element to the sum
		}

		System.out.println("Sum of array Elemnts: " + sum); // displaying the sum
		sc.close();
	}

}
