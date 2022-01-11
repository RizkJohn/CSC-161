package chapter_6;

public class FirstProblem {

	public static void main(String[] args) {
		
		//Find the sum of integers from 1 to 10, from 20 to 30, and
		//from 35 to 45, respectively.
		int oneToTen = 0;
		int twentyToThirty = 0;
		int thirtyfiveToFortyfive = 0;
		
		for (int i = 1; i < 11; i++) {
				oneToTen = oneToTen + 1;
		}
		System.out.println("Sum 1 to 10: " + oneToTen);
		
		for (int i = 20; i < 31; i++) {
			twentyToThirty = twentyToThirty + i;
		}
		System.out.println("Sum 20 to 30: " + twentyToThirty);
		
		for (int i = 35; i < 46; i++) {
			thirtyfiveToFortyfive = thirtyfiveToFortyfive + i;
		}
		System.out.println("Sum 35 to 45: " + thirtyfiveToFortyfive);

	}

}
