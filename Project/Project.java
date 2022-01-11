
package project;
import java.util.*;

public class Project {

	/*
	 * This application creates and maintains a simple address book application
	 * person first name, middle name and last name are hold 3 String arrays
	 * person phone number in 1 string array
	 * person email address in 1 string array
	 * user can print, add(automatically expand), remove(and shift), modify entries
	 * */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> middleName = new ArrayList<String>();
		ArrayList<String> lastName = new ArrayList<String>();
		ArrayList<String> phoneNumber = new ArrayList<String>();
		ArrayList<String> email = new ArrayList<String>();
		
		firstName.add("Joe");
		middleName.add("Shmuck");
		lastName.add("Shmoe");
		phoneNumber.add("(732)-111-2222");
		email.add("joeshmoe@abc.com");
		
		firstName.add("John");
		middleName.add("James");
		lastName.add("Smith");
		phoneNumber.add("(732)-333-4444");
		email.add("johnsmith@abc.com");
		
		
		
		int menuSelection = 0;
		
		while(true) {
			menuSelection = mainMenu();

			switch(menuSelection) {
			case 1:
				System.out.println("Print Entries");

				
				for(int i = 0; i<lastName.size(); i++) {
					System.out.println(lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + phoneNumber.get(i) + " " + email.get(i));
				}

				break;
			case 2:
				System.out.println("Search by Lastname");
				System.out.print("Enter the Last Name: ");
				String searchLastName = input.next();
			
				for(int i = 0;i<lastName.size(); i++) {
				if (searchLastName.equals(lastName.get(i))) {
					System.out.println(lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + phoneNumber.get(i) + " " + email.get(i));
					}
				}
				break;
			case 3:
				System.out.println("Add new entry");
				
				System.out.print("Enter First Name: "); firstName.add(input.next());
				
				System.out.print("Enter Middle Name: "); middleName.add(input.next());
				
				System.out.print("Enter Last Name: "); lastName.add(input.next());
				
				System.out.print("Enter Phone Number: "); phoneNumber.add(input.next());
				
				System.out.print("Enter Email: "); email.add(input.next());
				
				System.out.println("New Entry: " + lastName.get(lastName.size()-1) + ", " + firstName.get(firstName.size()-1) + " " + middleName.get(middleName.size()-1) + " " + 					phoneNumber.get(phoneNumber.size()-1) + " " + email.get(email.size()-1));
				
				
				break;
			case 4:
				System.out.println("Delete entry");
				System.out.print("Enter the Last Name: ");
				String deleteLastName = input.next();
			
				for(int i = 0;i<lastName.size(); i++) {
				if (deleteLastName.equals(lastName.get(i))) {
					System.out.println(lastName.remove(i) + ", " + firstName.remove(i) + " " + middleName.remove(i) + " " + phoneNumber.remove(i) + " " + email.remove(i));
					System.out.println("Entry has been deleted!");
					}
				}
				break;
			case 5:
				System.out.println("Modify entry");
				int modify = 0;
				while(true) {
					modify = modifyMenu();
					switch(modify) {
					case 1:
						System.out.println("Find Entry");
						for(int i = 0; i<lastName.size(); i++) {
							System.out.println(lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + phoneNumber.get(i) + " " + email.get(i));
						}
						break;
					case 2:
						System.out.println("Change First Name");
						System.out.print("Enter First Name: ");
						String originalFirstName = input.next();
						String newFirstName = null;
						int f = 0;
						f++;
						for(int i = 0;i<firstName.size(); i++) {
							if (originalFirstName.equals(firstName.get(i))) {
								System.out.println(lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + phoneNumber.get(i) + " " + email.get(i));
								System.out.print("Enter new First Name: ");
								newFirstName = input.next();
								
								for(int k = 0;k<firstName.size(); k++) {
									if (originalFirstName.equals(firstName.get(k))) {
										firstName.set(k, newFirstName);
										System.out.println("New First Name: " + newFirstName);
										System.out.println("Modified Entry: " + lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + 											phoneNumber.get(i) + " " + email.get(i));
										}
									}
								} 
							} if (originalFirstName != firstName.get(f) && f < firstName.size() && firstName.get(f) != newFirstName) {
								System.out.println("No Entry with the first name " + originalFirstName + " could be found, try again!");
							}
						break;
					case 3:
						System.out.println("Change Last Name");
						System.out.print("Enter Last Name: ");
						String originalLastName = input.next();
						String newLastName = null;
						int l = 0;
						l++;
						for(int i = 0;i<lastName.size(); i++) {
							if (originalLastName.equals(lastName.get(i))) {
								System.out.println(lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + phoneNumber.get(i) + 
								" " + email.get(i));
								System.out.print("Enter new Last Name: ");
								newLastName = input.next();
								
								for(int k = 0;k<lastName.size(); k++) {
									if (originalLastName.equals(lastName.get(k))) {
										lastName.set(k, newLastName);
										System.out.println("New Last Name: " + newLastName);
										System.out.println("Modified Entry: " + lastName.get(i) + ", " + firstName.get(i) + " " + 											middleName.get(i) + " " + phoneNumber.get(i) + " " + email.get(i));
										}
									}
								} 
							} if (originalLastName != lastName.get(l) && l < lastName.size() && lastName.get(l) != newLastName) {
								System.out.println("No Entry with the last name " + originalLastName + " could be found, try again!");
							}
						break;
					case 4:
						System.out.println("Change Middle Name");
						System.out.print("Enter Middle Name: ");
						String originalMiddleName = input.next();
						String newMiddleName = null;
						int m = 0;
						m++;
						for(int i = 0;i<middleName.size(); i++) {
							if (originalMiddleName.equals(middleName.get(i))) {
								System.out.println(lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + phoneNumber.get(i) + 
								" " + email.get(i));
								System.out.print("Enter new Middle Name: ");
								newMiddleName = input.next();
								
								for(int k = 0;k<middleName.size(); k++) {
									if (originalMiddleName.equals(middleName.get(k))) {
										middleName.set(k, newMiddleName);
										System.out.println("New Middle Name: " + newMiddleName);
										System.out.println("Modified Entry: " + lastName.get(i) + ", " + firstName.get(i) + " " + 											middleName.get(i) + " " + phoneNumber.get(i) + " " + email.get(i));
										}
									}
								} 
							} if (originalMiddleName != middleName.get(m) && m < middleName.size() && middleName.get(m) != newMiddleName) {
								System.out.println("No Entry with the middle name " + originalMiddleName + " could be found, try again!");
							}
						break;
					case 5:
						System.out.println("Change Phone Number");
						System.out.print("Enter Phone Number: ");
						String originalPhoneNumber = input.next();
						String newPhoneNumber = null;
						int p = 0;
						p++;
						for(int i = 0;i<phoneNumber.size(); i++) {
							if (originalPhoneNumber.equals(phoneNumber.get(i))) {
								System.out.println(lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + phoneNumber.get(i) + 
								" " + email.get(i));
								System.out.print("Enter new Phone Number: ");
								newPhoneNumber = input.next();
								
								for(int k = 0;k<phoneNumber.size(); k++) {
									if (originalPhoneNumber.equals(phoneNumber.get(k))) {
										phoneNumber.set(k, newPhoneNumber);
										System.out.println("New First Name: " + newPhoneNumber);
										System.out.println("Modified Entry: " + lastName.get(i) + ", " + firstName.get(i) + " " + 											middleName.get(i) + " " + phoneNumber.get(i) + " " + email.get(i));
										}
									}
								} 
							} if (originalPhoneNumber != phoneNumber.get(p) && p < phoneNumber.size() && phoneNumber.get(p) != newPhoneNumber) {
								System.out.println("No Entry with the phone number " + originalPhoneNumber + " could be found, try again!");
							}
						break;
					case 6:
						System.out.println("Change Email");
						System.out.print("Enter Email: ");
						String originalEmail = input.next();
						String newEmail = null;
						int e = 0;
						e++;
						for(int i = 0;i<email.size(); i++) {
							if (originalEmail.equals(email.get(i))) {
								System.out.println(lastName.get(i) + ", " + firstName.get(i) + " " + middleName.get(i) + " " + phoneNumber.get(i) + 
								" " + email.get(i));
								System.out.print("Enter new Email: ");
								newEmail = input.next();
								
								for(int k = 0;k<email.size(); k++) {
									if (originalEmail.equals(email.get(k))) {
										email.set(k, newEmail);
										System.out.println("New Email: " + newEmail);
										System.out.println("Modified Entry: " + lastName.get(i) + ", " + firstName.get(i) + " " + 														middleName.get(i) + " " + phoneNumber.get(i) + " " + email.get(i));
										}
									}
								} 
							} if (originalEmail != email.get(e) && e < email.size() && email.get(e) != newEmail) {
								System.out.println("No Entry with the email " + originalEmail + " could be found, try again!");
							}
						break;
					}
					
					if(modify == 7) {
						break;
					}
				}
				break;
			case 6:
				System.out.println("Good bye!");
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
		}
		
		
	}
	

	private static int mainMenu() {
		//print the menu, return selected item
		System.out.print("**** A D D R E S S B O O K ****\n"
				+ "1. Print Entries\n"
				+ "2. Search by Lastname\n"
				+ "3. Add new entry\n"
				+ "4. Delete entry\n"
				+ "5. Modify entry\n"
				+ "6. Quit\n"
				+ "Your choice: ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	

	
	private static int modifyMenu() {
		System.out.print("**** M O D I F Y - E N T R Y ****\n"
				+ "1. Find Entry\n"
				+ "2. Change First Name\n"
				+ "3. Change Last Name\n"
				+ "4. Change Middle Name\n"
				+ "5. Change Phone Number\n"
				+ "6. Change E-mail\n"
				+ "7. Return to Main Menu\n"
				+ "Your choice: ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
}
