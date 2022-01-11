package chapter_3;

import java.util.*;

public class SwitchExample {

	public static void main(String[] args) {
		// ask user to enter day of the week
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the day of week: ");

		// store the value in variable, dayOfWeek
		String dayOfWeek = keyboard.next();
		System.out.println("You entered: " + dayOfWeek);

		// depending on the day value, print the relevant predefined task for the
		// user...
		switch (dayOfWeek) {
		case "Monday":
			System.out.println("Today is Monday, go to the doctor, you have an appointment");
			break;
		case "Tuesday":
			System.out.println("Buy cat food...");
			break;
		case "Wednesday":
			System.out.println("do the test");
			break;
		case "Thursday":
			System.out.println("replace broken window");
			break;
		case "Friday":
			System.out.println("go to gym");
			break;
		case "Saturday":
			System.out.println("picnic!");
			break;
		case "Sunday":
			System.out.println("relax...");
			break;
		default:
			System.out.println("What did you just say? invalid!");
		}
		keyboard.close();

	}

}
