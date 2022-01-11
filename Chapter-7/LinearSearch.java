package chapter_7;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		int size = 5;
		String [] lastName = new String[3];
		Scanner in = new Scanner(System.in);
		System.out.print("How many items you want to enter (max: " + size + "): ");
		int items = in.nextInt();
		
		for (int i = 0; i < items; i++) {
			enterNewItem(lastName);
		}
		
	
		printArray(lastName);
		
		int result = linearSearch(lastName);
		System.out.println("The item found at index " + result);

	}
	
	//a method to enter an entry into the array
	private static void enterNewItem(String [] inputArray) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a last name: ");
		String lastName = input.next();
		//find the first empty location in the array
		int emptyLocationIndex = -1;
		for (int i = 0; i < inputArray.length; i++) {
			if( inputArray[i] == null) {
				emptyLocationIndex = i;
				break;
			}
		}
		inputArray[emptyLocationIndex] = lastName;
	}
	
	//a method to search for an entry it will search the array using linear search,
	//
	private static int linearSearch(String [] inputArray) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a last name to search in the list: ");
		String targetLastName = input.next();
		for(int i = 0; i < inputArray.length; i++) {
			if (targetLastName.equalsIgnoreCase(inputArray[i])) {
				return i;
			}
		}
		return -1;
	}
	
	//a method to search for an entry
	
	//print the array contents
	private static void printArray(String [] inputArray) {
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
			
		}
	}
	//binary search
	

}
