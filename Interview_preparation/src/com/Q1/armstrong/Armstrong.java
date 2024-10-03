package com.Q1.armstrong;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");    //153 (1)3 + (5)3 + (3)3 = 1+125+27  = 153
		int Number = scanner.nextInt();

		int b = Number, c = 0;
		while (b > 0) {                               //using a while loop
			int d = b % 10;
			c += d * d * d;
			b = b / 10;
		}
		if (c == Number) {
			System.out.println("Armstrong");           //use conditional statement checking the number
		} else {
			System.out.println("Not Armstrong");
		}
		scanner.close();
	}

}
