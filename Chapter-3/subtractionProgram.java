package chapter_3;

import java.util.Scanner;

public class subtractionProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random() * 2);
		int number2 = (int) (Math.random() * 20);

		// if number1 < number2, swap them
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		// prompt the student to answer what is number 1 - number 2
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		int answer = input.nextInt();
		if (answer == number1 - number2) {
			System.out.print("You are correct!");
		} else {
			System.out.print("You are incorrect.\n" + number1 + " - " + number2 + " is " + (number1 - number2));
		}
		input.close();
	}

}
