package chapter_2;

public class ComputeArea {
	
	//This program calculates the area of a circle
	
	public static void main(String[] args) {
		
		//declare variables for further calculations
		double radius;
		double area;
		
		//assign a value to radius variable
		radius = 20;
		
		//calculate the area
		area = radius * radius * 3.14159;
		//area = radius * radius * Math.PI;
		//area = Math.pow(radius, 2) * Math.PI;
		
		//print the area for the user on screen
		System.out.println("The area : " + area );
		
	}

}
