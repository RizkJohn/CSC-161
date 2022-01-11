package chapter_6;

public class MethodOverload {

	public static void main(String[] args) {
		
		System.out.println(minValue(1, 5, 8));
		System.out.println(minValue(1.1, 5.2, 8.5));
		System.out.println(minValue(1.1, 5.2, 8.5));
		System.out.println(minValue(1.1, 5.2, 8.5));

	}
	
	
	//this method works well with INTEGER NUMBERS
	public static int minValue(int number1, int number2, int number3) {
		int min = number1;
		if(number2 < min) {
			min = number2;
		}else if(number3 < min) {
			min = number3;
		}
		return min;
	}
	
	//this method works well with DOUBLE numbers
	public static double minValue(double number1, double number2, double number3) {
		double min = number1;
		if(number2 < min) {
			min = number2;
		}else if(number3 < min) {
			min = number3;
		}
		return min;
	}
	
	//this method works well with FLOAT numbers
	public static float minValue(float number1, float number2, float number3) {
		float min = number1;
		if(number2 < min) {
			min = number2;
		}else if(number3 < min) {
			min = number3;
		}
		return min;
	}
	
	
	//this method works well with LONG numbers
	public static long minValue(long number1, long number2, long number3) {
		long min = number1;
		if(number2 < min) {
			min = number2;
		}else if(number3 < min) {
			min = number3;
		}
		return min;
	}

}
