package chapter_4;

import java.util.*;

public class SomeStringMethods {

	public static void main(String[] args) {
		// get user input, just a word...
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word/phrase: ");

		String userInput = input.nextLine(); // next() for single word, nextLine() for multiple words

		System.out.println(userInput + " was entered");

		int stringLength = userInput.length();
		System.out.println(userInput + "'s length is " + stringLength);

		String allUpperCase = userInput.toUpperCase();
		System.out.println("all UPPER case: " + allUpperCase);

		String allLowerCase = userInput.toLowerCase();
		System.out.println("all lower case: " + allLowerCase);

		// find first two and last two symbols
		char firstLetter = userInput.charAt(0);
		char secondLetter = userInput.charAt(1);
		char lastLetter = userInput.charAt(stringLength - 1);
		char prevLetter = userInput.charAt(stringLength - 2);

		System.out.println("First letter: " + firstLetter);
		System.out.println("Second letter: " + secondLetter);
		System.out.println("Previous letter: " + prevLetter);
		System.out.println("Last letter: " + lastLetter);

		input.close();
	}

}
