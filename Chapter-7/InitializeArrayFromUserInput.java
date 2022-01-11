package chapter_7;
import java.util.*;
public class InitializeArrayFromUserInput {

	public static void main(String[] args) {
		//this app receives array values from user
		//and prints it after all
		Scanner input = new Scanner(System.in);
		
		//ask user the size of the array
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		
		int[] myIntArray = new int[size];
		
		//in a loop, which will loop by the length of the array
		//ask user an int value
		//insert that value into the array
		for(int i = 0; i < size; i++) {
			System.out.print("Enter a value for index value " + i + ": ");
			myIntArray[i] = input.nextInt();
		}
		
		System.out.println("Thank you for entering the values, here is what you entered:");
		//when it's done, print the whole array contents
		//example output: Array = [3, 4, 5, 6]
		
		System.out.print("Array = [");
		for (int j = 0; j < size; j++) {
			System.out.print(myIntArray[j] + " ");
		}
		System.out.print("]");

	}
	private static void printArray(int [] myArray) {
		for(int j = 0; j < myArray.length; j++) {
			System.out.print(myArray[j] + ",");
		}

}
}
