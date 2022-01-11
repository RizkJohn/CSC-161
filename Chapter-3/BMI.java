package chapter_3;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		/*
		 * Body Mass Index (BMI) is a measure of health on weight. It can be calculated
		 * by taking your weight in kilograms and dividing by the square of your height
		 * in meters. The interpretation of BMI for people 16 years or older is as
		 * follows: BMI < 18.5: Underweight 18.5 <= BMI < 25.0: Normal 25.0 <= BMI <
		 * 30.0: Overweight 30.0 <= BMI: Obese
		 */
		Scanner keyboard = new Scanner(System.in);

		// ask user to enter weight : double
		System.out.print("What is your weight in pounds? ");
		double weight = keyboard.nextDouble();

		// ask user to enter height : float
		System.out.print("What is your height in inches? ");
		double height = keyboard.nextDouble();

		final double POUNDS_2_KGS = 0.45359237; // constant to multiply pound to convert to Kgs
		final double INCHES_2_METERS = 0.0254; // constant to multiply inches to meters

		// convert weight to kg
		weight = weight * POUNDS_2_KGS;

		// convert height to meters
		height = height * INCHES_2_METERS;
		// use the formula to calculate BMI = weight / (height * height)
		double BMI = weight / Math.pow(height, 2);

		// print the BMI value on screen
		System.out.println("BMI: " + BMI);

		String result = "";
		if (BMI < 18.5) {
			result = "Underweight";
		} else if (BMI < 25.0 && BMI >= 18.5) {
			result = "Normal";
		} else if (BMI < 30.0) {
			result = "Overweight";
		} else {
			result = "Obese";
		}

		System.out.println("My friend, you are " + result);
		keyboard.close();

	}

}
