package chapter_7;
public class Calculator {

	public static void main(String[] args) {
		//this app takes three arguments,
		//first argument is a number,
		//second argument is a operator, +-*/
		//third argument is a second number
		//java calculator 3 * 4 ==
		//12
		double firstNumber = Double.parseDouble(args[0]);
		double secondNumber = Double.parseDouble(args[2]);
		double result = 0.0;
		char operator = args[1].charAt(0);
		
		switch(operator) {
		case '+':
			result = firstNumber + secondNumber;
			break;
		case '*':
			result = firstNumber * secondNumber;
			break;
		case '/':
			result = firstNumber / secondNumber;
			break;
		case '-':
			result = firstNumber - secondNumber;
			break;
		default:
			System.out.println("Invalid operator!!!");
		}
		System.out.println("Result: " + result);

	}

}

