package chapter_3;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// print a list of possible status information on the screen
		System.out.println("Please select your filing status");
		System.out.println("1. Single filer");
		System.out.println("2. Married filing jointly");
		System.out.println("3. Married filing separately");
		System.out.println("4. Head of houshold");

		Scanner keyboard = new Scanner(System.in);

		// ask user to select proper status value
		System.out.print("Enter your filing status: ");
		int filingStatus = keyboard.nextInt();
		System.out.println("Your filing status: " + filingStatus);

		// ask user to enter taxable amount
		System.out.print("Enter the taxable income: ");
		double taxableIncome = keyboard.nextDouble();
		System.out.println("Taxable amount: " + taxableIncome);

		double totalMarginalTax = 0.0;

		// according to status AND taxable amount, calculate the tax value...
		if (filingStatus == 1) {
			if (taxableIncome <= 8350) {
				// 10%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
			} else if (taxableIncome <= 33950) {
				// 15%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 8350) * 0.15);
			} else if (taxableIncome <= 82250) {
				// 25%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((33950 - 8350) * 0.15);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 33950) * 0.25);
			} else if (taxableIncome <= 171550) {
				// 28%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((33950 - 8350) * 0.15);
				totalMarginalTax = totalMarginalTax + ((82250 - 33950) * 0.25);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 82250) * 0.28);
			} else if (taxableIncome <= 372950) {
				// 33%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((33950 - 8350) * 0.15);
				totalMarginalTax = totalMarginalTax + ((82250 - 33950) * 0.25);
				totalMarginalTax = totalMarginalTax + ((171550 - 82250) * 0.28);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 171550) * 0.33);
			} else if (taxableIncome >= 372951) {
				// 35%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((33950 - 8350) * 0.15);
				totalMarginalTax = totalMarginalTax + ((82250 - 33950) * 0.25);
				totalMarginalTax = totalMarginalTax + ((171550 - 82250) * 0.28);
				totalMarginalTax = totalMarginalTax + ((372950 - 171550) * 0.33);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 372950) * 0.35);
			}
		} else if (filingStatus == 2) {
			if (taxableIncome <= 16700) {
				// 10%
				totalMarginalTax = totalMarginalTax + (16700 * 0.10);

			} else if (taxableIncome <= 67900) {
				// 15%
				totalMarginalTax = totalMarginalTax + (16700 * 0.10);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 16700) * 0.15);
			} else if (taxableIncome <= 137050) {
				// 25%
				totalMarginalTax = totalMarginalTax + (16700 * 0.10);
				totalMarginalTax = totalMarginalTax + ((67900 - 16700) * 0.15);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 67900) * 0.25);
			} else if (taxableIncome <= 208850) {
				// 28%
				totalMarginalTax = totalMarginalTax + (16700 * 0.10);
				totalMarginalTax = totalMarginalTax + ((67900 - 16700) * 0.15);
				totalMarginalTax = totalMarginalTax + ((137050 - 67900) * 0.25);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 137050) * 0.28);
			} else if (taxableIncome <= 372950) {
				// 33%
				totalMarginalTax = totalMarginalTax + (16700 * 0.10);
				totalMarginalTax = totalMarginalTax + ((67900 - 16700) * 0.15);
				totalMarginalTax = totalMarginalTax + ((137050 - 67900) * 0.25);
				totalMarginalTax = totalMarginalTax + ((208850 - 137050) * 0.28);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 208850) * 0.33);

			} else if (taxableIncome >= 372951) {
				// 35%
				totalMarginalTax = totalMarginalTax + (16700 * 0.10);
				totalMarginalTax = totalMarginalTax + ((67900 - 16700) * 0.15);
				totalMarginalTax = totalMarginalTax + ((137050 - 67900) * 0.25);
				totalMarginalTax = totalMarginalTax + ((208850 - 137050) * 0.28);
				totalMarginalTax = totalMarginalTax + ((372950 - 208850) * 0.33);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 372950) * 0.35);
			}
		} else if (filingStatus == 3) {
			if (taxableIncome <= 8350) {
				// 10%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
			} else if (taxableIncome <= 33950) {
				// 15%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 8350) * 0.15);

			} else if (taxableIncome <= 68525) {
				// 25%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((33950 - 8350) * 0.15);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 33950) * 0.25);
			} else if (taxableIncome <= 104425) {
				// 28%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((33950 - 8350) * 0.15);
				totalMarginalTax = totalMarginalTax + ((68525 - 33950) * 0.25);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 68525) * 0.28);

			} else if (taxableIncome <= 186475) {
				// 33%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((33950 - 8350) * 0.15);
				totalMarginalTax = totalMarginalTax + ((68525 - 33950) * 0.25);
				totalMarginalTax = totalMarginalTax + ((104425 - 68525) * 0.28);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 104425) * 0.33);
			} else if (taxableIncome >= 186475) {
				// 35%
				totalMarginalTax = totalMarginalTax + (8350 * 0.10);
				totalMarginalTax = totalMarginalTax + ((33950 - 8350) * 0.15);
				totalMarginalTax = totalMarginalTax + ((68525 - 33950) * 0.25);
				totalMarginalTax = totalMarginalTax + ((104425 - 68525) * 0.28);
				totalMarginalTax = totalMarginalTax + ((186475 - 104425) * 0.33);
				totalMarginalTax = totalMarginalTax + ((taxableIncome - 186475) * 0.35);
			}
		} else if (filingStatus == 4) {
			if (taxableIncome <= 11950) {
				// 10%
			} else if (taxableIncome <= 45500) {
				// 15%
			} else if (taxableIncome <= 117450) {
				// 25%
			} else if (taxableIncome <= 190200) {
				// 28%
			} else if (taxableIncome <= 372950) {
				// 33%
			} else if (taxableIncome >= 372951) {
				// 35%
			}
		}
		System.out.print("The total tax you need to pay: " + totalMarginalTax);
		keyboard.close();
	}

}
