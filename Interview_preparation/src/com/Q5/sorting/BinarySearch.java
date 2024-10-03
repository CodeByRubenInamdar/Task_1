package com.Q5.sorting;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		// enter sorted numbers
		System.out.println("Enter sorted numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt(); // array with user input
		}
		System.out.print("Enter number to search: ");
		int target = scanner.nextInt(); // Read the target number to search

		int index = binarySearch(arr, target);

		// Display the result
		System.out.println(index == -1 ? "Element not found." : "Element found at index: " + index);
		scanner.close(); //
	}

	// Method to perform binary search on a sorted array
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1; // End index

		while (left <= right) {
			int mid = left + (right - left) / 2; // Find the middle index

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] < target) {
				left = mid + 1; // Move the left pointer to mid + 1
			} else {

				right = mid - 1; // Move the right pointer to mid - 1
			}
		}

		return -1;
	}
}
