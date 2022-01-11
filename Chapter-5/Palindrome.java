package chapter_5;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		//get a word from user
		Scanner input = new Scanner(System.in);
		String target;
		System.out.print("Please enter a word: ");
		target = input.nextLine();
		target = target.toLowerCase();
		
		//check first and last symbols
		//continue checking until you point to the middle
		
		int left = 0; //first index value
		int right = target.length() - 1;
		boolean isPalindrome = true;
		
		while (left < right) {
			//while looping, check the symbols! if they're equal!
			if (target.charAt(left) != target.charAt(right)) {
				isPalindrome = false;
				System.out.println("not a palindrome, try again");
				break;	
			}
			// move to the next position
			left++;
			right--;
		}
		//it's a palindrome...
		if(isPalindrome == true) {
		System.out.println("this is a palindrome");	
		}
		
	}

}
