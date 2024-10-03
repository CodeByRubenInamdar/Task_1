package com.Q5.sorting;

import java.util.Scanner;

public class bubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Elements: ");
		int n = scanner.nextInt();

		System.out.println("Enter " + n + " Elements");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) { // Store current element
					int temp = arr[j]; // Swap elements
					arr[j] = arr[j + 1]; // Swap with the next element
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		scanner.close();
	}
}
