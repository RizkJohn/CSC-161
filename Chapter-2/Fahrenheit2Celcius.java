package chapter_2;

import java.util.Scanner;

public class Fahrenheit2Celcius {

	public static void main(String[] args) {
		
		//this application converts fahrenheit to celsius
		double fahrenheit;
		double celsius;
		
		//lets make this application interactive!
		Scanner keyboard = new Scanner(System.in);
		
		//tell the user to enter a fahrenheit value from keyboard
		System.out.print("Please enter a fahrenheit value: ");
		
		//now, read it from the keyboard
		fahrenheit = keyboard.nextDouble();
		
		//calculate celsius value using the formulap
		celsius = (5.0 / 9) * (fahrenheit - 32);
		
		//show the user the result...
		System.out.println(fahrenheit + "F = " + celsius + "C" );
		
		
	}

}
