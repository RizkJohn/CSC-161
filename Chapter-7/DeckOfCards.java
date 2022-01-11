package chapter_7;

public class DeckOfCards {

	public static void main(String[] args) {
		// The problem is to write a program that picks four cards
		// randomly from a deck of 52 cards
		
		int [] deck = new int[52];
		String [] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		//initialize the array of decks
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		//shuffle the cards in the deck
		for(int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * deck.length);
			
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		for(int i = 0; i < 5; i++) {
			String mySuit = suits[deck[i] / 13]; //integer division
			String myRank = ranks[deck[i] % 13];
			System.out.println((i+1) + ": You have " + myRank + " of " + mySuit);
		}

	}

}
