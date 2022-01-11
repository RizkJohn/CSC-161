package chapter_3;

import java.util.Scanner;

public class Section03_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int income;
		System.out.print("Enter your income: ");
		income = input.nextInt();
		if (income > 3000)
			if (income <= 4000)
				System.out.println("Income is greater than 3000");
			else if (income > 4000)
				System.out.println("Income is greater than 4000");
		System.out.print(Math.random() * 1E4);
		input.close();
	}
}
