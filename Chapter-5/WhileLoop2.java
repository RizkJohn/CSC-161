package chapter_5;
import java.util.*;
public class WhileLoop2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//while loop is used when you have a condition that defines the loop
		//for loop is used when you know how many times you will need a loop
		
		//this application prints a menu on the screen
		//and loop until the user enters a correct option is given...
		int selected = 0;
		while (selected > 3 || selected < 1) {
		System.out.println("Menu:");
		System.out.println("1. Add new item");
		System.out.println("2. Delete an item");
		System.out.println("3. Quit");
		System.out.print("Please pick an option: ");
		selected = input.nextInt();
		}
		System.out.println("You selected option " + selected);

	}

}
