package chapter_5;
import java.util.*;
public class LoginCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//this application ask username and password,
		//and allows user to enter them a max of 4 times.
		String actualUsername = "jriz";
		String actualPassword = "abc123";
		
		for(int i = 0; i < 4; i++) {
		
		//ask user to enter username
		//username is not case-sensitive
		System.out.print("Please enter your username: ");
		String username = input.next();
		
		
		//ask user to enter password
		//however, passwords are case-sensitive!!!
		System.out.print("Password: ");
		String password = input.next();
		
		//if username or password is wrong, ask again .. 4 times max!
		if(username.compareToIgnoreCase(actualUsername) == 0 && password.compareTo(actualPassword) == 0) {
			System.out.println("Cool! you're in!");
			break; //breaks the loop
		}else {
			System.out.println("Username or password is incorrect, try again!");
		}
		
		}

	}

}
