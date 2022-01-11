package chapter_2;
import java.util.*;

public class Adder {

	public static void main(String[] args) {
		
		//this program calculates the sum of two integer values
		int firstNumber;
		int secondNumber;
		int sum;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		firstNumber = keyboard.nextInt();
		//System.out.println("First number entered: " + firstNumber);
		
		System.out.print("Enter the second integer: ");
		secondNumber = keyboard.nextInt();
		//System.out.println("Second number entered: " + secondNumber);
		
		sum = firstNumber + secondNumber;
		
		//print the result...
		System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		
		
		
	}

}
