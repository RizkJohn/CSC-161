package chapter_4;

public class OutputFormatting {

	public static void main(String[] args) {
		//

		double value = 17 / Math.PI;
		System.out.println(value);

		System.out.printf("The result is %f", value);
		System.out.println();
		
		System.out.printf("The result is %2.2f", value);
		System.out.println();
		
		double cost = 5.78823222;
		System.out.printf("The result is %2.2f", cost);
		System.out.println();
		System.out.println(cost);

	}

}
