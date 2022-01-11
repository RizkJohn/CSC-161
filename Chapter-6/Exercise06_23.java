package chapter_6;
import java.util.*;
public class Exercise06_23 {
	public static int count(String str, char a) {
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String str = in.nextLine();
	    System.out.print("Enter a character: ");
	    char a = in.next().charAt(0);
	    System.out.println("The number of occurrences of " + a + " in " + str + " is " + count(str, a));
	    
	     
	}

}
