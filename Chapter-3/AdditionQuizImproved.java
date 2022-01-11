package chapter_3;

import java.util.*;

public class AdditionQuizImproved {

	public static void main(String[] args) {
		// generate two random values
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		// ask user to enter the sum value
		System.out.print(number1 + " + " + number2 + " = ? ");
		Scanner keyboard = new Scanner(System.in);
		int answer = keyboard.nextInt();

		// check the value if it is correct or not...
		if (answer == (number1 + number2)) {
			System.out.print("Correct, God job!");
		} else {
			System.out.print("Wrong! the correct answer is " + (number1 + number2));
		}
		keyboard.close();
	}

}
