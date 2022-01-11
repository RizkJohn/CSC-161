package chapter_5;
import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userChoice = 0;
		
		do {
			System.out.println("Menu");
			System.out.println("1. Call the customer");
			System.out.println("2. Text");
			System.out.println("3. E-mail");
			System.out.println("4. Quit");
			System.out.print("Your selection: ");
			userChoice = input.nextInt();
		}while(userChoice < 1 || userChoice > 4);
		
		System.out.println("You selected " + userChoice);
		
	}

}
