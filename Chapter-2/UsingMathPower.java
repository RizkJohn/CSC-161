package chapter_2;
import java.util.Scanner;

public class UsingMathPower {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the first number :");
		firstNumber = keyboard.nextInt();
		
		System.out.print("Please enter the second number :");
		secondNumber = keyboard.nextInt();
		
		System.out.println(firstNumber + "^" + secondNumber + " = " + Math.pow(firstNumber, secondNumber));
		

	}

}
