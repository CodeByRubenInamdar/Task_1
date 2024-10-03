package com.Q6.string;

public class sentence {
	public static void main(String[] args) {
		String sentence = "Ruben Doing training";
		System.out.println("Original Sentence: " + sentence);

		String[] words = sentence.split("\\s+"); // Split the sentence into words
		StringBuilder newsentence = new StringBuilder();

		if (words.length > 0) {
			newsentence.append(words[0].toLowerCase()); // First word in lowercase
		}

		if (words.length > 1) {
			newsentence.append(" ").append(words[1].toLowerCase()); // Second word in lowercase
		}

		if (words.length > 2) {
			newsentence.append(" ").append(firstInUpperCase(words[2])); // Capitalize the third word
		}

		System.out.println("New Sentence: " + newsentence);
	}

	private static String firstInUpperCase(String word) {
		if (word.length() == 0)
			return word;
		return Character.toUpperCase(word.charAt(0)) + word.substring(1); // Capitalize the first letter
	}
}
