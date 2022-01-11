package chapter_3;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// first generate two random integer values.
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 10 % 10);

		// print the values on the screen, and ask the user to find the sum
		System.out.println("What is " + number1 + " + " + number2 + "?");

		// read user's response from keyboard
		Scanner input = new Scanner(System.in);
		int answer;
		answer = input.nextInt();

		// print out the result
		if (answer == (number1 + number2)) {
			System.out.println("Correct! Good Job!");
		} else {
			System.out.println("Wrong, " + number1 + " + " + number2 + " = " + (number1 + number2));
		}
		input.close();
	}

}
