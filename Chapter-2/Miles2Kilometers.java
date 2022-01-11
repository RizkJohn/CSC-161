package chapter_2;

import java.util.Scanner;

public class Miles2Kilometers {

	public static void main(String[] args) {
		
		//declare the variables
		double mile;
		double kilometer;
		
		//get the mile value from user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter mile value: ");
		mile = keyboard.nextDouble();
		
		//calculate the km value
		kilometer = 1.6 * mile;
		
		//print the result for the user!
		System.out.println(mile + " miles = " + kilometer + " km");
		

	}

}
