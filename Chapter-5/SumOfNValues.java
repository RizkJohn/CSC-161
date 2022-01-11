package chapter_5;
import java.util.*;
public class SumOfNValues {

	public static void main(String[] args) {
		//calculate the sum of first N numbers...
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to add together: ");
		double n = input.nextInt();
		double sum = 0;
		
		long startTime = 0;
		
		//for this loop time and space complexity is n
		for(double i = 0; i <= n; i++) {
			startTime = System.currentTimeMillis();
			sum = sum + i;
			System.out.println(i);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println("Sum of first " + n + " values is " + (n * (n + 1))/2 );
		System.out.println("Time spent: " + (stopTime - startTime) / 1000);
	}

}
