package chapter_4;

import java.util.*;

public class SubStringEmail {

	public static void main(String[] args) {

		// ask user to enter the email address
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an email address: ");
		String email = input.next();
		System.out.println(email + " entered...");

		int reference = email.indexOf('@');
		String username = email.substring(0, reference); // username
		String domain = email.substring(reference + 1); // domain

		System.out.println("Username: " + username);
		System.out.println("Domain: " + domain);
		input.close();
	}

}
