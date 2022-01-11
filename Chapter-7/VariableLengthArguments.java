package chapter_7;

public class VariableLengthArguments {

	public static void main(String[] args) {
		
		printMaxValue(3, 6 ,10);
		printMaxValue(30 , 100, 60);

	}
	
	//you can use variable number of parameters for a method
	
	//find the maximum value from passed set of values...
	private static void printMaxValue(int ... numbers) {
		//those ... are actually an array!
		int max = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("The max value is " + max);
	}

}
