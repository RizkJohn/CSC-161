package chapter_4;

import java.util.*;

public class MathExample1 {

	public static void main(String[] args) {

		// calculate area and circumference of a circle

		// ask user to enter the radius
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		double radius = keyboard.nextDouble();

		// use Math class, calculate the area
		// area = pi * r^2
		double area = Math.PI * Math.pow(radius, 2);

		// use Math class, calculate the circumference
		// circumference = 2 * PI * r
		double circumference = 2 * Math.PI * radius;

		// print out the results
		System.out.println("Radius: " + radius + " Area: " + area + " Circumference: " + circumference);
		keyboard.close();

	}

}
