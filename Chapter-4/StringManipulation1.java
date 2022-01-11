package chapter_4;

import java.util.*;

public class StringManipulation1 {

	public static void main(String[] args) {

		String actualUsername = "JOHNR";
		String actualpassword = "abc123";

		String username = "";
		String password = "";

		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		username = input.next();
		username = username.toUpperCase();

		System.out.println("username entered: " + username);

		System.out.print("Password: ");
		password = input.next();

		System.out.println("password entered: " + password);

		if (username.equals(actualUsername) && password.equals(actualpassword)) {
			System.out.println("You're in!");
		} else {
			System.out.println("username or password does not match");
		}
		input.close();
	}

}
