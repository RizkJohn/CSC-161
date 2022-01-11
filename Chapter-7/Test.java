package chapter_7;

public class Test {

	public static void main(String[] args) {
		
		//create a new int array named values, size is 5
		int[] values = new int[5]; //index values: 0,1,2,3,4: last index = length - 1
		
		//going into a loop
		for(int i =  1; i < 5; i++) {
			values[i] = i + values[i-1]; //a random function to calculate each value...
		}
		
		values[0] = values[1] + values[4];
		
		printArray(values);

	}
	
	private static void printArray(int [] myArray) {
		for(int j = 0; j < myArray.length; j++) {
			System.out.print(myArray[j] + ", ");
		}
	}

}
