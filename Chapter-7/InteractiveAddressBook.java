package chapter_7;
import java.util.*;
public class InteractiveAddressBook {

	public static void main(String[] args) {
		
		int size = 100;
		int lastItemIndex = -1;
		
		String[] lastNames = new String[size];
		String[] firstNames = new String[size];
		String[] emails = new String[size];
		String[] phoneNumber = new String[size];
		
		//call the external method to print the addressbook
		inputData(size, lastItemIndex, lastNames, firstNames, emails, phoneNumber);
		
		
		
		
		printAddressBook(size, lastItemIndex, lastNames, firstNames, emails, phoneNumber);
		

	}
	
	private static void inputData(int size, int lastItemIndex, String[] lastNames, String[] firstNames, String[] emails,
			String[] phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	//write a new method to print the contents of the address book
	private static void printAddressBook(int arraySize, int lii, String [] ln,
			String[] fn, String[] em, String[] ph ) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the following information for the user:");
		System.out.print("First Name: ");
		fn[lii + 1] = input.next();
		System.out.print("Last Name: ");
		ln[lii + 1] = input.next();
		System.out.print("Email: ");
		em[lii + 1] = input.next();
		System.out.print("Phone Number: ");
		ph[lii + 1] = input.next();
		
		System.out.println("This is the content of your addressbook:");
		for(int i = 0; i < arraySize; i++) {
			if(ln[i] == null) {
				break;
			}
			System.out.println(ln[i] + ", " + fn[i] + " " + em[i] + " " + ph[i] );
		}
		
	}

}
