package chapter_2;
import java.util.Scanner;

public class CalculateTime {

	public static void main(String[] args) {
		
		//int seconds, hours, minutes;
		int seconds;
		int hours;
		int minutes;
		int remainingSeconds;
		
		Scanner kyb = new Scanner(System.in);
		
		//step 1: ask user the seconds value to conver to minutes
		System.out.print("Enter the seconds in integer: ");
		seconds = kyb.nextInt();
		
		//step 2: divide by 60*60 to find hours...
		hours = seconds / (60 * 60);
		
		//step 3: divide by 60 to find minutes...
		minutes = seconds / 60;
		
		//step 4: find the remaining seconds...
		remainingSeconds = seconds % 60;
		
		//step 5: print out the result..
		System.out.println(seconds + " seconds is " + hours + " hours.");
		System.out.println(seconds + " seconds is " + minutes + " minutes.");
		System.out.println(seconds + " and the remaining seconds is " + remainingSeconds);
	}

}
