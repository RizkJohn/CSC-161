package chapter_7;

public class PassByValuePrimitiveDataType {

	public static void main(String[] args) {
		
		int firstNumber = 10;
		int secondNumber = 20;
		int result = sumOfInts(firstNumber, secondNumber);
		System.out.println(firstNumber + ";" + secondNumber);
		System.out.println(result);
		
		int result2 = weirdMethod(firstNumber, secondNumber);
		System.out.println("result 2: " + result2);
		System.out.println(firstNumber + ";" + secondNumber);

	}
	
	//design a method which takes two integers, and returns the sum
	public static int sumOfInts(int a, int b) {
		return (a + b);
	}
	
	//when we pass primitive data type values to methods
	private static int weirdMethod(int a, int b) {
		a = 10 * a;
		b = 10 * b;
		return (a + b);
	}

}
