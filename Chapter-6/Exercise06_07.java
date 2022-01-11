package chapter_6;
import java.util.*;
public class Exercise06_07 {

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
	    double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (12 * years));
		return futureInvestmentValue;
	}
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the investment amount: ");
	    double investmentAmount = input.nextDouble();
	    System.out.print("Enter the annual interest rate: ");
	    double monthlyInterestRate = input.nextDouble();
	    double futureInvestmentValue;
	    for (int years = 1; years < 31; years++){
	        System.out.println("Year " + years + ": " + futureInvestmentValue(investmentAmount, monthlyInterestRate / 1200, years));
	    }
	}
}
