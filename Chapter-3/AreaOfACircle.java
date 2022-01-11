package chapter_3;

import java.util.*;

public class AreaOfACircle {

	public static void main(String[] args) {

		// ask user to enter a radius value, floating point value.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the radius value? ");
		double radius = keyboard.nextDouble();

		// if the value (radius is >= 0, then calculate the area, and print the result
		if (radius >= 0) {
			// radius is valid, let's calculate and show the area
			// area = radius * radius * PI
			double area = Math.PI * Math.pow(radius, 2);
			System.out.println("Area is " + area);
		} else {
			// false condition
			System.out.println("Value of radius must be positive");
		}
		keyboard.close();
	}

}
