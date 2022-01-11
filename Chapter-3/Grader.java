package chapter_3;

import java.util.*;

public class Grader {

	public static void main(String[] args) {
		// ask user to enter a score value
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your score? ");
		int score = keyboard.nextInt();

		// if the score is above 85, student receives an A
		// if it is between 60-85, it's a B
		// if it is between 50-60, it's a C
		// for all others, it's an F
		String grade;
		if (score >= 0 & score <= 100) {
			if (score >= 85) {
				grade = "A";
			} else if (score >= 60 && score < 85) {
				grade = "B";
			} else if (score >= 50 && score < 60) {
				grade = "C";
			} else {
				grade = "F";
			}
			System.out.println("Your grade is " + grade);
		} else {
			System.out.println("Not a valid score");
		}
		keyboard.close();
	}

}
