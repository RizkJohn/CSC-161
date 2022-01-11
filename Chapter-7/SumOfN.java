package chapter_7;

public class SumOfN {

	public static void main(String[] args) {
		
		System.out.println("Sum of first 1000000000 numbers is " + takeSum(1000000000));
		System.out.println("Sum of first 1000000000 numbers is " + takeSumFaster(1000000000));

	}
	
	//write a method that calculates the sum of n numbers
	private static double takeSum(double n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	private static double takeSumFaster(double n) {
		return ((n+1) * n) /2;
	}

}
