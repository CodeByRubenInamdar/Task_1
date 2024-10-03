package com.Q6.string;

public class wordCheck {
	public static void main(String[] args) {
		String sentence = "Welcome to the pune city";

		System.out.println("Sentence: " + sentence);

		// words count
		String[] words = sentence.split("\\s+");
		int wordCount = words.length;
		System.out.println("Number of Words: " + wordCount);

		// vowels counts

		int a = 0; // a=vowels counts
		for (char c : sentence.toLowerCase().toCharArray()) {
			if ("aeoui".indexOf(c) != -1) {
				a++;
			}
		}
		System.out.println("Number of vowels: " + a);
		System.out.println("Vowels Found : a e o u i ");
	}

}
