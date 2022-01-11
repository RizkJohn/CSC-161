package chapter_4;
import java.util.*;
public class OrderTwoCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//how can i order two city names alphabetically?
		
		//ask user to enter first city name
		System.out.print("Enter the first city name: ");
		String firstCity = input.nextLine();
		
		//ask user to enter second city name
		System.out.print("Enter the second city name: ");
		String secondCity = input.nextLine();
		
		//these values are String! use compareTo() method to order them!
		//compareTo(other): returns +int if this > other, 
		//returns 0, if this = other
		//returns -int if this < other
		if (firstCity.compareTo(secondCity) < 0) {
			System.out.println(firstCity + " then " + secondCity);
		}else if (firstCity.compareTo(secondCity) > 0) {
			System.out.println(secondCity + " then " + firstCity);
		}else {
			System.out.println("The same city names you entered!");
		}
		
		if (firstCity.compareToIgnoreCase(secondCity) < 0) {
			System.out.println(firstCity + " then " + secondCity);
		}else if (firstCity.compareToIgnoreCase(secondCity) > 0) {
			System.out.println(secondCity + " then " + firstCity);
		}else {
			System.out.println("The same city names you entered!");
		}

	}

}
