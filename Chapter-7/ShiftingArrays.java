package chapter_7;

public class ShiftingArrays {

	public static void main(String[] args) {
		// shifting the contents of an array
		int [] intArray = {10, 20, 30, 40, 50}; //declare and initialize an array
		
		System.out.println("Before shifting: ");
		printArray(intArray);
		  
		int temp = intArray[0]; //keep this value, because we cannot shift this one backwards...
		
		for(int j = 0; j < 3; j++) {
			for(int i = 1; i < intArray.length; i++) {
				intArray [i - 1] = intArray[i];
			}
		
		intArray[intArray.length - 1] = temp;
		
		System.out.println();
		System.out.println("After shifting: ");
		printArray(intArray);
		}
	}
	
	private static void printArray(int [] myArray) {
		for(int j = 0; j < myArray.length; j++) {
			System.out.print(myArray[j] + ", ");
		}
		
	}

}
