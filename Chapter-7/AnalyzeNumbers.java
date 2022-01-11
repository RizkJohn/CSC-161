package chapter_7;
import java.util.*;
public class AnalyzeNumbers {

	public static void main(String[] args) {
		
		//Read one hundred numbers, compute their average
		//Find out how many numbers are above the average
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter how many numbers you want to work with: ");
		int numbers = input.nextInt();
		
		//create an array of 100 random numbers
		int [] values = new int[numbers];
		
		int sum = 0; //to use to calculate the average after all...
		//assuming we need values between 0 and 100
		//Math.random() will generate values 0.0-1.0
		for(int i = 0; i < values.length; i++) {
			values[i] = (int)(Math.random() * numbers);
			//System.out.println(values[i]);
			//sum = sum + values[i];
			sum += values[i];
		}
		
			
		//calculate the average
		double average = sum / 100;
		System.out.println("average is " + average);
		
		//check each value if it is over the average
		int numberOfAboveAverageItems = 0;
		int numberOfBelowAverageItems = 0;
		
		for(int item : values) {
			if (item > average) {
				//System.out.println(item + " is above the average");
				numberOfAboveAverageItems++;
			}else {
				//System.out.println(item + " is below the average");
				numberOfBelowAverageItems++;
			}
		}
		
		//print the number of items below and over the average
		System.out.println("Above Average Items: " + numberOfAboveAverageItems);
		System.out.println("Below Average Items: " + numberOfBelowAverageItems);

	}

}
