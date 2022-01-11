package chapter_3;

import java.util.Scanner;

public class DivisionTest {

	public static void main(String[] args) {
		/*
		 * Here is a program that checks whether a number is divisible by 2 and 3,
		 * whether a number is divisible by 2 or 3, and whether a number is divisible by
		 * 2 or 3 but not both
		 */

		// ask user to enter an integer value: userNumber
		System.out.print("Please enter an integer number: ");
		Scanner keyboard = new Scanner(System.in);
		int userNumber = keyboard.nextInt();

		// divide userNumber by 2, and 3, if BOTH remainder is 0, then print success
		// message: AND
		int remainderOf2 = userNumber % 2;
		int remainderOf3 = userNumber % 3;
		if (remainderOf2 == 0 && remainderOf3 == 0) {
			System.out.println(userNumber + " is divisible by BOTH 2 and 3");
		}

		// divide userNumber by 2, and 3, if ANY remainder is 0, then print success
		// message: OR
		if (remainderOf2 == 0 || remainderOf3 == 0) {
			System.out.println(userNumber + " is divisible by EITHER 2 OR 3");
		}

		// divide userNumber by 2, and 3, if ANY remainder is 0 BUT not both at the same
		// time,
		// then print success message: XOR
		if (remainderOf2 == 0 ^ remainderOf3 == 0) {
			System.out.println(userNumber + " is divisible by EITHER 2 OR 3, BUT not both");
		}
		keyboard.close();
	}

}
