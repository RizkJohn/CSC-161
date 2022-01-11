package chapter_2;

import java.util.*; //import anything I need from util package

public class ComputeAreaWithInteractivity {

	public static void main(String[] args) {
		
		//declare variables for further calculations
		double radius;
		double area;
		
		//ask user to enter a radius value
		System.out.print("Please enter the radius: ");
		Scanner keyboard = new Scanner(System.in); //create the keyboard reader (scanner)
		radius = keyboard.nextDouble();
		
		
		//calculate the area
		area = radius * radius * 3.14159;
		//area = radius * radius * Math.PI;
		//area = Math.pow(radius, 2) * Math.PI;
		
		//print the area for the user on screen
		System.out.println("The area : " + area );
		

	}

}
