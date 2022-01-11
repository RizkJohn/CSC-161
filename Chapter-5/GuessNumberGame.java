package chapter_5;
import java.util.*;
public class GuessNumberGame {

	public static void main(String[] args) {
		//generate a random number between 1-100
		Scanner input = new Scanner(System.in);
		
		//ask user how many times s/he wants to play the game
		System.out.print("How many times would you like to play? ");
		int numberOfGames = input.nextInt();
		
		for (int i = 0; i < numberOfGames; i++) {
		int target = (int)(Math.random() * 10) + 1;
		//ask user to guess the number a max of 5 times!!
		int numberOfGuesses = 0; //initialize the number of tries
		
		boolean success = false;
		
		while(numberOfGuesses < 3) {
			System.out.print("Guess a number between 1 and 10: ");
			int yourNumber = input.nextInt();
			
			if (yourNumber == target) {
				System.out.println("Wow! you got it! ");
				success = true;
			}else if (yourNumber < target) {
				System.out.println("Oops! your guess is low...");
				success = false;
			}else {
				System.out.println("Oops! your guess is high...");
				success = false;
				
			}
			numberOfGuesses++;
			}//end of While
		if (success == true) {
			System.out.println("Congratulations! you won!");
		}else {
			System.out.println("Sorry, better luck next time...");
		}
		
		}//end of For
		System.out.println("Thanks for playing!!");
					
		
		

	}//end of Main

}//end of Class
