package chapter_6;

public class MethodOverload2 {
	public static void main(String[] args) {
		int month = 9;
		int x = 1;
		int y = x++ + x;
		x *= y + 1;
		int j = 0;
		int i = ++j + j * 5;
		System.out.println(y);
	}



public static int minValue(int number1, int number2) {
	if(number1 < number2) {
		return number1;
	}else {
		return number2;
	}
}

public static int minValue(int number1, int number2, int number3) {
	int min = number1;
	if(number2 < min) {
		min = number2;
	}else if(number3 < min) {
		min = number3;
	}
	return min;
}
}
