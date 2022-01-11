package chapter_7;

public class CopyingArrays {

	public static void main(String[] args) {
		
		int [] arrA = {45, 78, 99, 13, 34};
		
		printArray(arrA);
		System.out.println("\n*************************");
		
		
		//if the array is full, then copy its contents to a larger array
		int[] arrB = new int[3];
		arrB[0] = 5;
		arrB[1] = 6;
		arrB[2] = 7;
		printArray(arrB);
		System.out.println("arrB is full? " + isFull(arrB));
		
		//now, copy this array into a larger array
		int [] larger = copy(arrB); //larger array is a copy of arrB, but larger
		printArray(larger);
		System.out.println("larger array is full? " + isFull(larger));

	}
	
	//create a method named copy that takes an int array
	//copies the content of the array into a larger one, and returns a reference to a larger array
	
	private static int[] copy(int[] original) {
		int[] target = new int[original.length + 10];
		
		for(int i = 0; i < original.length; i++) {
			//walk through the array
			target[i] = original[i];
		}
		return null;
	}
	
	private static boolean isFull(int[] original) {
		if (original[original.length - 1] == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	private static void printArray(int [] myArray) {
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + ",");
		}
	}

}
