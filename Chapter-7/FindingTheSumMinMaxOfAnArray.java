package chapter_7;
import java.util.*;
public class FindingTheSumMinMaxOfAnArray {

	public static void main(String[] args) {
		//ask user the size of the array
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		
		int [] intArray = new int[size];
		
		//read the values from keyboard (user)
		for(int i = 0; i < size; i++) {
			System.out.print("Enter the value for index " + i + ": ");
			intArray[i] = input.nextInt();
		}
		
		//calculate and print the min value
		//calculate and print the max value
		//calculate and print the average value
		int min = intArray[0]; 
		int max = intArray[0];
		int sum = 0;
		double average;
		
		for(int j = 0; j < size; j++) {
			if(intArray[j] < min) {
				min = intArray[j];
			}
			
			if(intArray[j] > max) {
				max = intArray[j];
			}
			
			sum += intArray[j];
		}
		
		//min, max, sum calculated now...
		average = sum / size;
		
		//print the results
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + average);
		System.out.println("Sum: " + sum);
		

	}

}
