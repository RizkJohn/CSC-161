package chapter_3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		/*
		 * 
		 */

		// ask user to enter a two digit number

		// if (userNumber >= 0 && userNumber <= 99)

		// generate a random 2 digit integer value, randomNumber
		System.out.print("Please enter a two digit integer number: ");
		Scanner input = new Scanner(System.in);
		int userNumber = input.nextInt();

		int randomNumber = (int) (Math.random() * 1000);
		System.out.println(userNumber + " ; " + randomNumber);

		int userDigitHundreds = (int) (userNumber / 100);
		int userDigitTens = ((int) (userNumber / 10)) % 10;
		int userDigitOnes = userNumber % 10;
		int randomDigitHundreds = (int) (randomNumber / 100);
		int randomDigitTens = ((int) (randomNumber / 10)) % 10;
		int randomDigitOnes = randomNumber % 10;

		// State1: just compare the userNumber with randomNumber, if success, $10,000!!!
		if (userNumber == randomNumber) {
			System.out.println("Wow! you just won $10,000!!! Congratulations!!");
		} else if ((userDigitHundreds == randomDigitHundreds && userDigitTens == randomDigitOnes
				&& userDigitOnes == randomDigitTens)
				|| (userDigitHundreds == randomDigitOnes && userDigitTens == randomDigitTens
						&& userDigitOnes == randomDigitHundreds)
				|| (userDigitHundreds == randomDigitTens && userDigitTens == randomDigitHundreds
						&& userDigitOnes == randomDigitOnes)
				|| (userDigitHundreds == randomDigitTens && userDigitTens == randomDigitOnes
						&& userDigitOnes == randomDigitHundreds)
				|| (userDigitHundreds == randomDigitOnes && userDigitTens == randomDigitHundreds
						&& userDigitOnes == randomDigitTens)) {
			System.out.println("You won $3,000!!! Congratulations!! Not bad");
		} else if (userDigitHundreds == randomDigitHundreds || userDigitHundreds == randomDigitTens
				|| userDigitHundreds == randomDigitOnes || userDigitTens == randomDigitHundreds
				|| userDigitTens == randomDigitTens || userDigitTens == randomDigitOnes
				|| userDigitOnes == randomDigitHundreds || userDigitOnes == randomDigitOnes
				|| userDigitOnes == randomDigitTens) {
			System.out.println("You won $1,000!!! One digit mathces! Congratulations!!");
		} else {
			System.out.print("Sorry, not a winner :(");
		}
		input.close();

	}

}
