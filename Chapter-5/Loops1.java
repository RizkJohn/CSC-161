package chapter_5;

public class Loops1 {

	public static void main(String[] args) {
		
		//convert a decimal value to hex value
		
		//25 lines of code for a single digit conversion...
		
		//45AB6F = 6 digits... 6 x 25 = 150 lines would be required...
		
		//Loop for 25 lines: total is just 26!!! loop 6 times... 100 digits???!!! 26 x 100
		
		//types of loops:
		//1. if you know how many times you want to loop.
		//2. depending on a condition, just loop, and break the loop when the condition is false...
		
		//print the text 100 times using FOR loop
		int counter = 100;
		for (int i = 0; i < counter; i++) {
			System.out.println(i + ". Welcome to Mars!");
		}
		
		System.out.println("*****************************");
		
		//print the text 100 times using WHILE loop
		int watchDog = 0;
		while (watchDog < 100) {
			System.out.println(watchDog + ". Welcome to Mars!");
			watchDog = watchDog + 1;
		}

	}

}
