package chapter_3;

import java.util.*;

public class ChineseZodiacWithIf {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to enter a year and displays the animal
		 * for the year. 0: monkey 1: rooster 2: dog 3: pig 4: rat 5: ox 6: tiger 7:
		 * rabbit 8: dragon 9: snake 10: horse 11: sheep
		 */

		// ask user to enter year value
		System.out.print("Please enter the year value: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();

		// find animal for that particular year
		if (year % 12 == 0) {
			System.out.println("monkey");
		} else if (year % 12 == 1) {
			System.out.println("rooster");
		} else if (year % 12 == 2) {
			System.out.println("dog");
		} else if (year % 12 == 3) {
			System.out.println("pig");
		} else if (year % 12 == 4) {
			System.out.println("rat");
		} else if (year % 12 == 5) {
			System.out.println("ox");
		} else if (year % 12 == 6) {
			System.out.println("tiger");
		} else if (year % 12 == 7) {
			System.out.println("rabbit");
		} else if (year % 12 == 8) {
			System.out.println("dragon");
		} else if (year % 12 == 9) {
			System.out.println("snake");
		} else if (year % 12 == 10) {
			System.out.println("horse");
		} else if (year % 12 == 11) {
			System.out.println("sheep");
		}
		input.close();
	}

}
