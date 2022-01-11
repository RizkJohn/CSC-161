package chapter_7;

public class InitializeArrayWithRandomValues {

	public static void main(String[] args) {
		//create an int array
		int[] myDoubleArray = new int[5];
		
		//fill it with random values...
		for(int index = 0; index < myDoubleArray.length; index++) {
			myDoubleArray[index] = (int) (Math.random() * 10);
		}
		
		//let;s print the array
		for(int i = 0; i < myDoubleArray.length; i++) {
			System.out.println(myDoubleArray[i] + ",");
		}

	}

}
