package chapter_6;

public class FirstMethod {

	public static void main(String[] args) {
		System.out.println("10-20: " + sumOfRange(10, 20));
		
		System.out.println("35-45: " + sumOfRange(35, 45));
		
		System.out.println("100-200: " + sumOfRange(100, 200));
		
		System.out.println("10,20,30: " + minValue(10, 30, 5));
		
		System.out.println("10,20,30: " + maxValue(10, 30, 5));

	}
	
	//design a method that takes 3 int values, and prints min and max values
	//name: minMax
	//parameters: number1, number2, number3
	//return : the max value
	public static int minValue(int number1, int number2, int number3) {
		int min = number1;
		if(number2 < min) {
			min = number2;
		}else if(number3 < min) {
			min = number3;
		}
		return min;
	}
	
	private static int maxValue(int number1, int number2, int number3) {
		int max = number1;
		if(number2 > max) {
			max = number2;
		}else if(number3 > max) {
			max = number3;
		}
		return max;
	}
	
	
	//a method calculates the sum of range a to b
	private static int sumOfRange(int rangeLeft, int rangeRight) {
		int sum = 0;
		
		for (int i = rangeLeft; i <= rangeRight; i++) {
			sum += i;//sum = sum + i
		}
		
		return sum;
	}

}
