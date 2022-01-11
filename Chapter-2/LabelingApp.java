package chapter_2;
import java.util.Scanner;

public class LabelingApp {

	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		String streetAddress;
		String city;
		String state;
		int zipCode;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your first name? ");
		firstName = keyboard.next();
		
		System.out.print("What is your last name?");
		lastName = keyboard.next();
		keyboard.nextLine();
		
		System.out.print("What is your street address?");
		streetAddress = keyboard.nextLine();
		//keyboard.nextLine();
		
		System.out.print("City please: ");
		city = keyboard.next();
		keyboard.nextLine();
		
		System.out.print("State: ");
		state = keyboard.next();
		
		System.out.print("Zipcode: ");
		zipCode = keyboard.nextInt();
		
		System.out.println(firstName + " " + lastName);
		System.out.println(streetAddress + ", " + city + " , " + state + " " + zipCode);

	}

}
