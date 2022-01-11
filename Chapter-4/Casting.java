package chapter_4;

public class Casting {

	public static void main(String[] args) {
		//casting numerical values
		int intValue = 10;
		System.out.println("int value: " + intValue);
		double doubleValue = (double) intValue;
		System.out.println("double value: " + doubleValue);
		
		String str1 = "10";
		String str2 = "20";
		System.out.println(str1 + str2); //this is not addition, it;s concatination...
		
		String str3 = "100";
		String str4 = "10.75";
		
		
		int intStr3 = Integer.parseInt(str3);
		System.out.println("intStr3: " + intStr3);
		System.out.println("intStr3 * 2: " + (intStr3 * 2));
		
		double dblStr4 = Double.parseDouble(str4);
		System.out.println("dblStr4 * 2: " + (dblStr4 * 2));

	}

}
