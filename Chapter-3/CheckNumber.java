package chapter_3;

import java.util.*;

public class CheckNumber {

	public static void main(String[] args) {
		// ask user to enter an integer value
		System.out.print("Please enter an integer value: ");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();

		System.out.println("You entered: " + number);

		if (number % 5 == 0) {
			System.out.println("HiFive");
		}
		if (number % 2 == 0) {
			System.out.println("HiEven");
		}
		keyboard.close();
	}

}
