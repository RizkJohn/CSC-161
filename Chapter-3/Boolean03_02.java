package chapter_3;

import java.util.Scanner;

public class Boolean03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
		double radius;
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextDouble();
		double area = radius * radius * PI;
		if (radius >= 0) {
			System.out.print("The area for the circle of" + " radius " + radius + " is " + area);
		} else {
			System.out.print("Error: Negative input");
		}
		input.close();
	}

}
