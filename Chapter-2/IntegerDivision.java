package chapter_2;

public class IntegerDivision {

	public static void main(String[] args) {
		
		//even though I typed 5, it is actually 5.0
		//because its data type is double
		double amount = 5;
		
		System.out.println(amount / 2);
		
		//integer division...
		System.out.println(5/2);
		
		//floating point division
		System.out.println(5.0/2);
		System.out.println(5/2.0);
		
		double var = 2.75;
		System.out.println((int)var);

	}

}
