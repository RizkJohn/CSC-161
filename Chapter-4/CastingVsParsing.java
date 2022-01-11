package chapter_4;

public class CastingVsParsing {

	public static void main(String[] args) {
		String str1 = "John"; // double quote for Strings
		System.out.println(str1);

		char char1 = 'X'; // single quote for characters
		System.out.println(char1);

		int age = 20; // no quotes for numbers!!!
		System.out.println(age);

		double value = 23.99;
		System.out.println(value);

		String strNumber1 = "10";
		System.out.println(strNumber1);

		String strNumber2 = "89";
		System.out.println(strNumber1 + strNumber2);

		int number1 = Integer.parseInt(strNumber1);
		int number2 = Integer.parseInt(strNumber2);
		System.out.println(number1 + number2);

		String cost = "This item costs $13.99";
		int reference = cost.indexOf('$');
		String subString = cost.substring(reference + 1); // extracts the dollar value
		double dollarValue = Double.parseDouble(subString);
		System.out.println("7 item costs: " + (7 * dollarValue));

	}

}
