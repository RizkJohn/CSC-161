package chapter_4;
import java.util.*;
public class FirstLastNameExtractor {

	public static void main(String[] args) {
		//ask user to enter first name and last name as ONE sentence
		System.out.print("Enter first and last name: ");
		Scanner input = new Scanner(System.in);
		String fullName = input.nextLine();
		
		//extract and display first name
		int reference = fullName.indexOf(' ');
		String firstName = fullName.substring(0, reference);
		System.out.println("First Name: " + firstName);
		
		//extract and display last name
		String lastName = fullName.substring(reference + 1);
		System.out.println("Last Name: " + lastName);
		

	}

}
