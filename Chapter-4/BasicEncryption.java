package chapter_4;
import java.util.*;
public class BasicEncryption {

	public static void main(String[] args) {
		// this app takes a max 10 letter word/sentence, and encrypts/decrypts the words/sentence
		// encryption will simply shift symbols by an integer value...
		
		// ask user to enter a word/sentence
		
		// replace every character with corresponding  shifted version
		Scanner input = new Scanner(System.in);
		
		// let's work with only words...
		System.out.print("Please enter a word: ");
		String userInput = input.next();
		String allLowerCase = userInput.toUpperCase();
		
		System.out.print("Enter encryption shift value: ");
		int shiftValue = input.nextInt();
		
		char first = allLowerCase.charAt(0);
		char second = allLowerCase.charAt(1);
		char third = allLowerCase.charAt(2);
		char fourth = allLowerCase.charAt(3);
		char fifth = allLowerCase.charAt(4);
		
		first = ++first;
		second = ++second;
		third = ++third;
		fourth = ++fourth;
		fifth = ++fifth;
		
		System.out.println("encrypted: " + first + second + third + fourth + fifth);
		
		//decrypt the word back...
		first = --first;
		second = --second;
		third = --third;
		fourth = --fourth;
		fifth = --fifth;
		
		System.out.println("decrypted: " + first + second + third + fourth + fifth);
	}

}
